'use strict';

let classroom = new Set();

let stevenJ = {name: 'Steven', age: 22},
    sarah = {name: 'Sarah', age: 23},
    stevenS = {name: 'Steven', age: 22};

classroom.add(stevenJ);
classroom.add(sarah);
/*  set doesn't allow duplicates.  :)  */
classroom.add(sarah);
classroom.add(sarah);
classroom.add(sarah);
classroom.add(sarah);
classroom.add(sarah);
classroom.add(sarah);
classroom.add(sarah);
classroom.add(sarah);
classroom.add(sarah);


console.log(classroom);

if(classroom.has(stevenJ) ) {
    console.log('StevenJ is in the house!');
}

if(classroom.has(stevenS) ) {
    console.log('StevenS is in the house!');
}

console.log(`There are ${classroom.size} students in the class`);
/* create an array of students */
let arrayOfStudents = Array.from(classroom);
console.log(arrayOfStudents);

/* create a set of students */
let setOfStudents = new Set(arrayOfStudents);


classroom.delete(stevenJ);
console.log(`There are ${classroom.size} students in the class`);

