// // DOM
// let paragraph = document.querySelector('p')
// let paragraphs = document.querySelectorAll('.p1')
// // .innerText
// //.innerHTML
// let paragraph2 = document.querySelector('.p2')
// console.log(paragraph2.innerHTML);
// console.log(paragraph2.innerText);

// // setAttribute('href', '...')
// // hasAttribute
// // getAttribute

// let link = document.querySelector('a')

// console.log(link.hasAttribute('href')); // true
// console.log(link.hasAttribute('target')); // false

// console.log(link.getAttribute('href')); // https://www.google.com

// let paragraph3 = document.querySelector('.change')
// paragraph3.classList.add('p3')
// paragraph3.classList.remove('changeSize')
// paragraph3.classList.toggle('p3') // delete
// paragraph3.classList.toggle('p3') // add
// //paragraph3.contains('changeColor') // true

// paragraph3.classList.replace('p3', 'text3')

// let block1 = document.createElement('div')
// // методы вставки
// block1.innerText = 'div'

// document.body.append(block1)
// document.body.prepend(block1)
// paragraph3.before(block1)
// paragraph3.after(block1)

// paragraph3.remove()

// // block1.addEventListener('click', showMessage)
// // block1.removeEventListener('click', showMessage)
// // block1.addEventListener('click', function(){block1.remove()}) //удаление div

// block1.addEventListener('click', function(){paragraph2.remove()})

//======================= Задача 01 ==============================
// 1. Написать программу, которая находит параграфы и заменяет в каждом из них текст на "привет"

// let paragraphs = document.querySelectorAll('p')

// for(let element of paragraphs){
//   console.log(element);
//   console.log(element.innerText);

//   element.innerText = 'Hello'
// }


//======================= Задача 02 ==============================

// 2.	Написать скрипт, который находит параграфы и первым 3 параграфам меняет текст на указанные пользователем значения. 
// let expression = prompt()
// let element = document.querySelectorAll('p')
// for(let i =0; i<3; i++){
//   element[i].innerText = expression
// }


// let expression = [] 
// let element = document.querySelectorAll('p')
// for(let i =0; i<3; i++){
//   expression[i] = prompt()
//   element[i].innerText = expression
// }

//======================= Задача 03 ==============================

// 3.	Написать скрипт, который находит картинки в блоке с классом main и первым 5 картинкам меняет url на указанное значение. 
// let url = 'https://google.com'
// let t = document.querySelectorAll('img')
// for (let i = 0; i < 5; i++) {
//   t[i].setAttribute('src', url);
// }

// const img = document.querySelectorAll("main>img")
// for (let index = 0; index < 5; index++) {
//   img[index].src = url
// }
//======================= Задача 04 ==============================
//4.	Написать скрипт, который находит все ссылки на странице и формирует массив со всеми адресами. В итоге этот массив необходимо вывести в консоль. 

// const a = document.querySelectorAll("a")
// let array = [] 
// for (let i = 0; i < a.length; i++) {
//   let findA = a[i].getAttribute('href')
//   array.push(findA)
// }
// console.log(array);