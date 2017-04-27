
var answer = prompt('What programming language is the best?');
//  note === is strict equals
if(answer.toLowerCase() === 'java' ) {
    document.write("<p>That's right!</p>");
} else if(answer.toLowerCase() === "javascript"){
    document.write("<p>Well, that's a pretty good second.</p>");
} else {
    document.write("<p>Sorry, that is not correct.</p>");
}

/*  note you'd want to usually use && or || like java.  you CAN use the single operator which will not short circuit
    the second (similar to java)
 */
var x=1;
if((x===2) & (x+=3)) {
    document.write("shouldn't write this");
}
document.write("x: " + x);   // evaluates to 4 if you use & or 1 if you use &&

/*  == vs ===  (and != vs !==)
  "3"==3 is true
  "3"===3 is false (strict checks TYPE as well).  Try to avoid the ==.  You get wacky results ("" == 0 is true)
 */