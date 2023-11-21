//============================ Задача 1 =====================================
// Создать кнопку и красный квадрат с размерами 200х200px. При клике на кнопку менять у квадрата цвет заднего фона на зеленый и уменьшать его до размеров 100х100px.

// const divElem = document.createElement("div")
// const btnElem = document.createElement("button")
// divElem.style.width = "200px"
// divElem.style.height = "200px"
// divElem.style.backgroundColor = "red"
// btnElem.textContent = 'Click me';
// document.body.append(divElem)
// btnElem.addEventListener("click", function () {
//   divElem.style.backgroundColor = "green"
//   divElem.style.width = "100px"
//   divElem.style.height = "100px"
// })
// document.body.append(btnElem)



//============================ Задача 2 =====================================

// Создать кнопку и розовый квадрат с размерами 200х200px. При клике на кнопку менять цвет на синий и выводить в консоль обновленный цвет квадрата.

// const divElem = document.createElement("div")
// const btnElem = document.createElement("button")
// divElem.style.width = "200px"
// divElem.style.height = "200px"
// divElem.style.backgroundColor = "pink"
// btnElem.textContent = 'Click me';
// document.body.append(divElem)
// btnElem.addEventListener("click", function () {
//   divElem.style.backgroundColor = "blue"
//   console.log(`Обновленный цвет квадрата: ${divElem.style.backgroundColor} `);
// })
// document.body.append(btnElem)

//============================ Задача 3 =====================================

// Создать кнопку и квадрат с размерами 150х150px. При клике на кнопку увеличивать высоту и ширину квадрата на 20px.

// const divElem = document.createElement("div")
// const btnElem = document.createElement("button")
// divElem.style.width = "150px"
// divElem.style.height = "150px"
// divElem.style.backgroundColor = "red"
// btnElem.textContent = 'Click me';
// document.body.append(divElem)
// let counter = 150
// btnElem.addEventListener("click", function () {
//   counter += 20
//   divElem.style.width = `${counter}px`
//   divElem.style.height = `${counter}px`
// })
// document.body.append(btnElem)

//============================ Задача 4 =====================================

// Создать кнопку и div с классом root. При клике на кнопку в div создается параграф синего цвета. Текст параграфа произвольный.

// const divElem = document.createElement("div")
// const btnElem = document.createElement("button")
// divElem.classList.add('root');
// btnElem.textContent = 'Click me';
// btnElem.addEventListener("click", function () {
//   const pElem = document.createElement("p")
//   pElem.innerText = 'Текст параграфа синий.'
//   pElem.style.color = "blue"
//   document.body.appendChild(pElem)
// })
// document.body.appendChild(btnElem)
// document.body.appendChild(divElem)

//============================ Задача 5 =====================================

// Создать кнопку и div с классом root. При клике на кнопку в div создаются по очереди параграфы синего и зеленого цветов. Первый цвет синий.

// const divElem = document.createElement("div")
// const btnElem = document.createElement("button")
// divElem.classList.add('root');
// btnElem.textContent = 'Click me';
// let counter = 0
// btnElem.addEventListener("click", function () {
//   counter += 1
//   const pElem = document.createElement("p")
//   if (counter% 2 === 0){
//   pElem.innerText = 'Текст параграфа синий.'
//   pElem.style.color = "blue"
// } else{
//   pElem.innerText = 'Текст параграфа зеленый.'
//   pElem.style.color = "green"
// }
//   document.body.appendChild(pElem)
// })
// document.body.appendChild(btnElem)
// document.body.appendChild(divElem)