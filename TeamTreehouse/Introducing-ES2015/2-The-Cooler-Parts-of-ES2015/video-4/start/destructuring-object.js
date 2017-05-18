'use strict';


let toybox = { item1: 'car', item2: 'ball', item3: 'frisbee' };

/* note that the variable names MUST match the original keys in toybox */
let {item2, item3} = toybox;


/*  returns ball */
console.log(item2);


/* but you can rename using stuff AFTER the colon   the below should log "frisbee" */
let {item3: discToy} = toybox;
console.log(discToy);