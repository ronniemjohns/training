var upper = 1000000;
var randomNumber = getRandomNumber(upper);
var guess = 0;
var attempts = 0;


function getRandomNumber(upper) {
  return Math.floor( Math.random() * upper ) + 1;
}


while (guess !== randomNumber) {
    guess = getRandomNumber(upper);
    attempts++;
}

document.write("<p> RandomNumber: " + randomNumber + "<p>");
document.write("<p> It took " + attempts + " attempts to guess it. <p>");

