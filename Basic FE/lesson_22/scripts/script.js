// const pElem = document.querySelector("p")
// // classList коллекция классов html узла
// //console.log(pElem.classList);
// // add позволяет добавлять новый класс к элементу перечисляя их через запятую
// pElem.classList.add("third_class")
// console.log(pElem.classList);
// // remove позволяет удалять новый класс к элементу перечисляя их через запятую

// pElem.classList.remove("first_class")
// // contains проверка ккласса на наличие
// console.log(pElem.classList.contains("second_class"));//false
// console.log(pElem.classList.contains("first_class"));// true

// // toggle если класс существует то удаляет его если наоборот то добавляет его
// pElem.classList.toggle("second_class") // т.к. second_class не существует toggle его добавит
// pElem.classList.toggle("first_class") // т.к. first_class  существует toggle его удалит

// //=====================Task 1=====================
// Реализовать 10 карточек с числами от 0 до 9 и при нажатии на какую-либо карточку присвоить ей класс active. В классе active должны быть стили, которые меняют цвет текста и цвет заднего фона местами. 

// const numCadsDiv = document.createElement("div")
// numCadsDiv.classList.add('nums_cards')
// for (let i = 0; i <= 9; i++) {
//   const numCardDiv = document.createElement("div") // <div class="card">i</div>
//   numCardDiv.classList.add('card')
//   numCardDiv.innerText = i
//   numCardDiv.addEventListener("click", function () {
//     numCardDiv.classList.add("active")
//   })
//   numCadsDiv.appendChild(numCardDiv)
// }
// document.body.appendChild(numCadsDiv)


//========================Task 2==================

//Доработать прошлый скрипт таким образом, чтобы при повторном нажатии класс active удалялся.
// const numCadsDiv = document.createElement("div")
// numCadsDiv.classList.add('nums_cards')
// for (let i = 0; i <= 9; i++) {
//   const numCardDiv = document.createElement("div") // <div class="card">i</div>
//   numCardDiv.classList.add('card')
//   numCardDiv.innerText = i
//   numCardDiv.addEventListener("click", function () {
//     // if (numCardDiv.classList.add("active")) { // 1 способ
//     //   numCardDiv.classList.remove("active")
//     // } else {
//     //   numCardDiv.classList.add("active")
//     // }

//     numCardDiv.classList.toggle("active") // 2 способ
//   }) 
//   numCadsDiv.appendChild(numCardDiv)
// }
// document.body.appendChild(numCadsDiv)

//========================= style =========================
// const divElem = document.createElement("div")
// divElem.innerText = 'Hello'
// divElem.style.width = "150px"
// divElem.style.height = "150px"
// divElem.style.borderRadius = "50%"
// divElem.style.backgroundColor = "silver"
// divElem.style.display = "flex"
// divElem.style.justifyContent = "center"
// divElem.style.alignItems = "center"
// divElem.style.cursor = "pointer"
// document.body.appendChild(divElem)

//========================= Task 3 =========================
// Создать квадратный div и при наведении курсора на него цвет div-а рандомно менять цвет
// const divElem = document.createElement("div")
// divElem.style.width = "150px"
// divElem.style.height = "150px"
// divElem.style.backgroundColor = "silver"
// document.body.append(divElem)
// red green blue silver 
// #FAFAFF -> 0 1 2 3 4 5 6 7 8 9 a b c d e f
// rgb(123, 152, 130)  -> [0-255] - оптимальный вариант для псевдослучайные числа
// Math.random() => [0-1)
// Math.floor(254.9) => 254
// Math.ceil(254.1) => 255
// Math.raund(254.5) => 255
// Math.ceil(Maath.random()*255) -> [0 - 255]

// function GetRandomColor(){
//   // console.log("mouseover")
//   const red = Math.ceil(Math.random()*255)
//   const green = Math.ceil(Math.random()*255)
//   const blue = Math.ceil(Math.random()*255)
//   const rgb = `rgb(${red}, ${green}, ${blue})`
//   return rgb
// }
//   divElem.addEventListener("mouseover", function(){
//     divElem.style.backgroundColor = GetRandomColor()
// })

// divElem.addEventListener("mouseout", function(){
//   divElem.style.backgroundColor = GetRandomColor()
// })


//========================= Task 3 =========================

//Написать цикл, который создает множество div-ов c цветами от rgb(128, 128, 0) до rgb(128, 128, 255). У дивов цвет должен меняться с шагом 5.
// rgb(128, 128, 0)
// rgb(128, 128, 5)
// rgb(128, 128, 10)

// for (var i = 0; i < 255; i += 5) {
//   const divElem = document.createElement("div")
//   divElem.style.width = "100%"
//   divElem.style.height = "2vh"
//   divElem.style.backgroundColor = `rgb(128, 128, ${i})`
//   document.body.appendChild(divElem)
// }