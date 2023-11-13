
//--------------------function declarration--------------------

//function greet(firstName = "Jake", ...arrayofArgs) {
// function greet(firstName = "Jake") {
//тело функции
//console.log(`Hello  ${firstName}`);
// return `Hello  ${firstName}` //справа пишем значения, которое возвращается на место вызова функции
// }
// greet('Bob', 'Jake', 'Ivan')
// greet('Bob') //Hello  Bob
// greet('Anna') //Hello  Anna
// greet()
// console.log(greet()); //Hello  Jake

// let greatResult = greet() //`Hello Jake`

// console.log(`${greatResult}. How are you?`); //Hello  Jake. How are you?

// let product = {
//   title: 'Macbook',
//   price: 10
// }

// function test({title:productName}) { // деструктуризацию можно использовать и внутри аргументов функции
//   console.log(productName); //Macbook
// }
// test(product)
//--------------------Задача 1--------------------
// Разобрать простой пример функции, которая считывает значение числа через prompt и выводит квадрат этого числа в консоль.
// function getNumPow() {
//   const num = +prompt("Введите число")
//   console.log(num ** 2);
// }
// getNumPow()
//--------------------Задача 2--------------------
//Рассмотреть пример функции power, которая получает два аргумента (первый это основание степени, а второй сама степень) и выводит в консоль результат вычислений. 

// function power(a = 1, b = 1) {
//   let result = a;
//   for (let i = 1; i < b; i++) {
//     result *= a;
//   }
//   return result;
// }
// console.log(power(2, 2))


// function power(a,b) {
//   console.log(a**b);
//Math.pow(a,b)
// }
//3^4
// power(3,3)

//--------------------Задача 3--------------------

// function max(a, b) {
//   if(a>b){
//     console.log(a);
//   } else{
//     console.log(b);
//   }
// }
// 

// max=(a,b) => {  if(a>b){
//   console.log(a);
// } else{
//   console.log(b);
// }}
// max(2,1)

//-------------анонимная функция----------------
// (function (a,b) {
//   console.log(a+b);
// }(4,5))
//-------------замыкание переменной----------------
// let a = 3
// (function (a,b) {
//   let a =5
//   return a
//   console.log(a+b);
// }(4,5))

//--------------------Задача 4--------------------
// Переписать функцию power таким образом, чтобы она возвращала результат вычислений
// function power(a = 1, b = 1) {
//   let result = a;
//   for (let i = 1; i < b; i++) {
//     result *= a;
//   }
//   return result;
// }
// let res = power(2, 2)
// console.log(power(2, 2))

// power=(a,b) => {  
//   let result = a;
// for (let i = 1; i < b; i++) {
//   result *= a;
// }
// return result;
// }
// let res = power(2, 2)
// console.log(power(2, 2))

//--------------------Задача 5--------------------

// Описать процесс, используя функцию power, который находит гипотенузу по длине двух катетов (теорема Пифагора).
// a^2+b^2=c^2
// const a = 3
// const b = 4
// let sum = power(a, 2) + power(b, 2) // 9 + 16 = 25
// let c = power(sum, 1/2) // получаем квадратный корень 5
// console.log(c);

// function power(a, b) {
//   return a ** b
// }

// function pow(a, b) {
//   console.log(Math.sqrt(power(a, 2) + power(b, 2)))
// }
// pow(a, b)
//--------------------Задача 5--------------------
//Описать функцию, которая получает число и возвращает true, если число четное и false в ином случае. 
// function isEven(a) {
  // if(a%2===0){
  //   console.log('true');
  //   return true
  // } else{
  //   console.log('false');
  //   return false
  // }
  // return a%2===0

//  return (a%2===0) ?  true :  false
// }
// console.log(isEven(3));
// console.log(isEven(4));

//--------------------function expression--------------------
// declaration
// console.log(greet("John")); // success: Hello John
// function greet(firstName) {
//   return `Hello ${firstName}`
// }

//function declaration
// console.log(greeting("Anna"));  // error
// const greeting = function(firstName){
//   return `Hello ${firstName}`
// }
// console.log(greeting("Anna")); // Hello John
// method // если значение свойства это функкция, то свойтсво называют методом
// const person = {
//   firstName: "Jake",
//   greet: function(firstName){
//     console.log(`Hello ${firstName}`); }
// }

// person.greet("Jane")

// arrow function

// const power = (a, b) => {
//   return a**b
// }
// power(3,4)
