// 2) B. Perform sorting of an array in descending order. 

//solution:

function customSortDescending(arr) { // Defined a function to sort array in descending order
  
  for (let i = 0; i < arr.length; i++) { // Iterate through the array using two loops
    for (let j = i + 1; j < arr.length; j++) {
      
      if (arr[i] < arr[j]) { // Compare elements at indices i and j
      
        const temp = arr[i];
        arr[i] = arr[j];   // Swap elements if they are out of order
        arr[j] = temp;
      }
    }
  }
}

const input = prompt("Enter input:");//enter number by separated by commas


const originalArray = input.split(",").map(Number); // Convert the input into an array by splitting it at commas and mapping the values to numbers

customSortDescending(originalArray); // Call the custom sorting function to sort the array in descending order


console.log(originalArray);// Display the sorted array in the console