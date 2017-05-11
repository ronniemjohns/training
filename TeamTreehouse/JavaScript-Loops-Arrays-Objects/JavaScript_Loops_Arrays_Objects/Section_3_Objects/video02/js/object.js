var person = {
  name : 'Sarah',
  country : 'US',
  age : 35,
  treehouseStudent : true,
  skills : ['JavaScript', 'HTML', 'CSS']
};

function print(message) {
  var div = document.getElementById('output');
  div.innerHTML = message;
}

var message = '<p>Hello.  My name is ' + person.name + '</p>';
message += '<p> I live in the ' + person.country + '</p>';
person.ethnicity = 'Caucasion';
message += '<p>I am ' + person.ethnicity + '</p>';
person.name = 'Rainbow Dash';
message += '<p>But I wish my name was ' + person.name + '</p>';

print(message);

