//=======================Задача 1=======================
//Написать цикл, который создает множество параграфов с каждым десятым числом в промежутке от 100 до 50 (т.е. 100, 90, 80, 70, 60, 50). Добавить созданные параграфы в div с классом numbers.

const rootDiv1 = document.querySelector("#numbers")
for (let i = 100; i >= 50; i--) {

  if (i % 10 === 0) {
    const newPElem = document.createElement("p")
    newPElem.innerText = i
    rootDiv1.append(newPElem)
  }
}
//<div id="numbers"><p>100</p><p>90</p><p>80</p><p>70</p><p>60</p><p>50</p></div>

//=======================Задача 2=======================
//Написать цикл, который проходится по массиву строк, для каждой строки создает параграф и добавляет его в div с классом strings_container. Строки взять произвольные.

const strArray = ["Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit.", "Nam", "perferendis", "debitis", "reiciendis", "enim", "rerum", "animi", "vero", "obcaecati", "fuga"]
const rootDiv2 = document.querySelector("#strings_container")
for (let i = 0; i < strArray.length; i++) {
  const newPElem = document.createElement("p")
  newPElem.innerText = strArray[i]
  rootDiv2.append(newPElem)
}
// <div id="strings_container"><p>Lorem</p><p>ipsum</p><p>dolor</p><p>sit</p><p>amet</p><p>consectetur</p><p>adipisicing</p><p>elit.</p><p>Nam</p><p>perferendis</p><p>debitis</p><p>reiciendis</p><p>enim</p><p>rerum</p><p>animi</p><p>vero</p><p>obcaecati</p><p>fuga</p></div>

//=======================Задача 3=======================
//Написать цикл, который проходится по массиву с объектами - у объектов свойства first_name, last_name и  age (данные взять произвольные) - и создает карточки только для совершеннолетних пользователей. Карточка должна содержать информацию об имени, фамилии и возрасте пользователя. Добавить все карточки в div с классом users_container.

const person = [{
    firstName: 'John',
    lastName: 'Dou',
    age: 55
  },
  {
    firstName: 'Bob',
    lastName: 'Dilan',
    age: 35
  },
  {
    firstName: 'Jake',
    lastName: 'Smith',
    age: 14
  }
]
const rootDiv3 = document.querySelector("#users_container")
for (let i = 0; i < person.length; i++) {
  if (person[i].age > 18) {

    const pElem = document.createElement('p')
    pElem.innerText = `${person[i].firstName}  ${person[i].lastName} ${person[i].age}`

    const br = document.createElement("br")
    rootDiv3.append(pElem, br)
  }
}
// <div id="users_container"><p>John  Dou 55</p><br><p>Bob  Dilan 35</p><br></div>

//=======================Задача 4 дополнительно=======================
//1 - Рассматривать кейс, в котором создается div с картинкой и ссылкой внутри.

const blockDiv1 = document.querySelector("#img1")

const imgElem = document.createElement("img") // <img>
imgElem.src = '/Basic FE/home_08/media/lev.jpg'
imgElem.alt = 'Lev'

const aElem = document.createElement("a") // <a></a>

aElem.innerText = 'Click me' // <a href = {aHref}>Click me</a>
aElem.href = 'https://www.zoodvorec.cz/images/preview/1664970478.jpg'
blockDiv1.append(imgElem, aElem)


const a=document.createElement('a');
a.href='http://www.google.com';
const image = document.getElementById('myPicture').getElementsByTagName('img')[0];
b=a.appendChild(image);
document.getElementById('myPicture').appendChild(a);
//=======================Задача 5 дополнительно=======================
//2 - Создать функцию, которая получает ссылку на картинку и ссылку на сайт и возвращает элемент.



//=======================Задача 6 дополнительно=======================
//3 - Создать множество карточек с товарами (на основе массива с объектами. У объекта свойства title, unitprice, count) -> массив с продуктами https://pastebin.com/1PDjyE0J 



//=======================Задача 7 дополнительно=======================
//4 - Написать скрипт, который выводит карточки с товарами в интерфейс (на основе массива с объектами. У объекта свойства title, unitprice, count), а внизу выводится итоговая сумма товаров и их количество
