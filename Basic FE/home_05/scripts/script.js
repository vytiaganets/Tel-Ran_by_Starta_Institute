// Написать программу, которая через prompt считывает число и выводит в консоль число равное 10% от введенного числа
let num = +prompt("Введите число: ")
console.log(`${num}` * 0.1)

// Написать программу, которая получает два числа и выводит наименьшее

let firstNum = +prompt("Введите первое число: ")
let secondNum = +prompt("Введите второе число: ")
firstNum < secondNum ? console.log(`${firstNum}`) : console.log(`${secondNum}`)

// Написать программу, которая считывает через prompt число и выводит одно из следующих сообщений: ‘Число меньше 100’, ‘Число больше 100’ или ‘Число равно 100’

let nummer = +prompt("Введите число: ")
if (nummer === 100) {
  console.log("Число равно 100")
} else if (nummer < 100) {
  console.log("Число меньше 100’")
} else if (nummer > 100) {
  console.log("Число больше 100")
}

// Написать программу, которая запрашивает у пользователя его имя и возраст (в годах) и выводит в консоль сообщение ‘Hello, <name>’, если пользователь совершеннолетний, или ‘Hi, <name>’, если пользователь несовершеннолетний.

let surname = prompt("Введите имя: ")
let age = +prompt("Введите возраст: ")
age > 18 ? console.log(`Hello, ${surname}`) : console.log(`Hi, ${surname}`)