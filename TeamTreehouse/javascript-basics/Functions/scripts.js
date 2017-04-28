function alertRandom() {
    var randomNumber = Math.floor( Math.random() * 6 ) + 1;
    alert(randomNumber);
}

alertRandom();

// notice that there is no return type indicated
function sayHi() {
    return "Hi";
}

alert(sayHi());

// notice no type indicated in functions parameter signature
function saySomething(something) {
    alert(something);
}

saySomething("Hello, passing arguments.");

var message = "outer scope";

function testScope() {
    alert(message);    // because of hoisting, this will be undefined. It's ONLY undefined because message is being reassigned.  Super weird.
    var message = "inner scope";
    alert(message);

}


testScope();
//alert(message);




