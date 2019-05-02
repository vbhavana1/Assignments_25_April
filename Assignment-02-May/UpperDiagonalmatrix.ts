let arr:number[][] = [[12,34,56],[54,65,32],[21,65,76]];
var col = arr[0].length;

 
 for( var i=0; i<arr.length; i++){
     for( var j=0; j<col;j++){
         console.log(arr[i][j])
     }
     col--;
 }