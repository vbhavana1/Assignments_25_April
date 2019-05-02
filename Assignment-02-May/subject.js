"use strict";
exports.__esModule = true;
var readline = require("readline");
var result = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
result.question("Enter marks", function (answer) {
    var sub = (answer).split(" ");
    var sub1 = parseInt(sub[0]);
    var sub2 = parseInt(sub[1]);
    var sub3 = parseInt(sub[2]);
    function Tocheck(num1, num2, num3) {
        var result = true;
        var sum = num1 + num2 + num3;
        if (sum < 125) {
            result = false;
        }
        if (num1 < 40) {
            result = false;
        }
        if (num3 < 40) {
            result = false;
        }
        if (result == false) {
            console.log("Fail");
        }
        else {
            console.log("pass");
        }
    }
    result.close();
});
