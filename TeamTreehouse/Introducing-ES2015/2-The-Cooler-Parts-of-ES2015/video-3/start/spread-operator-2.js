'use strict';

function myFunction (name, iceCreamFlavor) {
  console.log(`${name} really likes ${iceCreamFlavor} ice cream.`)
}

let args = ['Gabe', 'Vanilla'];
/* functions as a split */
myFunction(...args);