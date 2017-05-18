'use strict';

let myNumbers = [1,2,3,4,5,6];
/* prior to es2015, use a regular for loop
for (let i = 0; i < myNumbers.length; i++) {
    if(i === 3) {
        console.log("I'm on number 3!!!");
    }
  console.log(myNumbers[i]);
}

*/

/* with ES 5.1, use a for each on the array, but YOU CANNOT BREAK OUT OF THIS */
myNumbers.forEach(myNum => {
  if(myNum === 3) {
      console.log("I'm on number 3!!!");
  }
  console.log(myNum);
});


/* ES2015 introduces a for of loop, which you CAN break out of */
/* NOTE FOR OF IS ONLY FOR ARRAYS, sTRINGS, SETS, MAPS - TRY FOR IN IF IT'S FOR OBJECTS */
console.log('Starting ES2015 for of loop');
for(let myNum of myNumbers) {
    if(myNum === 3) {
        console.log("I'm on number 3!!!");
        break;
    }
    console.log(myNum);
}