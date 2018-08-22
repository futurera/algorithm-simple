const reverse = input => {
    const result = []; 
    for (let i = input.length - 1; i >= 0; i--) {
        result.push(input[i]);
    }
    return result;
}
