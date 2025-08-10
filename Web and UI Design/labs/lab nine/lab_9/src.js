// Student ID: C00305107, Full Name: Samuel Asuoha, Date: 20/04/2024

function divide() {
    //used parseFloat to parse the input values to ensure they are treated as numbers
    const one = parseFloat(document.getElementById("numberOne").value);
    const two = parseFloat(document.getElementById("numberTwo").value);
    // added to check if inputs are valid numbers
    if (isNaN(one) || isNaN(two)) {
        document.getElementById("errors").innerHTML = "Please enter valid numbers.";
        return;
    }
    // added to check if the divisor is not zero to prevent division by zero errors.
    if (two === 0) {
        document.getElementById("errors").innerHTML = "Cannot divide by zero.";
        return;
    }
    const sum = one / two;
    document.getElementById("result").innerHTML = sum;
}

function multiply() {
    //used parseFloat to parse the input values to ensure they are treated as numbers
    const one = parseFloat(document.getElementById("numberOne").value);
    const two = parseFloat(document.getElementById("numberTwo").value);
    // added to check if inputs are valid numbers
    if (isNaN(one) || isNaN(two)) {
        document.getElementById("errors").innerHTML = "Please enter valid numbers.";
        return;
    }
    const sum = one * two;
    document.getElementById("result").innerHTML = sum;
}
// Modified to handle the case where the operation type is selected but not found in the HTML
function changeOperation() {
    const operation = document.getElementById("operationType").value; 
    // to write an error message since the function call will fail
    document.getElementById("errors").innerHTML = "Error: The operation cannot be performed.";
}
// added to handle image loading errors
function handleImageError() {
    // to display an error message when image resource cannot be loaded
    document.getElementById("errors").innerHTML = "Error: The image resource cannot be found.";
}