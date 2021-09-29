const number1 = 103;
const number2 = 72;
const number3 = 189;
let nilaiMax = 1;
// Write a function called getMax to get the maximum value
const getMax = (a,b,c) => {
  if(number1 > number2 && number1 > number3){
    nilaiMax = number1;
  } else if(number2 > number1 && number2 > number3){
    nilaiMax = number2;
  } else {
    nilaiMax = number3;
  }
  return nilaiMax;
}

// Print "The maximum value is __"
console.log(`The maximum value is ${getMax(number1,number2,number3)}`);
