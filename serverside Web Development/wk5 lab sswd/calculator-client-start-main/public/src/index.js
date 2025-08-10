
// import everything from fetchAPI.js
// This will allow resources to be referenced as api.BASE_URL, etc.
import * as api from './fetchAPIHelper.js';

// Call this function when Add button is clicked
async function calcAdd() {
  let numA = 0;
  let numB = 0;

  // use getElementById() to get values
  // To do: proper validation
  numA = Number(document.getElementById('inputA').value);
  numB = Number(document.getElementById('inputB').value);

  // call api to perform addition
  const add = await api.getDataAsync(`${api.BASE_URL}/add?a=${numA}&b=${numB}`);
  // display answer on page
  let answerText = `${add.a} + ${add.b} = ${add.answer}`;

  // Log to console (useful for debugging)
  console.log(answerText);

  // display answer
  document.getElementById('answer').innerText = answerText;
  return true;
}

async function calcSub() {
  let numA = 0;
  let numB = 0;

  // use getElementById() to get values
  // To do: proper validation
  numA = Number(document.getElementById('inputA').value);
  numB = Number(document.getElementById('inputB').value);

  // call api to perform addition
  const sub = await api.getDataAsync(`${api.BASE_URL}/subtract?a=${numA}&b=${numB}`);
  // display answer on page
  let answerText = `${sub.a} - ${sub.b} = ${sub.answer}`;

  // Log to console (useful for debugging)
  console.log(answerText);

  // display answer
  document.getElementById('answer1').innerText = answerText;
  return true;
}

async function calcMult() {
  let numA = 0;
  let numB = 0;

  // use getElementById() to get values
  // To do: proper validation
  numA = Number(document.getElementById('inputA').value);
  numB = Number(document.getElementById('inputB').value);

  // call api to perform addition
  const mult = await api.getDataAsync(`${api.BASE_URL}/multiply?a=${numA}&b=${numB}`);
  // display answer on page
  let answerText = `${mult.a} * ${mult.b} = ${mult.answer}`;

  // Log to console (useful for debugging)
  console.log(answerText);

  // display answer
  document.getElementById('answer2').innerText = answerText;
  return true;
}

async function calcDiv() {
  let numA = 0;
  let numB = 0;

  // use getElementById() to get values
  // To do: proper validation
  numA = Number(document.getElementById('inputA').value);
  numB = Number(document.getElementById('inputB').value);

  // call api to perform addition
  const div = await api.getDataAsync(`${api.BASE_URL}/divide?a=${numA}&b=${numB}`);
  // display answer on page
  let answerText = `${div.a} / ${div.b} = ${div.answer}`;

  // Log to console (useful for debugging)
  console.log(answerText);

  // display answer
  document.getElementById('answer3').innerText = answerText;
  return true;
}

// Implement the other calculator functions

function loadCalculator() {
// Add event listners to the buttons
document.getElementById('btnAdd').addEventListener('click', calcAdd);
document.getElementById('btnSubtract').addEventListener('click', calcSub);
document.getElementById('btnMultipy').addEventListener('click', calcMult);
document.getElementById('btnDivide').addEventListener('click', calcDiv);
}

export {
  loadCalculator,
  calcAdd,
  calcSub,
  calcMult,
  calcDiv
}

// load the script
loadCalculator();