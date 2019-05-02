import * as readline from 'readline';
var adddigits = readline.createInterface({
    input: process.stdin,
    output: process.stdout

});
adddigits.question(`enter the number to add each digit`,(answer) => {
    
    var newval = (answer).split('');
    console.log(newval);
    var sum : number = 0;
    for( var i=0; i<newval.length;i++){

        var sum = sum + parseInt(newval[i]);
    }
    console.log("the sum of Digits in an array is" +sum);

    

    adddigits.close();

});