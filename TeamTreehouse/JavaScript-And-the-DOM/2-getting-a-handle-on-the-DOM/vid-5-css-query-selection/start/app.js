const myList = document.getElementsByTagName('li');

for (let i = 0; i < myList.length; i += 1) {
  myList[i].style.color = 'purple';
}

const errorNotPurple = document.getElementsByClassName('error-not-purple');

for (let i = 0; i < errorNotPurple.length; i += 1) {
  errorNotPurple[i].style.color = 'red';
}


/*  querySelectorAll returns a collection.  it can be called with a tag name, a class name, or an id
    querySelectorAll just returns the one element.  It can be called with all of the same as well.

document.querySelectorAll('li');
document.querySelector('li');
 document.querySelector('#myHeading');
document.querySelectorAll('.error-not-purple');
 */

/* but they can also use attributes to call them */
var label = document.querySelector('[title=Label]');
label.style.color = 'green';

querySelectorAll('.error-not-purple');