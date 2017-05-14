const myHeading = document.getElementsByTagName('h1')[0];
const myButton = document.getElementById('myButton');
const myTextInput = document.getElementById('myTextInput');
const myList = document.getElementsByTagName('li');

myButton.addEventListener('click', () => {
  myHeading.style.color = myTextInput.value;
});

for(let i=0; i<myList.length; i++) {
  myList[i].style.color = 'purple';
}


