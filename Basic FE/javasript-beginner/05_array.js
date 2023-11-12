//1.  Масссивы
// const cars = ['Mazda', 'Ford', 'Merzedes', 'BMW']
// const fib = [1, 1, 2, 3, 5, 8, 13, '21', true]
// console.log(cars); //["Mazda", "Ford", "Merzedes", "BMW"] (4)

//Function
// function addItemToEnd(){

// }
//Method
// cars.push('Porsche')

// console.log(cars) // ["Mazda", "Ford", "Merzedes", "BMW", "Porsche"] (5)
// cars.unshift('Lada')
// console.log(cars); //["Lada", "Mazda", "Ford", "Merzedes", "BMW", "Porsche"] (6
// cars.shift('Porsche')
// console.log(cars);//["Mazda", "Ford", "Merzedes", "BMW", "Porsche"] (5)

// const firstItem = cars.shift()
// const lastCar = cars.pop(1)
// console.log(firstItem); //Mazda
// console.log(lastCar); //Porsche
// console.log(cars);//["Ford", "Merzedes", "BMW"] (3)

// const cars = ['Mazda', 'Ford', 'Merzedes', 'BMW']
// console.log(cars.reverse()); //["BMW", "Merzedes", "Ford", "Mazda"] (4)


// Задача 1
// const text = 'Hello. We are learning Javascript'
// const reverseText = text.split('.')
// console.log(reverseText);//["Hello", " We are learning Javascript"] (2)

// const text = 'Hello. We are learning Javascript'
// const reverseText = text.split('').reverse().join()
// console.log(reverseText);//t,p,i,r,c,s,a,v,a,J, ,g,n,i,n,r,a,e,l, ,e,r,a, ,e,W, ,.,o,l,l,e,H

// const cars = ['Mazda', 'Ford', 'Merzedes', 'BMW']
// console.log(cars.indexOf('BMW'));//3

// const index = cars.indexOf('BMW')
// cars[index] = 'Reno'
// console.log(cars); //["Mazda", "Ford", "Merzedes", "Reno"] (4)

// const people = [{
//     name: 'Andrii',
//     budget: 4200
//   },
//   {
//     name: 'Helen',
//     budget: 3500
//   },
//   {
//     name: 'Victoria',
//     budget: 1700
//   }

// ]
// const cars = ['Mazda', 'Ford', 'Merzedes', 'BMW']
// const index = people.findIndex(function (person) {
//   // console.log(person);
//   return person.budget === 3500
// })

// const person = people.find(function (person) {
//   return person.budget === 3500
// })
// console.log(person); //{name: "Helen", budget: 3500}
// console.log(index); //1
// console.log(people[index]); //{name: "Helen", budget: 3500}
//{name: "Andrii", budget: 4200}
//{name: "Helen", budget: 3500}
//{name: "Victroria", budget: 1700}

// let findetPerson
// for(const person of people){

//   if(person.budget === 3500){
//     findetPerson = person
//   }
// }
// console.log(findetPerson) //{name: "Helen", budget: 3500}


// const person = people.find(person =>  person.budget === 3500) // лямбда функция
// console.log(person) //{name: "Helen", budget: 3500}

// const cars = ['Mazda', 'Ford', 'Merzedes', 'BMW']
// cars.includes('Mazda')
// console.log(cars.includes('Mazda')); ///true


// Методы высокоо порядка
// фильтрация массива
// const fib = [1, 1, 2, 3, 5, 8, 13, '21', true]
// const cars = ['Mazda', 'Ford', 'Merzedes', 'BMW']
// const upperCaseCars = cars.map(car => {
//   return car.toUpperCase()
// })


// console.log(upperCaseCars); //["MAZDA", "FORD", "MERZEDES", "BMW"] (4)
// console.log(cars); //["Mazda", "Ford", "Merzedes", "BMW"] (4)

// const pow2 = num => num ** 2

// const sqrt = num => Math.sqrt(num)
// const pow2Fib = fib.map(pow2).map(Math.sqrt)
//console.log(pow2Fib);//[1, 1, 4, 9, 25, 64, 169, 441, 1] (9)
// console.log(pow2Fib);//[1, 1, 2, 3, 5, 8, 13, 21, 1] (9)

// const pow2Fib = fib.map(num => num ** 2)
// console.log(pow2Fib); //[1, 1, 4, 9, 25, 64, 169, 441, 1] (9)

// const fib = [1, 1, 2, 3, 5, 8, 13, '21', true]
// const pow2 = num => num ** 2
// const pow2Fib = fib.map(pow2)
// //console.log(pow2Fib); //[1, 1, 4, 9, 25, 64, 169, 441, 1] (9)
// const filteredNumbers = pow2Fib.filter(num => num > 20)
// console.log(pow2Fib);
// console.log(filteredNumbers);//[25, 64, 169, 441] (4)

// const people = [{
//     name: 'Andrii',
//     budget: 4200
//   },
//   {
//     name: 'Helen',
//     budget: 3500
//   },
//   {
//     name: 'Victoria',
//     budget: 1700
//   }
// ]
// const allBudjet = people.reduce((acc, person) => {
//   if (person.budget > 2000) {
//     acc += person.budget
//   }
//   return acc
// }, 0)
// console.log(allBudjet); //9400

// const allBudget = people
// .filter(person => person.budget > 2000)
// .reduce((acc, person) => {
//   acc += person.budget
//   return acc
// }, 0)

// console.log(allBudget); //7700 сумма бюджетов > 2000

// const displayItems = allItems.filter(item => item.name.indexOf('phone')!==-1)