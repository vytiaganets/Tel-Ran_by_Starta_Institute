//-------------------задача 01-------------------
//Напишите цикл for, который выводит консоль каждое второе число от 0 до 10
// 

// for (let i = 0; i < 10; i++) {
//   if (i % 2) {
//     console.log(i);
//   }
// }

// 1
// 3
// 5
// 7
// 9

//-------------------задача 02-------------------
//Напишите цикл for, который выводит в консоль  все числа от 55 до 20
//
// for (let i = 55; i >= 20; i--) {
//     console.log(i);
// }

// 55...20

//-------------------задача 03-------------------
// Дан массив numbers. Вывести в консоль все числа из массива

// const numbers = [3, 5, 11, 2, 8, 1, 6];

// const numbers = [3, 5, 11, 2, 8, 1, 6];
// for (let i in numbers) {
//     console.log(numbers[i])
// }


//  3 
//  5 
//  11 
//  2 
//  8 
//  1 
//  6 

//-------------------задача 05-------------------
// Сформировать новый массив numbers_squared и передать в него все элементы из массива numbers, возведенные в квадрат
//

//  const numbers = [3, 5, 11, 2, 8, 1, 6];
//  let numbers_squared = []
//  for (let i in numbers) {
//   numbers_squared.push(numbers[i] ** 2)
//  }
 //console.log(numbers_squared)

//[9, 25, 121, 4, 64, 1, 36]

//-------------------задача 06-------------------
// Создать переменную last_elem и передать в нее последний элемент из сформированного массива numbers_squared (обратиться к элементу массива по индексу)
//
// let last_elem = numbers_squared.pop()
// let last_elem = numbers_squared[6]
// console.log(last_elem)

// 36

//-------------------задача 07-------------------
// Дан объект user. Используя данные из объекта, сформировать строку в формате: ‘User’s name is <FIRST_NAME> <LAST_NAME>. He is <AGE> years old’

// const user = {
// first_name: 'Ivan', 
// last_name: 'Ivanov', 
// age: 20, 
// salary: 500
// }
//

// const user = {
// first_name: 'Ivan', 
// last_name: 'Ivanov', 
// age: 20, 
// salary: 500
// }

// console.log(`User’s name is ${user.first_name} ${user.last_name}. He is ${user.age}  years old`)

// User’s name is Ivan Ivanov. He is 20  years old