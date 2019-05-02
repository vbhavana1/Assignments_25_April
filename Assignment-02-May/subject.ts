import * as readline from 'readline';
var result = readline.createInterface({
    input: process.stdin,
    output: process.stdout

});
result.question(`Enter marks`,(answer) =>{
    let sub = (answer).split(" ");
    let sub1 = parseInt(sub[0]);
    let sub2 = parseInt(sub[1]);
    let sub3 = parseInt(sub[2]);
    function Tocheck(num1? : number, num2? : number, num3?: number){
        let result: boolean = true;
        let sum : number = num1+num2+num3;
        if(sum<125){
            result = false;
        }
        if(num1<40){
            result = false;

        }
        if(num3 < 40){
            result = false;
        }
        if(result == false){
            console.log("Fail");
        }
        else{
            console.log("pass")
        }
    }
    result.close();
});