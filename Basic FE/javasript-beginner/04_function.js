//1. Функции
// Function Declaration:
// function greet(name){
//   console.log('Hallo - ', name)
// }
// Function Expression:
// const greet2 = function greet2(myName){
//   console.log('Hallo2 - ', myName)
// }

// greet('Lina') //Hallo -  – "Lina"
// greet2('Lina2') //Hallo2 -  – "Lina2"

//console.log(typeof greet) //function

//console.dir(greet)
// let counter = 0

//2. Анонимные функции
// const interval = setInterval(function(){
//   if(counter === 5){
//     clearInterval(interval) //clearTimeout
//   }
//   else{
//     console.log(++counter)
//   }
// }, 1000)

// 3. Стрелочные функции

// function greet(name){
//   console.log('Hallo - ', name)
// }

// const arrow = (name) => {
//   console.log('Hallo - ', name)
// }

// const arrow2 = name =>   console.log('Hallo - ', name)
// arrow('Andrii')
// arrow2('Andrii2')

// const pow2 = num => {return num ** 2}
// console.log(pow2(3))

//4. Параметры по умолчанию
// const sum = (a = 40, b = a * 2) => a+b

// console.log(sum(41, 4)) //45
// console.log(sum())//120

// function sumAll(...all) {
//   // console.log(all) //[1, 2, 3, 4, 5, 6, 7, 8] (8)
//   let result = 0
//   for (let num of all) {
//     result += num
//   }
//   return result
// }

// const res = sumAll(1, 2, 3, 4, 5, 6, 7, 8)
// console.log(res) //36

//5 Замыкания

// function createMember(name){
//   return function(lastName){
//     console.log(name + lastName) //undefined
//   }
// }
// const logWithLastName = createMember('Andrii')
// console.log(logWithLastName('Vyt')) //AndriiVyt
// console.log(logWithLastName('Padalka'))//AndriiPadalka
