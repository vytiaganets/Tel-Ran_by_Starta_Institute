//---------------var let const---------------
// let text = 'hello'
// let secondText = 'world'
// function hello() {
//   console.log(text);
// function world() {
//   console.log(secondText);
// }
// }
// console.log(text);
// hello()
// console.log(text); //let = text is not defined || varr = undefined из-за всплытия

// var text = 'hello' // var работает правильно только внутри функций
//область видимости определяется фигурными скобками
// if (1 === 1) {
//   let text = 'hello'
//   console.log(text); //hello - success
// }
// console.log(text); //let = error, var = hello (потому, что вар не видит эту область видимости)

// hoisting - всплытие (var, function declaration)

// var не имет области видимости. при создании переменной с помощью var срабатывает hoisting. Область видимости у вар ограничивается фигурными сккобками функций

// let num = 4
//let num = 6 // нельзя пересоздать переменную

//var позволяет пересоздать одну и ту же переменную
// var num = 6
// var num = 5

// function createCounter() {
//   let index = 0
// console.log(index);
//дочерняя функция замыкания - то-есть замыкает в себе контекст (область видимости выполнения)
// возвращаем жту функцию с контекстом как результат выполнения функции
// return function increment() {
//   index = index +1
//   console.log(index);
// }
// increment()
// }
// console.log(index);
// const increment2 = createCounter()
// increment2() // 1 меняем значения переменной index из функции createCounter
// increment2() // 2
// increment2() // 3

//=============================Задача 1============================
// Напишите функцию, которая в качестве аргументов получает два числа и возвращает массив чисел со значениями от меньшего числа   к большему. 
// function createArrFromRange(a, b) { // a = 20, b = 10
//   let arr = []
// if(a>b){
// for(let i = b; i <= a; a++){
//   arr.push(i)
// }} else {
//   for(let i = a; i <= b; i++){
//     arr.push(i)
//   }
// } // нежелательно так писать из-за дубляжа кода

//   let min = a //предполагаем что а минимальное значение
//   let max = b //предполагаем что b максимальное значение
//   if (a > b) {
//     min = b
//     max = a
//   }

//   for (let i = min; i <= max; i++) {
//     arr.push(i)
//   }
//   return arr
// }

// console.log(createArrFromRange(10, 20)); // [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, …] (11)
// console.log(createArrFromRange(20, 10)); // [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, …] (11)

//=============================Задача 2============================
//Напишите функцию, которая в качестве аргументов получает два числа и возвращает массив чисел со значениями от большего числа к меньшему. 
// function createArrFromRange(a, b) { 
//   let arr = [] 
//   let min = a //предполагаем что а минимальное значение
//   let max = b //предполагаем что b максимальное значение
//   if (a > b) {
//     min = b
//     max = a
//   }

//   for (let i = max; i >= min; i--) { // вставляем  min max в свои места
//     arr.push(i)
//   }
//   return arr
// }
// let result = createArrFromRange(10, 20)
// console.log(result)//[20, 19, 18, 17, 16, 15, 14, 13, 12, 11, …] (11)
// console.log(createArrFromRange(10, 20));//[20, 19, 18, 17, 16, 15, 14, 13, 12, 11, …] (11)
// console.log(createArrFromRange(20, 10));// [20, 19, 18, 17, 16, 15, 14, 13, 12, 11, …] (11)

//=============================Задача 3============================

// В программе объявлена переменная list, которая содержит массив чисел. Используя цикл посчитайте сумму чисел и выведите в консоль. 


// let list = [4, 6, 9, -5, -23, 24, 20, 36, 852, -42] 
// function arraySum(list){
//   var sum = 0;
//   for(var i = 0; i < list.length; i++){
//       sum += list[i];
//       }
//   console.log(sum);
//   }
//   arraySum(list); //886
//=============================Задача 4============================
// В программе объявлена переменная list, представляющая массив положительных и отрицательных численных значений. Используя цикл, выведите в консоль сумму положительных чисел. 
//   let list = [4, 6, 9, -5, -23, 24, 20, 36, 852, -42] 
// function arraySum(list){
//   var sum = 0;
//   for(var i = 0; i < list.length; i++){
//     if(list[i]>0){
//       sum += list[i];
//       }
//     }
//   console.log(sum);
//   }
//   arraySum(list); //951

// 2 sposob

// let list = [4, 6, 9, -5, -23, 24, 20, 36, 852, -42] 
// let sum = 0
// let positiveSum = 0

// for (let i=0; i<list.length; i++){
//   sum = sum+list[i]
//   if (list[i]>=0){
//     positiveSum = positiveSum +list[i]
//   }
// }

// console.log(`positiveSum = ${positiveSum}, sum = ${sum}`); //951
//=============================Задача 5============================
//В программе объявлена переменная list, которая содержит массив чисел. Используя цикл посчитайте разность суммы всех четных чисел и суммы всех нечетных. 

// let list = [4, 6, 9, -5, -23, 24, 20, 36, 852, -42]
// let evenSum = 0
// let oddSum = 0

// for (let i = 0; i < list.length; i++) {
//   if (list[i] % 2 === 0) {
//     evenSum += list[i]
//   } else {
//     oddSum += list[i]
//   }
// }


// console.log(evenSum - oddSum); //919


//=============================Задача 6============================
//Напишите функцию, которая в качестве аргумента получает массив из чисел и возвращает объект со свойствами min, max, avg с соответствующими значениями по массиву. 
// let list = [4, 6, 9, -5, -23, 24, 20, 36, 852, -42]

// function inspectArray(arr) {
//   let min = arr[0]
//   let max = arr[0]
//   let sum = 0

//   for(let i = 0; i < arr.length; i++) {
//     if (min > list[i]) {
//       min = list[i]
//     }
//     if (max < list[i]) {
//       max = list[i]
//     }
//     sum += list[i]
//   }
//   let avg = sum / arr.length

//   return {
//     min: min,
//     // усли название свойства совпадает с названием переменной можно написать вот таким образом
//     max: max,
//     avg: avg
//   }
// }
// let result = inspectArray(list) 
// console.log(result) //{min: -42, max: 852, avg: 88.1}

//=============================Задача 7============================
//В программе объявлена переменная word со строковым значением. Используя цикл, разверните слово. 

// let word = "hello world" // olleh
// let reversed = ''
// for(let i=word.length-1; i >=0; i--){
// reversed = reversed + word[i]
// }
// console.log(word[i]);

// function reverseString(word) {
//   if (word ===
//   "'") return
//   else
//   return reverseString(word.substr(1)) + word.charAt (0); }
//   reverseString("hello");


//=============================Задача 8============================
// Напишите функцию, которая в качестве аргументов получает слово и определяет, является ли оно палиндромом. Если да, функция возвращает true, в ином случае false. 
// "anna" "казак" "оно"  
// function isPalindrome(word) {
//   let reversed = ''
//   for (let i = word.length - 1; i >= 0; i--) {
//     reversed = reversed + word[i]
//   }
//   return word === reversed
// }
// console.log(isPalindrome("anna")); // true
// console.log(isPalindrome("hello")); //false

//=============================Задача 9============================
// Написать цикл, который выводит для каждого товара строку по маске "<название> (<цена>)"
// skate(1000)
// const goods = [{
//     id: 1,
//     title: "bicycle",
//     price: 45000,
//     discount: 10
//   },
//   {
//     id: 2,
//     title: "roller-skates",
//     price: 15000,
//     discount: 5
//   },
//   {
//     id: 3,
//     title: "kick scooter",
//     price: 10000,
//     discount: 30
//   },
//   {
//     id: 4,
//     title: "skis",
//     price: 25000,
//     discount: 10
//   },
//   {
//     id: 5,
//     title: "skate",
//     price: 10000,
//     discount: 0
//   }
// ]

// for (let i = 0; i < goods.length; i++) {
//   const {
//     title,
//     price,
//     id
//   } = goods[i]
//   console.log(`${goods[i].title} (${price}) ${id}`);
// }
//bicycle (45000) 1
//roller-skates (15000) 2
//kick scooter (10000) 3
//skis (25000) 4
//skate (10000) 5

