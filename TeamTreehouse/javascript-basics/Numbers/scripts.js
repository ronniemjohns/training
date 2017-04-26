var secondsPerMin = 60;
var minsPerHour = 60;
var hoursPerDay = 24;
var daysPerWeek = 7;


var secondsPerDay = secondsPerMin * minsPerHour * hoursPerDay;

var yearsAlive = 43;
document.write("Seconds per day: " + secondsPerDay);
document.write("I've been alive for more than " + (secondsPerDay * yearsAlive) + " seconds");


var stringNumber = "42";
var anotherStringNumber = "5";

document.write("numbers as strings: " + (stringNumber + anotherStringNumber));
document.write("numbers as numbers: " + (parseInt(stringNumber) + parseInt(anotherStringNumber)));

var floatingPtString = "24.92";

document.write("floatingPoint: " + parseFloat(floatingPtString));

// note parsing a floating point as an int just simply drops the precision (doesn't round)
document.write("integer precision of 24.92: " + parseInt(floatingPtString));

// note you can do some funky things:
// parseFloat('1.22 is the number') will return 1.22.
// parseFloat('The number is 1.22') will return NaN.


// so note that it's just going to drop px from 190 and parseInt will work!
var width = '190px';
var numOfDivs = 10;
var totalWidth = numOfDivs * parseInt(width);
document.write("totalWidth: " + totalWidth);

// MATH object commands
// Math.round(2.2);
// Math.random();  -- between 0 and 1 (includes 0 but not 1)
// Math.ciel(number) - rounds up
// Math.floor(number) - rounds down
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math