/*
let myHeading = document.querySelector('h1');
alert(myHeading.textContent);    // returns the text value in the element.
myHeading.textContent = 'This is different';

*/

const input = document.querySelector('input');
const p = document.querySelector('p.description');
const button = document.querySelector('button');

button.addEventListener('click', () => {
    p.innerHTML = input.value + ':';
})


let ul = document.querySelector('ul');
ul.innerHTML = '<li>red catfish</li>';