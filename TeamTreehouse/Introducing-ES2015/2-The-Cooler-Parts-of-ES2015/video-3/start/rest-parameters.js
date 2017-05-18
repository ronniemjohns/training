'use strict';

function myFunction(name, ...params) {
  console.log(name, params);
}

myFunction('bob', 'joe', 0, true);