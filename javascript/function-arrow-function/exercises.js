/*1. Convert to Arrow Function
Convert this function to an arrow function:

function greet(name) {
  return "Hello, " + name + "!";
}
*/
const greet = name => "Hello, " + name + "!";
console.log(greet("Bruno"));

/*
2. Double the Numbers
Use an arrow function with map to double each number:
const numbers = [1, 2, 3, 4, 5];
*/
const number = [1, 2, 3, 4, 5];
const doubleNumber = numbers => numbers.map(value => value * 2);
const number2 = [2, 4, 6, 8, 10].map(value => value * 2);
console.log(doubleNumber(number))
console.log(number2);


// Your arrow function here
/*
3. Get Even Numbers
Use an arrow function with filter to get only the even numbers:
const nums = [1, 2, 3, 4, 5, 6];
*/
const nums = [1, 2, 3, 4, 5, 6]
const evenNumbers = nums => nums.filter(value => value % 2 === 0);
console.log("3: "+evenNumbers(nums));


// Your arrow function here
/*4. Sum All Numbers
Use an arrow function with reduce to sum all numbers in the array:
const numbers = [10, 20, 30, 40];
*/
const numbers = [10, 20, 30, 40];
const sumNumbers = numbers => numbers.reduce((previous, current) => previous + current);
console.log("4: "+sumNumbers(numbers))

/*
5. Say Hello to Everyone
Use forEach and an arrow function to print "Hello, [name]" for each person:
const names = ["Alice", "Bob", "Charlie"];
*/
const names = ["Alice", "Bob", "Charlie"];
names.forEach(name => console.log("Hello, "+name));

/*
6. Sort by Length
Sort this array of words by length (shortest to longest) using an arrow function:
const words = ["banana", "apple", "kiwi", "pineapple"];
*/
const words = ["banana", "apple", "kiwi", "pineapple"];
console.log(words.sort((a, b) => a.length - b.length));

// Your arrow function here
/*
7. Arrow Function + Destructuring
Write an arrow function that takes an object like { x: 1, y: 2 } and returns the sum of x and y.
const sumXY = /* your arrow function */;
//console.log(sumXY({ x: 5, y: 3 })); // 8
const sumXY = ({x, y}) => x + y;
console.log(sumXY({x: 5, y:3}));

