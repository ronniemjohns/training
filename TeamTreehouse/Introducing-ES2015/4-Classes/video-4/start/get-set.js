'use strict';

class Student {
  get name() {
    return `${this.firstName} ${this.lastName}`;
  }

  set name(fullName) {
    let name = fullName.split(' ');
    this.firstName = name[0];
    this.lastName = name[1];
  }

  constructor({ firstName, lastName, age, interestLevel = 5 } = {}) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.interestLevel = interestLevel;
  }
}

let joe = new Student({firstName: 'Joe', lastName: 'Blow', age: 22, interestLevel: 4});

console.log(joe);
console.log(joe.name);
console.log(joe.firstName);

joe.name = 'Not Joe';
console.log(joe);
console.log(joe.name);
console.log(joe.firstName);