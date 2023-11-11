// 1 переменные
// camelCase
// const firstName = 'Andrii'
//const lastName = 'Vyt' // string

// const age = 26 // number
// const isProgrammer = true // boolean

// const _ = 'private'
// const $ = 'some value'

// name = 'Andr'
// const if = 'mkef' // err
// const withNum5 = '5'
// const 5withNum = 5 // err
// console.log(age)

// 2 Мутирование
// console.log('Имя человека: ' + firstName + ', а возраст человека: ' + age)
// alert('Имя человека: ' + firstName + ', а возраст человека: ' + age)
// const lastName = prompt('Введите фамилию')
// alert(firstName + ' ' + lastName)

// 3 Операторы
// const currentYear = 2020
// const birthYear = 1993

// const age = currentYear + birthYear

// console.log(age)

// let currentYear = 2020
// const a = 10
// const b = 5
// let c = 32
// c = c + a
// c = c - a
// c = c * a
// c = c / a
// c += a
// c -= a
// c*= a
// c /= a
// console.log(a + b)
// console.log(a - b)
// console.log(a * b)
// console.log(a / b)
// console.log(++currentYear)
// console.log(--currentYear)
// console.log(c)

// console.log(currentYear++) // 0
// console.log(currentYear++) // 2021

// 4 Типы данных

// const isProgrammer = true
// const name = 'Andrii'
// const age = 25
// console.log(typeof isProgrammer) // boolean
// console.log(typeof name) // string
// console.log(typeof age) // number
// console.log(typeof x) // undefined
// console.log(typeof null) //object

// 5 Приоритет операторов
// const fullAge = 26
// const birthYear = 1993
// const currentYear = 2020

// > < >= <=
// const isFullAge = currentYear - birthYear >= fullAge // 26 >= 27
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Operator_precedence
// console.log(isFullAge)


// 6 Условные операторы

// const courseStatus = 'fail' // ready, fail, pending

// if(courseStatus === 'ready'){
//   console.log('Курс уже готов и его можно проходить')
// } else if (courseStatus === 'pending'){
//   console.log('Курс пока находится в процессе разработки')
// } else{
//   console.log('Курс не получился') // Курс не получился
// }

// const num1 = 42 // number
// const num2 = '42' // string
// console.log(num1 == num2) // екгу
// console.log(num1 === num2) // false

// const isReady = true
// if (isReady === true){
//   console.log('Все готово') // Все готово
// } else {
//   console.log('Все не готово') 
// }
// Тернарное выражение
// isReady ? console.log('Все готово') : console.log('Все не готово') 

// 7 Булевая логика
//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators

//  8 Функции

// function calculateAge (year) {
//   return 2020 - year
// }
// const myAge = calculateAge(1993)
// console.log(myAge)
// console.log(calculateAge(1999))

// function logInfoAbout(name, year) {
//   const age = calculateAge(year)

//   if (age>0){
//   console.log('Человек по имени: ' +  name + 'сейчас имеет возраст: ' + age)
// } else{
//   console.log('Вообще то уже будет будущее')
// }
// }
// logInfoAbout('Andrii', 1999)
// logInfoAbout('Lara', 1990)
// logInfoAbout('Lara', 2222)

// 9 Массивы

// const cars = ['Мазда', 'Мерседес', 'Форд']
// console.log(cars.length)

// const cars = new Array('Мазда', 'Мерседес', 'Форд')
// console.log(cars)
// console.log(cars[0])
// console.log(cars[1])
// console.log(cars[2])

// cars[0] = 'Porche'

// console.log(cars)
// cars[3] = 'Mazda'
// console.log(cars)
// cars[cars.length] = 'Audio'


// 10 Циклы

// const cars = ['Мазда', 'Мерседес', 'Форд']

// for (let i = 0; i < cars.length; i++) {
//   const car = cars[i]
//   console.log(car)

// }

// for (let car of cars){
//   console.log(car)
// }

// 11 Обьекты

// const person = new Object()

// const person = {
//   firstName: 'Andrii',
//   lastName: 'Vyt',
//   year: 1993,
//   languages: ['Ru', 'En', 'De'],
//   hasWife: false,
//   grreet: function () {
//     console.log('greet from person')
//   }
// }

// console.log(person.firstName)
// console.log(person['lastName'])
// // const key = 'year'
// const key = 'languages'
// console.log(person[key])
// person.hasWife = true
// person.isProgrammer = true
// person.grreet()



