// for(let num=0; num<10; num++){
// if(num==5){
// break}
// console.log(num)
// }

// let array = [1, 3, 6, 13, -12, 0]

// array.push(1, 45, 7, -12)

// console.log(array)

// let thelast = array.pop()
// console.log(thelast)
// console.log(array)

// array.unshift(0)
// console.log(array)
// let deleted = array.shift()
// console.log(deleted)
// console.log(array)

// 2. Составьте программу, которая выводит на экран все двузначные положительные числа, делящиеся без остатка на 3 и на 5  (начиная с наименьшего). 
// for(let i=10; i<99; i++){
//   if(i%3 ==0 && i%5==0){
//     console.log(i)
//   }
// }
// 3. Написать цикл, который выводит те числа из массива, которые больше или равны 15. 
// let arr = [12, 3, -9, 0, 32, -9]
// for(let i in arr){
//   if(arr[i]>=15){
//     console.log(arr[i])
//   }
// }

//32
// 4. Написать цикл, который выводит только нечетные числа массива. 
// let arr = [12, 3, -9, 0, 32, -9]
//   for(let i in arr){
//     if(arr[i]%2!==0){
//       console.log(arr[i])
//     }
//   }

//3
//-9
// 5. Вывести только те значения массива, индекс которых кратен трем. 

// let arr = [12, 3, -9, 0, 32, -9]
//   for(let i in arr){
//     if(i%3==0){
//       console.log(arr[i])
//     }
//   }

//12
//0

// ------------------Задача 1------------------
//   У нас есть следующий объект: 
//     let user = { 
//     name: "John", 
//     age: 30 
//     }; 
// Проверьте, что в объекте есть ключ age. 

// let user = {
//   name: "John",
//   age: 30
// };
// 1)

// console.log('age' in user)

//true

// 2)
// if(user.age){
//   console.log('true')
// }

//true

// 3)

// if (typeof user['age'] !== "undefined") {
//   console.log('ключ есть')
// } else {
//   console.log('ключа нет')
// }

// ключ есть

// 4)

// if('age' in user){
//   //   console.log('ключ есть')
// }

// ключ есть


// 2. Создать объект product с названием(product_name) и ценой(product_price) продукта и выведите данные в консоль. 

// let product = {
//     product_name: "Milk",
//     product_price: 30
//   }
//   console.log(`Product: ${product.product_name} and price: ${product.product_price}`)

// Product: Milk and price: 30

//------------------Задача 3------------------

// 3. Добавить в объект product свойства product_quantity и product_quality. 


// let product = {
//   product_name: "phone",
//   product_price: 3000
// }

// product.product_quantity = 4
// product.product_quality = 'new'

//------------------Задача 4------------------
// 4.  Удалить свойство product_quality из объекта product. 

// delete product.product_quality


//------------------Задача 5------------------

// 5. Написать код, выполнив задание: если значение объекта является числом (number), то его значение надо увеличить вдвое. 

// Пример объекта: 

//     let menu = { 
//         width: 200,  
//         height: 300, 
//         title: "my menu" 
//     }; 

// Результат: 

//     let menu = { 
//         width: 400,  
//         height: 600, 
//         title: "my menu" 
//     }; 

// let menu = {
//   width: 200,
//   height: 300,
//   title: "my menu"
// };

// for (let i in menu) {

//   if (typeof menu[i] == 'number') {
//     menu[i] *= 2;
//   }
//   console.log(`${menu.width}`)
// }

// // 400

//------------------Задача 6------------------

//   В программе объявлена переменная list, которая содержит массив чисел. Используя цикл посчитайте сумму чисел и выведите в консоль. 
//  let array = [1, 0, -32, 2, 15, 67, 2, -4, 2, 74, 34]; 


//  let array = [1, 0, -32, 2, 15, 67, 2, -4, 2, 74, 34]
//  let sum =0
//  for (let i = 0; i<array.length; i++) {
//   sum += array[i];
// }
// console.log(sum)

//161

//------------------Задача 7------------------
// В программе объявлена переменная list, представляющая массив положительных и отрицательных численных значений. Используя цикл, выведите в консоль сумму положительных чисел.  

// let array = [1, 0, -32, 2, 15, 67, 2, -4, 2, 74, 34]
// let sum = 0
// for (let i = 0; i < array.length; i++) {
//   if (array[i]>0) {
//     sum += array[i];
//   }
// }
// console.log(sum)

//197

//------------------Задача 8------------------
// В программе объявлена переменная list, которая содержит массив чисел. Используя цикл посчитайте разность суммы всех четных чисел и суммы всех нечетных. 

// let array = [1, 0, -32, 2, 15, 67, 2, -4, 2, 74, 34]

// let sumOdd = 0
// let sumEven = 0

// for (let i = 0; i < array.length; i++) {
//   if (array[i] % 2 == 0) {
//     sumOdd += array[i];
//   } else {
//     sumEven += array[i];
//   }
// }

// console.log(sumOdd-sumEven)

// -5

//------------------Задача 9------------------
// В программе объявлена переменная list, содержащая массив данных. Используя цикл, посчитайте сумму значений до первого булевого значения. Дойдя до булевого значения остановите цикл. Результат суммы выведите в консоль. 
//  let array = [1, 'true', -32, 2, 'false', 67, 2, -4, 2, 74, 34]

//  let sum = 0
//  for (let i = 0; i < array.length; i++) {
//    if (typeof array[i] == 'string') {
//      break
//    }
//    sum += array[i];
//  }
//  console.log(sum)