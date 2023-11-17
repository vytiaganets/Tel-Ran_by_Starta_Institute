// function functionName(param1, param2){
//   // function body
// }
// functionName(arg1, arg2)

// firstnaame - parametr
// function showMessage(firstname = 'Username') {
//   console.log('Hello ' + firstname);
// }
// showMessage() //Hello Username

// John - argumemtn
// showMessage('John') // Hello John

// showMessage(1) // Hello 1

// let str = 'Hello'

// str = 3

// let num = 3

// num = 'Str'

// console.log(str);
// console.log(num);

// let user_name = prompt('Enter your name: ')
// showMessage(user_name)

// let num = 5

// function pow(){
//   let num1 = 4
//   console.log(num**2);
// }
// pow() //25

//console.log(num1); //is not defined

// function getSum(a, b) {
//   return a + b;
// }

// getSum = (a, b) => {
//   return a + b;
// }

// let sum = getSum(3, 6)

// console.log(sum);

// let sum1 = (num1, num2) => num1 + num2;
// console.log(sum1(2, 5));

//========================Задача 1========================
// Написать функцию, которая принимает 2 числа и возвращает 1, если первое число больше чем второе; -1, если первое число меньше, чем вотрое, и 0 если числа равны

// function checkNumber(num1, num2) {
//   if (num1 > num2) {
//     return 1;
//   } else if (num1 < num2) {
//     return -1
//   } else {
//     return 0
//   }
// }
// let result = checkNumber(4, 3) // 1
// let result1 = checkNumber(5, 10) // 1
// console.log(result);
// console.log(result1);

//========================Задача 2========================
//Напишите функцию, ккоторая принимает числовой аргумент n и считает сумму чисел от 1 до n

// function getSum(n) {
//   let sum = 0
//   for(i=1;i<n; i++){
//     sum += i
//   }
//   return sum
// }

// console.log(getSum(5));//10

//========================Задача 3========================

//Написать функцию, получающую на вход два числа. Если оба числа чётные - функция возвращает их произведение. Если оба числа нечётные - функция возвращает их сумму. Если одно из чисел чётное, а второе нечётное - функция возвращает это нечётное число. 

// && and
// || or

// function oddOrEven(a, b) {
//   if(a%2 === 0 && b%2 === 0){
//     return a*b
//   } else if(a%2 != 0 || b%2 != 0){
//     return a+b
//   } else{
//     return (a%2 === 0?  b : a)
//   }

// }
// let result = oddOrEven(3,8)
// console.log(result);

// function checkOddEven1(num1, num2){
// if(a%2 === 0 && b%2 === 0){
//   return a*b
// } else if(a%2 != 0 && b%2 != 0){
//   return a+b
// }
// if(num1%2===0){
//   return num2
// }
// return num1

//return (num1%2 === 0?  num2 : num1)
// }
// let result = checkOddEven1(3,8)
// console.log(result);

//========================Задача 4========================
//Напишите фунцию, которая принимает массив чисел и возвращает сумму всех элементов
// let array = [1, -4, 0, 2, -45, 2, 45, 0, 1, 2, -23]

// function getArraySum(num_array) {
//   let sum = 0
//   for(let i=0; i<num_array.length; i++){
//     sum += num_array[i]
//   }
//   return sum
// }
// console.log(getArraySum(array)); //-19

// function showNumber(a,b,c) {
//   console.log(`Number1 ${a}, Number2 ${b}, Number3 ${c}`);
// }
// showNumber()//Number1 undefined, Number2 undefined, Number3 undefined
// showNumber(1) //Number1 1, Number2 undefined, Number3 undefined
// showNumber(1,2,3) //Number1 1, Number2 2, Number3 3
//========================Задача 5========================

//3.	Сделайте функцию, которая параметром будет принимать секунды, а возвращать количество суток, соответствующих этим секундам. 

// const r = (s) => s / 86400
// console.log(r(1000000)); // 11.574074074074074

// function calculationTime(s) {
//   return s / 86400
//   }

// const result = (s) => {Math.floor(s / 86400);}
// console.log(result);

// const result = calculationTime(1000000)
// console.log(result);//11.574074074074074

//========================Задача 6========================
//4.	Сделайте функцию, которая параметром будет принимать число и возвращать сумму его цифр 
// function getSum(num) {
//   let sum = 0;
//   let str = String(num);
//   for (let i = 0; i < str.length; i++) {
//     sum += Number(str[i]);
//   }
//   return sum;
// }
// console.log(getDigitsSum(33)); // 6
//========================Задача 7========================
//5.	Напишите функцию isPrime, которая принимает число и возвращает true, если оно простое (имеет только два делителя: 1 и само число), и false в противном случае. 

// const isPrime = (number) => {
//   if (number < 2) {
//     return false;
//   }

//   for (let i = 2; i <= number / 2; i += 1) {
//     if (number % i === 0) {
//       return false;
//     }
//   }

//   return true;
// };
// console.log(isPrime(8));

//========================Задача 8========================

//6.	Напишите функцию, которая принимает массив чисел и возвращает сумму всех элементов. 
// function sum(numbers) {
//   if (numbers.length == 0) return 0; // возвращаем 0, если длинна массива равна 0
//   let sum = 0;
//   for (let number of numbers) {
//     sum += number;
//   }
//   return sum;
// };

// console.log(sum([])); // 0
// console.log(sum([1, 5.2, 4, 0, -1])); // 9.2

//========================Задача 9========================
//7.	Напишите функцию, которая принимает массив строк и возвращает новый массив, содержащий длины каждой строки. 
// const getLength = source => source.map(str => str.length);

// console.log(getLength(['two', 'refer', 'holiday'])); [3, 5, 7] (3)

//========================Задача 10========================
//Напишите функцию, которая принимает массив чисел и возвращает новый массив, содержащий только четные числа.

//  let array = [1, -4, 0, 2, -45, 2, 45, 0, 1, 2, -23]

//  let new_array = []

//  for (let i=0; i<array.length; i++){
//   if(array[i]%2===0 && array[i]>0){
//     new_array.push(array[i])
//   }
//  }
//  console.log(new_array);// [-4, 0, 2, 2, 0, 2] (6)
//  console.log(new_array);//[2, 2, 2] (3)

// let array = [1, -4, 0, 2, -45, 2, 45, 0, 1, 2, -23]
//  function array1(array) {
// let result = []
//    for (let i=0; i<array.length; i++){
//   if(array[i]%2===0 && array[i]>0){
//     result.push(array[i])
//   }
//  }
//  return result
//  }
//  console.log(array1(array));//[2, 2, 2] (3)

//========================Задача 11========================
// 9.	Напишите функцию, которая принимает массив чисел и возвращает новый массив, содержащий только числа больше определенного порога(N).
// let array = [1, -4, 0, 2, -45, 2, 45, 0, 1, 2, -23]
// function createArray(numberArray, N) {
//   let result = []
//   for(let i =0; i<numberArray.length; i++){
//     if( numberArray[i]>N)
//     result.push(numberArray[i])
//   }
//   return result
// }
// console.log(createArray(array, 1)); //[2, 2, 45, 2] (4)


//========================Задача 12========================
//12.	Напишите функцию, которая принимает массив чисел и возвращает новый массив, в котором каждый элемент увеличен в два раза, если он четный, и в три раза, если он нечетный. 
// array = [1, 2, 3]
// array1 = [3, 2, 6]
// function doubleTripleNumbers(arr){ 
//   let modifiedArray = []; 
//   for(let i=0; i<arr.length; i++){ 
//       if(arr[i]%2===0){ 
//           modifiedArray.push(arr[i]*2); 
//       } 
//       else{ 
//           modifiedArray.push(arr[i]*3); 
//       } 
//   } 
//   return modifiedArray; 
// } 

// console.log(doubleTripleNumbers(array));  // [3, 4, 9] (3)
// console.log(doubleTripleNumbers(array1)); // [9, 4, 12] (3)

//========================Задача 13========================
let str = 'Hello'
str.length
max = 