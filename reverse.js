const reverse = input => {
    const result = []; 
    for (let i = input.length - 1; i >= 0; i--) {
        result.push(input[i]);
    }
    return result;
}

const reverseWithoutNewArray = input => {
    const size = input.length;
    for (let i = 0; i <= size/2; i++) {
        const temp = input[i];
        input[i] = input[size - 1 - i];
        input[size - 1 - i] = temp;
    }
    return input;
}
