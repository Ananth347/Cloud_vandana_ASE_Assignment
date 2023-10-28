//2. A) A. Take a sentence as an input and reverse every word in that sentence. 
             //Example - This is a sunny day > shiT si a ynnus yad//

//solution:


 function reverseWords(sentence) { // Splitting the sentence into words
  
  const words = sentence.split(" ");

  
  const reversedWords = words.map(function(word) { // Reversing each word and store them in an array
    return word.split('').reverse().join('');
  });

  
  const reversedSentence = reversedWords.join(" "); // Join the reversed words back into a sentence

  return reversedSentence;
}

const inputSentence = prompt("Enter a sentence:"); // Enter input

const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);