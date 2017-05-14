const input = document.querySelector('input');
const p = document.querySelector('p.description');
const button = document.querySelector('button');

button.addEventListener('click', () => {
  p.innerHTML = input.value + ':';
});

//document.write(input.type + '<br>');
//document.write(input.className + '<br>');
//input.type = 'checkbox';
//document.write(input.type + '<br>');


//p.title = 'List description';