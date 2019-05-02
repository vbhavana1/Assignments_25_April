"use strict";
exports.__esModule = true;
var readline = require("readline");
var numbr = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
numbr.question("Enter the number to print factorial", function (answer) {
    //  var num = parseInt(answer);
    var fact = 1;
    for (var i = 1; i <= parseInt(answer); i++) {
        fact = fact * i;
    }
    console.log(fact);
    numbr.close();
});
