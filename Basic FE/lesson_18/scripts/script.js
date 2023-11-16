// document это обьект для работы с ДОМ деревом
// querySelector метод который позволяет получить любой элементов из ДОМ дерева с помощью указателя

// =================querySelector

// console.log("Hello"); // Hello

// const pElem = document.querySelector("p")
// console.log(pElem); // <p>Hello world!</p>


// const secondPElem = document.querySelector(".second_p")
// console.log(secondPElem)
// innerText текстовый контект элемента
// console.log(secondPElem.innerText);
// secondPElem.innerText = "Hello frrom JavaScript"

// =================querySelectorAll
//querySelectorAll возвращает только колекцию узлов
// const pElems = document.querySelectorAll("p")
// console.log(pElems);

// pElems.push("hello") // errorr
// console.log(pElems);

// for(let i = 0; i < pElems.length; i++){
//   console.log(pElems[i]);
//   pElems[i].innerText = "Hello from JavaScript"
// }
// push, pop, shift, unshift
// 1 методы массивов не работают над NodeList
// 2 коллеции могут быть живыми, могут реагировать на изменения ДОМ дерева
// 3 NodeList предоставляется средой выполнения браузера, а массивы Array() встроен в JavaScript

// =================Задача 1=================
// Написать программу, которая находит параграфы по классу и заменяет в каждом из них текст на “привет”. 

// const secondPElems = document.querySelectorAll(".second_p")

//  for(let i = 0; i < secondPElems.length; i++){
//     secondPElems[i].innerText = "Hello from JavaScript"
//   }

// =================Задача 2=================

// поменять текст параграфа с классом p_world на "World", который находится внутри элемента с классом container
//css: .containerr .p_world


// const pWorld = document.querySelector(".container .p_world")
// pWorld.innerText = "World"
// pWorld.style.color = "red"


// =================innerHTML=================
//innerHTML возвращает весь html контен в ввиде строки
//  const divContainer = document.querySelector(".container")
//  divContainer.innerHTML = '<a style="color: red" href="https://tel-ran.de/" target="_blank">Tel-Ran</a><br><a style="color: blue" href="https://tel-ran.de/" target="_blank">Tel-Ran</a>'


// =================Задача 3=================
// получить имя пользователя с помощью prromt и добавить внутри параграфа текст 'Hello username'
// const userName = prompt("Напишите свое имя")
// const pGreet = document.querySelector(".greet")
// pGreet.innerText = `Hello ${userName}` // Hello 1

// =================attributes=================
//setAtribute позволяет добавить или менять значения аттрибутов
// setAtribute позволяет полуйчить значение атрибута по названию
// const aElem = document.querySelector(".first_link")
// console.log(aElem.href);
// //aElem.href = "https://www.google.com.ua/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png"
// aElem.setAttribute("href", "https://tel-ran.de/")
// aElem.setAttribute("data-status", "active")
// console.log(aElem.getAttribute("data-status"))


// const imgElem = document.querySelector("img")
// console.log(imgElem.src);
// // imgElem.src = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FGirl&psig=AOvVaw1DgC8tXpjweSmK3GUyXX_s&ust=1700132774108000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCMjhyKLuxYIDFQAAAAAdAAAAABAE"

// imgElem.setAttribute("src", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FGirl&psig=AOvVaw1DgC8tXpjweSmK3GUyXX_s&ust=1700132774108000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCMjhyKLuxYIDFQAAAAAdAAAAABAE")

// =================Задача 4=================
// Написать скрипт, который находит картинки в блоке с классом main и первым 5 картинкам меняет url на указанное значение. 
// Написать скрипт, который находит картинки в блоке с классом main и первым 5 картинкам меняет url на указанное значение. (https://www.dice.com/binaries/medium/content/gallery/dice/insights/2021/03/shutterstock_1536573389.jpg) 


// const imgElem = document.querySelectorAll(".main img")
// for (let i = 0; i < 5; i++) {
//   imgElem[i].setAttribute("src", "https://www.dice.com/binaries/medium/content/gallery/dice/insights/2021/03/shutterstock_1536573389.jpg")
// }

// =================Задача 5=================

// Написать скрипт, который находит все ссылки на странице и формирует массив со всеми адресами. В итоге этот массив необходимо вывести в консоль

const aLinks = document.querySelectorAll("a")
const hrefValues = []
for(let i = 0; i < aLinks.length; i++){
  const hrefValue = aLinks[i].href
hrefValues.push(hrefValue)
}
console.log(hrefValues);