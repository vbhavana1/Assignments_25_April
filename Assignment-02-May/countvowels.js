"use strict";
exports.__esModule = true;
var readline = require("readline");
var countvowels = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
countvowels.question("enter the String :", function (answer) {
    var count = 0;
    var newarr = (answer).split('');
    for (var i = 0; i < newarr.length; i++) {
        if (newarr[i] == 'a' || newarr[i] == 'e' || newarr[i] == 'i' || newarr[i] == 'o' || newarr[i] == 'u') {
            count++;
        }
    }
    console.log("The count of vowels is " + "" + count);
    countvowels.close();
});
