// https://docs.google.com/document/d/1K9mudqA6yufWhX0bl-j3S347z3N-dh8r/edit#heading=h.gjdgxs
//================================ Задача 01 ================================
// Создать в html форму с тремя инпутами (имя, фамилия, возраст). Написать скрипт, который при отправке формы выводит собранные данные в консоль.
const formElem = document.querySelector("#user_form")
const nameInput = document.querySelector(".name_input")
const surnameInput = document.querySelector(".surname_input")
const ageInput = document.querySelector(".age_input")
//console.log(formElem);

let users = [
  {
    name: "Bob",
    surname: "Dilon",
    age: 25
  },
  {
    name: "Mari",
    surname: "Huston",
    age: 45
  },
  {
    name: "Andre",
    surname: "Kar",
    age: 90
  }
]

formElem.addEventListener("submit", function(e) {
  e.preventDefault()
  //  console.log(`Имя: ${nameInput.value}`)
  //  console.log(`Фамилия: ${surnameInput.value}`)
  //  console.log(`Возраст: ${ageInput.value}`)
// [Log] Имя: Bob (script.js, line 30)
//[Log] Фамилия: Boa (script.js, line 31)
//[Log] Возраст: 11 (script.js, line 32)

  const user = {
    name: nameInput.value,
    surname: surnameInput.value,
    age: +ageInput.value
  }

  users.push(user)
  
  console.log(users);

  //[{name: "Bob", surname: "Dilon", age: 25}, {name: "Mari", surname: "Huston", age: 45}, {name: "Andre", surname: "Kar", age: 90}, {name: "Bob", surname: "Boa", age: 1}] (4)
  rerender()

  formElem.reset() // очищает значение инпутов которые находятся внутри формы formElem

})
//================================ Задача 02 ================================
// Доработать процесс таким образом, чтобы при отправке формы данные из нее добавлялись в массив users в виде объекта.

//================================ Задача 03 ================================
// Реализовать функцию rerender. Эта функция очищает контейнер с карточками и создает множество карточек с пользователями из массива. Настроить rerender при добавлении нового пользователя.

function createUserCard({name, surname, age}) { 
  const pName = document.createElement('p')
  pName.innerText = name
  const pSurname = document.createElement('p')
  pSurname.innerText = surname
  const pAge = document.createElement('p')
  pAge.innerText = age
  const userCard = document.createElement('div')
  userCard.classList.add("user_card")

  userCard.append(pName, pSurname, pAge)

  return userCard
}

//================================ Задача 04 ================================
// Доработать rerender таким образом, чтобы при двойном клике по карточке из массива удалялся пользователь по id и вызывался rerender.

function rerender() {
  const usersListDiv = document.querySelector(".users_list_container")
  usersListDiv.innerHTML = "" // очищаем контейнер с карточками

  if (users.length === 0) {
    const pElem = document.createElement('p')
    pElem.innerText = "Пользователей нет"
    pElem.classList.add("empty_msg")
    usersListDiv.append(pElem)
  }
 
  // users = users.sort(function(a, b) {
  //   return a.name.localeCompare(b.name)
  // })

  for(let i = 0; i < users.length; i++) {
    const userCardElem = createUserCard(users[i])
    userCardElem.addEventListener("dblclick", function() {
      // console.log(users[i].name)
      // console.log(users[i].surname)
      // console.log(users[i].age)

    })

    const remove = userCardElem // удаление
    remove.addEventListener("dblclick", function() {
      users.splice(i, 1)
      rerender()
    })

    const btnRemove = createRemoveBtn()
    userCardElem.append(btnRemove)

    btnRemove.addEventListener("dblclick", function() {
      users.splice(i, 1)
      rerender()
    })

    usersListDiv.append(userCardElem)
  }
}

function createRemoveBtn() {
  const btnRemove = document.createElement("button")
  btnRemove.innerText = "X"
  btnRemove.classList.add("remove_btn")
  return btnRemove
} 

//================================ Задача 05 ================================
// Второстепенные задачи:
// 1 - добавить валидацию данных:
// запретить добавления пользователя с пустыми значениями
// сделать ограничение количества символов для имени и фамилии
// Пример: мин - 2 символа, макс - 16

//================================ Задача 06 ================================
// 2 - если данные не проходят валидацию сообщения показать в виде красного текста внутри формы либо под формой добавления пользователя, если всё нормально убрать красный текст

//================================ Задача 07 ================================
// 3 - добавить сортировку по имени, фамилии, возрасту и сделать так чтобы можно было выбрать либо по убыванию, либо по возрастанию

const filterForm = document.querySelector("#user_filters_form")
const searchTextInp = document.querySelector(".search_text")
const sortFieldElem = document.querySelector("#sort_field")

filterForm.addEventListener("change", function (e) {
  e.preventDefault()
  console.log(filterForm.value)

  if (sortFieldElem.value === 'name') {
    users = users.sort(function(a, b) {
      return a.name.localeCompare(b.name)
    })
  } else if (sortFieldElem.value === 'rname') {
    users = users.sort(function(a, b) {
      return b.name.localeCompare(a.name)
    })
  } else if (sortFieldElem.value === 'surname'){
    users = users.sort(function(a, b) {
      return a.surname.localeCompare(b.surname)
    })
  } else if (sortFieldElem.value === 'rsurname'){
    users = users.sort(function(a, b) {
      return b.surname.localeCompare(a.surname)
    })
  } else if (sortFieldElem.value === 'age') {
    users = users.sort(function(a, b) {
      return a.age - b.age
    })
  } else if (sortFieldElem.value === 'rage') {
    users = users.sort(function(a, b) {
      return b.age - a.age
    })
  } 

  rerender()
})


rerender() // вызываем прорисовку продуктов при открытии страницы