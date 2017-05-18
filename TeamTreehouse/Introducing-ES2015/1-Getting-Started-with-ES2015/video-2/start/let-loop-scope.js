'use strict';

(function initLoop() {
  function doLoop(x) {
    // i = 3;  // this would actually change the variable i even though it's ONLY in the for loop.
      // if you use let instead of var in the for loop, it's ONLY scoped in the for loop (yay!).
    console.log('loop:', x);
  }


  // should change "var" to "let" to avoid problems with trying to set i in other places
  for (var i = 0; i < 10; i++) {
    doLoop(i + 1);
  }
})();