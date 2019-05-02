"use strict";
exports.__esModule = true;
var readline = require("readline");
var decimalnum = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
decimalnum.question("enter decimal number", function (answer) {
    function decimalToHexString(number) {
        if (number < 0) {
            number = 0xFFFFFFFF + number + 1;
        }
        return number.toString(16).toUpperCase();
    }
    console.log(decimalToHexString(parseInt(answer)));
    decimalnum.close();
});
