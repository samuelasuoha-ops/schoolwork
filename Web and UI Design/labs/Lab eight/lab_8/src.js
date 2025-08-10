// Student ID: C00305107
// Name: Samuel Asuoha

// the ES6 variable declaration
let darkMode;

function start() {
    // to check the browser local storage for mode
    darkMode = localStorage.getItem("mode") === "dark";

    // to call the appropriate function based on darkMode value
    darkMode ? setDark() : setLight();
}

function changeMode() {
    // to toggle darkMode value
    darkMode = !darkMode;

    // to call the appropriate function based on darkMode value
    darkMode ? setDark() : setLight();
}

function setDark() {
    document.body.style.backgroundColor = "black";
    document.body.style.color = "white";
    document.getElementById("modeButton").style.backgroundColor = "white";
    document.getElementById("modeButton").style.color = "black";
    document.getElementById("modeButton").innerText = "Light Mode";

    // to save darkMode to local storage
    localStorage.setItem("mode", "dark");
}

function setLight() {
    document.body.style.backgroundColor = "white";
    document.body.style.color = "black";
    document.getElementById("modeButton").style.backgroundColor = "black";
    document.getElementById("modeButton").style.color = "white";
    document.getElementById("modeButton").innerText = "Dark Mode";

    localStorage.setItem("mode", "light");
}

function getMark() {
    const markInput = document.getElementById("markInput").value;
    displayMark(markInput);
}

function displayMark(mark) {
    let markDisplay = "";

    if (mark >= 70 && mark <= 100) {
        markDisplay = "Distinction";
    } else if (mark >= 63 && mark <= 69) {
        markDisplay = "Merit 1";
    } else if (mark >= 55 && mark <= 62) {
        markDisplay = "Merit 2";
    } else if (mark >= 40 && mark <= 54) {
        markDisplay = "Pass";
    } else if (mark < 40) {
        markDisplay = "Fail";
    } else {
        markDisplay = "Invalid Mark";
    }

    document.getElementById("markDisplay").innerText = markDisplay;
}

// to call start function when the page loads
start();