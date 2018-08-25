namespace FuturEraAlgorithm
{
    public class ConnectStringCheker
    {
        
        public static bool isConnected(string[] input) {
            if (input.Length == 0 || input.Length == 1) {
                //nothing to connect with if no element or only 1 element
                return false;
            }
            for(int i = 1; i < input.Length; i++) {
                string prev = input[i-1];
                string curr = input[i];
                int prevLen = prev.Length;
                if (prev[prevLen - 1] != curr[0]) {
                    return false;
                }
            }
            return true;
        }
        
        public static void Main(string[] args)
        {
            //Your code goes here
            Console.WriteLine(isConnected(new string[] {"abc", "cba", "aaa"}));
            Console.WriteLine(isConnected(new string[] {"abc", "cba", "cba"}));
            Console.WriteLine(isConnected(new string[] {"abc"}));
            Console.WriteLine(isConnected(new string[1]));
        }
    }
}
