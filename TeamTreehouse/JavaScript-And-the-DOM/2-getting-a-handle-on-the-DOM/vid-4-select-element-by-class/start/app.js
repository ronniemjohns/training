const myList = document.getElementsByTagName('li');

for (let i = 0; i < myList.length; i += 1) {
  myList[i].style.color = 'purple';
}


const errorNotPurpleList = document.getElementsByClassName('error-not-purple');

for (let i = 0; i < errorNotPurpleList.length; i += 1) {
    errorNotPurpleList[i].style.color = 'red';
}