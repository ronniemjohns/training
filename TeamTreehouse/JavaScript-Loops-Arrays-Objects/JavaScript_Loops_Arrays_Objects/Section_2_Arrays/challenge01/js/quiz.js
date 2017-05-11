var quizQuestions = [
    ["What is 2+2?", "4"],
    ["What color is the sky?", "blue"],
    ["What question is this?", "3"]
  ];

var answeredRight = 0;

for(var i=0; i < quizQuestions.length; i++) {
  var guess = prompt(quizQuestions[i][0]);
  if(guess === quizQuestions[i][1]) {
    answeredRight++;
  }
}

print("You got " + answeredRight + " questions correct.");

function print(message) {
  document.write(message);
}
