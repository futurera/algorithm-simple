import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhonePadNumberConverter {
	
	public String[] convert(String num) {
		List<String> results = new ArrayList<String>();
		convert("", num, results);
		return results.toArray(new String[0]);
	}
	
	private void convert(String base, String residual, List<String> results) {
		
		if (residual.length() == 0) {
			results.add(base);
		} else {
			Map<String, String> KeyPadMapping = initializeKeyPadMapping();
			char firstChar = residual.charAt(0);
			if (firstChar != '0' && firstChar != '1') {
				String mapResult = KeyPadMapping.get(residual.substring(0, 1));
				for(int i = 0; i < mapResult.length(); i++) {
					char newChar = mapResult.charAt(i);
					convert(base + newChar, residual.substring(1), results);
				}
			} else {
				convert(base, residual.substring(1), results);
			}
		}
	}
	
	private Map<String, String> initializeKeyPadMapping() {
		Map<String, String> numCharMap = new HashMap<String, String>();
		numCharMap.put("0", "");
		numCharMap.put("1", "");
		numCharMap.put("2", "abc");
		numCharMap.put("3", "def");
		numCharMap.put("4", "ghi");
		numCharMap.put("5", "jkl");
		numCharMap.put("6", "mno");
		numCharMap.put("7", "pqrs");
		numCharMap.put("8", "tuv");
		numCharMap.put("9", "xyz");
		return numCharMap;
	}
}
