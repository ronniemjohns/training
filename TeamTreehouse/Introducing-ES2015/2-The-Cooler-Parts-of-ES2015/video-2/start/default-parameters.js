'use strict';


/* prior to ES2015, you'd do default values like this:
function greet(name, timeOfDay) {
  name = name || 'Guil';
  timeOfDay = timeOfDay || 'Day';
  console.log(`Good ${timeOfDay}, ${name}!`);
}

    */

/* with ES2015, you just set it in the parameter list */
function greet(name =  'Guil', timeOfDay = 'Day') {
    console.log(`Good ${timeOfDay}, ${name}!`);
}

greet();

greet(undefined, 'Evening');