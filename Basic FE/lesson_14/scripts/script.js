// const person = ['John', 'Doe', 35, 1200, 'Europe']
// console.log(`First name: ${person[0]}`)
// console.log(`Last name: ${person[1]}`)
// const person = {
//   firstName: 'John',
//   lastName: 'Dou',
//   age: 35,
//   salary: 1200,
//   address: "Europe",
//   'Car model name': 'BMW',
//   carrModelName: "BMW"
// }


// console.log(`First name: ${person['firstName']}`)
// console.log(`Last name: ${person['lastName']}`)
// console.log(`Salary of person: ${person['Car model name']}`)
// console.log(`Age of person: ${person.age}`)
// console.log(`Salary of person: ${person.salary}`)
// console.log(`Salary of person: ${person.carrModelName}`)

// person.age = 40
// console.log(`Age of person ${person.age}`)
// person.city = "Berlin"
// console.log(person)

//--------------------задача-----------------
// Создать объект с названием и ценой продукта и вывести данные в консоль


// const product = {
//   nameProduct: 'Milk',
//   price: 1}
// console.log(`Name of product: ${product['nameProduct']}`)
// console.log(`Product price: ${product['price']}`)
// console.log(`Name of product: ${product.nameProduct}`)
// console.log(`Product price: ${product.price}`)

// const product = {
//   title: "Macbook",
//   price: 2000
// }
// console.log(`Name of product ${product.title}`)
// console.log(`Price of product ${product.price}`)


//--------------------array of objects-----------------

// const users = [
//   {
//     id: 1,
//     name: "John",
//     age: 25
//   },
//   {
//     id: 2,
//     name: "Mary",
//     age: 20
//   },
//   {
//     id: 3,
//     name: "Bob",
//     age: 23
//   }
// ]
// {
// ключ / название свойства : значение
// }

// for(let i = 0; i < users.length; i++){
  // let user = users[i]

  // const {name:firstName, age} = users[i]   // замена свойтства у обьекта
  // деструктиризация
  // let {перечисляем названия свойств чьи значения хотим забрать} = переменная где храниться обьект
//   console.log(`Name of user ${users[i].firstName} and age ${users[i].age}`)
// }

//
// let arr = [0, 1, 2, 3]
// const [a, b, c, d] = arr
// a = 0; b = 1; c = 2; d = 3
//
let id = Symbol("id")
let secondId = Symbol("id")
const user = {
  id: 1,
  [id]: 2,
  [secondId]: 3
}

console.log(user[id]) // 2
console.log(user[secondId]) //3