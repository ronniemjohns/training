var secondsPerMin = 60;
var minsPerHour = 60;
var hoursPerDay = 24;
var daysPerWeek = 7;


var secondsPerDay = secondsPerMin * minsPerHour * hoursPerDay;

var yearsAlive = 43;
document.write("Seconds per day: " + secondsPerDay);
document.write("I've been alive for more than " + (secondsPerDay * yearsAlive) + " seconds");