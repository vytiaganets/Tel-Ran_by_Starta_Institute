// функция которая передается как аргумент другой функции называется callback функцией

// function doWithUserName(firstName, callback) {  // firstName = "John" = pintHello
//   callback(firstName) // printHello("John")

// }

// function printHello(userName) { // userName = "John"
//   console.log(`Hello ${userName}`); // Hello John
// }

// function printBye(userName) {
//   console.log(`Bye ${userName}`);
// }

// function printHowAreYou(userName) {
//   console.log(`How are you ${userName}`);
// }

// doWithUserName("John", printHello)

// doWithUserName("John", printHowAreYou)

// doWithUserName("John", printBye)
//===============Task  1=================
//Написать функцию forEach, которая принимает в качестве первого аргумента массив, а в  качестве второго функцию и вызывает принятую функцию для каждого элемента массива. 
// function forEach(arr, callback) {
//   for(let i=0; i<arr.length; i++){
//     console.log(arr[i]);
//   }
// }
// const arr = [5, 16, 1, -6, 25, 15, -63, 48]
//forEach(arr)
// [Log] 5 (script.js, line 29)
// [Log] 16 (script.js, line 29)
// [Log] 1 (script.js, line 29)
// [Log] -6 (script.js, line 29)
// [Log] 25 (script.js, line 29)
// [Log] 15 (script.js, line 29)
// [Log] -63 (script.js, line 29)
// [Log] 48 (script.js, line 29)

// function printElem(elem) {
//   console.log(elem);
//   ca
// }

// function printElemPow(elem) {
//   console.log(elem**2);
// }

// function printEvenElem(paelemrams) {
//   if(elem%2 === 0){
//     console.log(elem);
//   }
// }
// forEach(arr, printElem)
// forEach(arr, printElemPow)
// forEach(arr, printEvenElem)

//================= addEventListener ==============
//Повесить событие клика на кнопку таким образом, чтобы при нажатии на нее в консоль выводилась строка. Жмак. 

// function clicked() {
//   console.log("Clicked");
// }
// const printBtn = document.querySelector(".print_str")
// //printBtn.addEventListener("click", clicked) // когда нужно функцию использовать в другом месте кода то создаем ее отдельно
// printBtn.addEventListener("click", function(){ // когда ненужно функцию использовать в другом месте кода то создаем ее сразу внутри аргументов
//   console.log("Cliked"); // 3 Cliked
// })
// линтеры используются для поиска проблем в колбеках

//================= Задача 2 ==============
//  
// Переделать кнопку таким образом, чтобы при нажатии на нее в параграфе в интерфейсе значение увеличивалось на 1. В начале рассмотрите процесс, при котором мы каждый раз считываем число из параграфа, меняем и записываем обратно, а потом переделайте процесс так, чтобы значение хранилось в переменной, изменялось при клике и записывалось в параграф. 

// const printBtn = document.querySelector(".print_str")
// const pCounter = document.querySelector(".counter")

// 1 способ
// printBtn.addEventListener("click", function(){
//   let counter = +pCounter.innerText
//   counter++
//   pCounter.innerText = counter
// })

// 2 способ
// let counter = 0

// printBtn.addEventListener("click", function(){
//   counter++
//   pCounter.innerText = counter
// })



//================= Задача 3 ==============
// Написать программу, которая создает две кнопки и вешает на них событие нажатия. При нажатии на плюс в консоль выводится число, увеличивающееся на 1, а при нажатии на минус - уменьшившееся на 1. 
// *  Для решения 3 задачи понадобится создать переменную и изменять ее при нажатии на ту или иную кнопку. 

// const printBtnPlus = document.querySelector(".btn_plus")
// const printBtnMinus = document.querySelector(".btn_minus")

// const pCounter = document.querySelector(".counter")

// let counter = 0

// printBtnPlus.addEventListener("click", function(){
//   counter++
//   pCounter.innerText = counter
// })

// printBtnMinus.addEventListener("click", function(){
//   counter--
//   pCounter.innerText = counter
// })
// 2 способ
// const button1 = document.createElement('button');
// button1.setAttribute('type', 'button');
// button1.classList.add('btn1');
// button1.textContent = '+';
// const button2 = document.createElement('button');
// button2.setAttribute('type', 'button');
// button2.classList.add('btn2');
// button2.textContent = '-';
// document.body.append(button1, button2);
// // const printBtnPlus = document.querySelector(".btn1")
// // const printBtnMinus = document.querySelector(".btn2")

// const pCounter = document.querySelector(".counter")

// let counter = 0

// button1.addEventListener("click", function(){
//   counter++
//   pCounter.innerText = counter
// })

// button2.addEventListener("click", function(){
//   counter--
//   pCounter.innerText = counter
// })


// 3 способ

// const btnPlus = document.createElement("button")
// const btnMinus = document.createElement("button")
// btnMinus.innerText = "Minus"
// btnPlus.innerText = "Plus"

// let pCounter = 0
// btnPlus.addEventListener("click", function () {
//     pCounter++
//   console.log(pCounter)
// })
// btnMinus.addEventListener("click", function () {
//   pCounter--
//  console.log(pCounter);
// })
// document.body.append(btnPlus, btnMinus)

//===================== event object ========================
// представляет более подробную информацию про событие
// const btnElem = document.createElement("buton")

// btnElem.innerText = "Click"
// btnElem.addEventListener("click", function (event){
//   console.log('clicked');
//   console.log(event);
// })
// document.body.appendChild(btnElem)

// // keydown 
// document.addEventListener("keydown", function () {
//   console.log("key pressed");
// })

// document.addEventListener("keyup", function () {
//   console.log("key up");
// })

//===================== Task 3 ====================
// Повесить обработчик на нажатие клавиш клавиатуры и при вводе букв добавить их в параграф. Для решения этой задачи понадобится использование объекта event. 


// const pElem = document.querySelector(".content")
// document.addEventListener("keydown", function (e) {
//   //   console.log("key pressed");
//   console.log(e);
//   pElem.innerText += e.key
//   if (e.key === "Tab") {
//     pElem.innerText += "   "
//   } else if (e.key === 'Backspace') {
//     //"hello" => ["h", "e", "l", "l", "o"]
//     let letterArr = pElem.innerText.split("")
//     letterArr.pop() // ["h", "e", "l", "l", "o"]
//     pElem.innerText = letterArr.join("") // ["h", "e", "l", "l"] => "hell"
//   } else {
//     pElem.innerText += e.key
//   }
// })

//===================== Task 4 ====================

//Написать программу, которая формирует на основе массива строк множество параграфов и выводит их в интерфейс. 
//При клике на параграф текст должен меняться на звездочки 
const words = ["Lorem", "ipsum", "dolor", "sit", "amet", "consectetur,", "adipisicing", "elit."]

for (let i = 0; i <= words.length; i++) {
  //console.log(words[i]);
  const pElem = document.createElement("p")
  pElem.innerText = words[i]
  document.body.append(pElem)

  pElem.addEventListener("click", function () {
    pElem.innerText = "*****"
  })
}