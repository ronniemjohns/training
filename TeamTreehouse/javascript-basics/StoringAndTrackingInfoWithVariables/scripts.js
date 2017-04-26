var message = "Welcome to treehouse";
var anotherMessage = 'Welcome to my house';

//alert(message);
//alert(anotherMessage);

// notice putting a single quote inside a string
message = "She's a great person";

// or ditto for double quotes:
message = '<h1 class="special">Important Headline</h1>';
//alert(message);


// although you can escape with the backslash:
message = 'She\'s an important person';


var visitorName = prompt("What is your name?");
var message = "Hello " + visitorName;
document.write("The string \"" + message + "\" is " + message.length + " characters long");
console.log(visitorName.toLowerCase());
message.concat("yo", "other");
console.log(message);

var id = "23188xtr";
var lastName = "Smith";

var userName = id.toUpperCase();
userName = userName.concat("#",lastName.toUpperCase());
console.log(userName);