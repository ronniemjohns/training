'use strict';

let classroom = new Map();

let stevenJ = {name: 'Steven', age: 22},
    sarah = {name: 'Sarah', age: 23},
    stevenS = {name: 'Steven', age: 22};

classroom.set('stevenJ', stevenJ);
classroom.set('sarah', sarah);
classroom.set('stevenS', stevenS);

console.log(`Classroom size: ${classroom.size}`);

if(classroom.has('stevenJ')) {
    console.log('StevenJ is in the classroom');
}

console.log('sarah:', classroom.get('sarah'));

/* for of loop turns the map into a 2 dimensional array (key, value) */
for(let student of classroom) {
    console.log(`'${student[0]}' :  ${student[1].name} is ${student[1].age} years old.`);
}


classroom.clear();
console.log(`Classroom size: ${classroom.size}`);


//classroom.delete('sarah');
//console.log('sarah:', classroom.get('sarah'));
