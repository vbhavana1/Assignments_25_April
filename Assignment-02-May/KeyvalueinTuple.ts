var student : [number, string][];
student = [[1,"bhavana"],[2,"meena"],[3,"reshma"]];
import * as readline from 'readline';
var keyval = readline.createInterface({
    input: process.stdin,
    output: process.stdout

});
keyval.question(`Enter the key `, (answer) => {
   var  flag = 0;
   var index ;
    var k:any = parseInt(answer);
    for( var i=0;i<student.length; i++)
    {
        if(k == student[i][0])
        {
            flag =1;
        index = k;
         }
 }
 if(flag ==1){
console.log(student[index][1]);
 }
keyval.close();

});
