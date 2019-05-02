"use strict";
exports.__esModule = true;
var readline = require("readline");
var adddigits = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
adddigits.question("enter the number to add each digit", function (answer) {
    var newval = (answer).split('');
    console.log(newval);
    var sum = 0;
    for (var i = 0; i < newval.length; i++) {
        var sum = sum + parseInt(newval[i]);
    }
    console.log("the sum of Digits in an array is" + sum);
    adddigits.close();
});
