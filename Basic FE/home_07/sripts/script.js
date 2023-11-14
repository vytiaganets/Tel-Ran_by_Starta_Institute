//=========================Задача 1=========================
// Напишите функцию, которая принимает два числовых аргумента и возвращает наименьшее из них.

// function max(a, b) {
//   if (a > b) {
//     return a
//   } else {
//     return b
//   }
// }
// console.log(max(10, 20)); // 20

//=========================Задача 2=========================
// Напишите функцию, которая принимает два числовых аргумента и выводит в консоль все четные числа от большего к меньшему.

// function createArrFromRange(a, b) {
//   let arr = []
//   let min = a //предполагаем что а минимальное значение
//   let max = b //предполагаем что b максимальное значение
//   if (a > b) {
//     min = b
//     max = a
//   }

//   for (let i = max; i >= min; i--) { // вставляем  min max в свои места
//     if (i%2 === 0) {
//       arr.push(i)
//     }
//   }
//   return arr
// }
// let result = createArrFromRange(10, 20)
// console.log(result) //[20, 18, 16, 14, 12, 10] (6)
// console.log(createArrFromRange(10, 20)); //[20, 18, 16, 14, 12, 10] (6)
// console.log(createArrFromRange(20, 10)); //[20, 18, 16, 14, 12, 10] (6)

//=========================Задача 3=========================
// Напишите функцию power, которая принимает два числовых аргумента (основание степени и саму степень) и возвращает число в указанной степени. Значение степени должно быть указано по умолчанию 2.

// function power(a, b=2) {
//   return a ** b
// }
// console.log(power(1)); //1
// console.log(power(3, 3)); //27
// console.log(power(3)); //9

//=========================Задача 4=========================
// Напишите функцию, которая принимает числовой аргумент n и считает сумму чисел от 1 до n.

// function sum(a) {
//   let sum1 = 0;
//   for(let i = 1; i <= a; i++){
//       sum1 += i;
//       }
//       return sum1
// }
// console.log(sum(2)) //3
// console.log(sum(1)) //1
// console.log(sum(3)) //6

//=========================Задача 5=========================
// Напишите функцию, которая принимает два числовых аргумента n и m и считает сумму четных чисел и нечетных чисел от n до m. Суммы выведите в консоль (в начале сумму четных чисел, а затем сумму нечетных).

// function createSum(n, m) {

//   let evenSum = 0
//   let oddSum = 0
//   for (let i = n; i <= m; i++) {
//     if (i % 2 === 0) {
//       evenSum += i
//     } else {
//       oddSum += i
//     }
//   }
//   return {
//     oddSum: oddSum,
//     evenSum: evenSum
//   }
// }
// console.log(createSum(1, 2)) //{oddSum: 1, evenSum: 2}
// let result = createSum(10, 20)
// console.log(result) //{oddSum: 75, evenSum: 90}


//=========================Задача 6=========================
// Напишите функцию, которая принимает в качестве аргументов массив строк, а возвращает первый самый длинный элемент массива. Если входной массив пуст, функция возвращает null. Если есть несколько одинаковых по длине элементов - функция возвращает первый из этих элементов. 
// Пример: [ 'one', 'two', 'three' ] => 'three'

// let arr = ['one', 'two', 'three']
// let maxStr = '';

// function countOfWords(arr) {


//   for (let i = 0; i < arr.length; i++) {
//     if (arr[i].length>maxStr.length) {
//       maxStr=arr[i]
//     }
//   }
//   return maxStr;
// }
// console.log(countOfWords(arr)); // three


//=========================Задача 9=========================
// Используя цикл, выведите в консоль сумму чисел из диапазона значений от 0 до 50 кратные 5.

// let sum = 0;
// for (let i = 0; i <= 50; i++) {
//   if (i % 5 === 0) {
//     sum += i;
//   }
// }
// console.log(sum);

//=========================Задача 10=========================
// Написать цикл, который выводит только названия товаров

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
//     title
//   } = goods[i]
//   console.log(`${goods[i].title}`);
// }
// bicycle
// roller-skates
// kick scooter
// skis
// skate

//=========================Задача 11=========================
// Написать цикл, который выводит для каждого товара строку по маске “<название> (<цена со скидкой>)”

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
// let result
// for (let i = 0; i < goods.length; i++) {
//   const {
//     title,
//     price,
//     discount
//   } = goods[i]
//   if (discount > 0) {
//     result = (price * discount) / 100
//   } else {
//     result = price
//   }
//   console.log(`${goods[i].title}(${result}))`);
// }
// bicycle(4500))
// roller-skates(750))
// kick scooter(3000))
// skis(2500))
// skate(10000))

//=========================Задача 12=========================
// Написать функцию, которая получает в качестве аргумента массив из объектов и возвращает объект с самым дорогим товаром (без учета скидки).

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

// let result = ''
// let maxPrice = 0

// function maxProduct(myGoods) {

//   for (let i = 0; i < goods.length; i++) {
//     const {
//       title,
//       price
//     } = goods[i]
//     if (myGoods[i].price > maxPrice) {
//       maxPrice = myGoods[i].price
//       result = myGoods[i].title
//     }
//   }
//   console.log(result);
// }
// maxProduct(goods) // bicycle
