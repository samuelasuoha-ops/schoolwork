// for documentation see: https://www.npmjs.com/package/validator
const validator = require('validator');

// Validate a number
// return Not a number or else cast as Number and return
function valNum(num) {
    if (validator.isNumeric(num)) {
        return Number(num);
    }
    return NaN;
}

function calculate(a, b, operator) {

    // define vars and initialise with validated numbers
    let numA = valNum(a);
    let numB = valNum(b);
    let answer;

    switch (operator) {
        case '+':
            answer = numA + numB;
            break;
        case '-':
            answer = numA - numB;
            break;
        case '*':
            answer = numA * numB;
            break;
        case '/':
            answer = numA / numB;
            break;
        default:
            answer = NaN;
    }

    return {
        a: numA,
        b: numB,
        operator: operator,
        answer: answer
    };


}

// Module exports
// expose these functions
module.exports = {
    calculate
};