var questions = [
  ['How many states are in the United States?', 50],
  ['How many continents are there?', 7],
  ['How many legs does an insect have?', 6]
];
var correctAnswers = 0;
var question;
var answer;
var response;

var rightAnswers = [];
var wrongAnswers = [];
var rightMessage = "<p><strong>You got these questions correct:</strong></p>";
var wrongMessage = "<p><strong>You got these questions wrong:</strong></p>";

function print(message) {
  document.write(message);
}

for (var i = 0; i < questions.length; i += 1) {
  question = questions[i][0];
  answer = questions[i][1];
  response = prompt(question);
  response = parseInt(response);
  if (response === answer) {
    correctAnswers += 1;
    rightAnswers.push(i);
  } else {
    wrongAnswers.push(i);
  }
}

html = "You got " + correctAnswers + " question(s) right.<br>"
print(html);

print(rightMessage);
for(var i=0; i < rightAnswers.length; i++) {
  print(i+1 + ". " + questions[rightAnswers[i]][0] + "<br>");
}

print (wrongMessage);
for(var i=0; i < wrongAnswers.length; i++) {
    print(i+1 + ". " + questions[wrongAnswers[i]][0]+ "<br>");
}
