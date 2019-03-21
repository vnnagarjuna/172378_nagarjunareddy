function substringBetweenMatches  (mainStr,searchStr){
    return mainStr.substring(mainStr.indexOf(searchStr)+searchStr.length,mainStr.lastIndexOf(searchStr));

}

function findLastMatch(mainStr,searchStr){
    return mainStr.lastIndexOf(searchStr);
}

function findFirstMatch (mainStr,searchStr){
    return mainStr.indexOf(searchStr);

}
function formLetter(letter){
    return "Hello "+letter.recipient+",\\n\\n"+letter.msg+"\\n\\nSincerely,\\n"+letter.sender;
  
  
  }

function sliceItAndCombineIt(inputString,a,b,c,d){
    return inputString.substring(a,b)+inputString.substring(c,d);

}
console.log(formLetter({ recipient: "James", sender: "Richard", msg: "Things are well." }));
console.log(sliceItAndCombineIt("This is a Test", 0, 4, 5, 7));
console.log(sliceItAndCombineIt("This is a Test", 0, 4, 1, 2) );
console.log(substringBetweenMatches ("Roses are red, apples are really red.", "red"));
console.log(findLastMatch("Roses are red", "re"));
console.log(findFirstMatch("Roses are red", "re"));
