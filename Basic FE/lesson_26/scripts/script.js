// const formElem = document.querySelector("form")
// const nameInputElem = document.querySelector(".name_input")
// nameInputElem.value = значение которое ввел пользователь
// submit событие отправки данных на сервер
// e.preventDefault() отменяет действие по умолчанию
// formElem.addEventListener("submit", function (e) {
//   e.preventDefault()
//   console.log("submitted")
//   console.log(nameInputElem.value)
// })

// в данном случае действие по умолчанию это открытие ссылки
// preventDefault отменяет это действие
// document.querySelector('a').addEventListener("click", function (e) {
//   e.preventDefault()
// })

// const formElemWithName = document.forms.first_form
// console.log(formElemWithName)

// 1) Создать форму в html (наименование товара и цена) и добавить скрипт, чтобы при отправке формы данные из нее выводились в консоль.
// 2) Доработать процесс таким образом, чтобы при отправке формы данные из нее добавлялись в массив с продуктами в виде объекта.
// {
//   title: "Macbook",
//   price: 2000
// }
// products
const formElem = document.querySelector("#product_form")
const productNameInput = document.querySelector(".product_name_input")
const productPriceInput = document.querySelector(".product_price_input")

let products = [
  {
    title: "Macbook",
    price: 2500
  },
  {
    title: "Notebook",
    price: 500
  },
  {
    title: "Laptop",
    price: 20
  },
  {
    title: "Blender",
    price: 200
  },
  {
    title: "GPU",
    price: 250
  }
]
formElem.addEventListener("submit", function(e) {
  e.preventDefault()
  // console.log(productNameInput.value)
  // console.log(productPriceInput.value)
  const product = {
    title: productNameInput.value,
    price: +productPriceInput.value
  }

  products.push(product)
  rerender()

  formElem.reset() // очищает значение инпутов которые находятся внутри формы formElem
})

// Добавить функцию, которая получает наименование карточки и цену и возвращает HTML элемент с карточкой товара.
function createProductCard({title, price}) { // let {title, price} = product
  const pTitle = document.createElement('p')
  pTitle.innerText = title
  const pPrice = document.createElement('p')
  pPrice.innerText = price
  const productCard = document.createElement('div')
  productCard.classList.add("product_card")

  productCard.append(pTitle, pPrice)

  return productCard
}

// Разработать функцию rerender. Эта функция очищает контейнер с карточками и создает множество карточек с товарами из массива. Вызвать rerender при добавлении нового продукта.
// Доработать rerender таким образом, чтобы при двойном клике по карточке в консоль выводилось название товара.
function rerender() {
  const productsListDiv = document.querySelector(".products_list_container")
  productsListDiv.innerHTML = "" // очищаем контейнер с карточками

  if (products.length === 0) {
    const pElem = document.createElement('p')
    pElem.innerText = "Товаров нет"
    pElem.classList.add("empty_msg")
    productsListDiv.append(pElem)
  }

  products = products.sort(function(a, b) {
    return a.title.localeCompare(b.title)
  })

  for(let i = 0; i < products.length; i++) {
    const productCardElem = createProductCard(products[i])
    productCardElem.addEventListener("dblclick", function() {
      console.log(products[i].title)
    })
    const btnRemove = createRemoveBtn()
    productCardElem.append(btnRemove)

    btnRemove.addEventListener("click", function() {
      // splice(a, b, ...c) 
      // a индекс начального элемента
      // b количество элементов которые надо удалить начания с индекса a
      // c необъязательный параметр, если надо заменить какими то другими значениями
      products.splice(i, 1) // индекс продукта в массиве products
      rerender()
    })

    productsListDiv.append(productCardElem)
  }
}

// Добавить функцию, которая возвращает кнопку в виде крестика в красном кружке.
// createRemoveBtn()
{/* <button class="remove_btn">X</button> */}
// <button></button>
// <button>X</button>
// <button class="remove_btn">X</button>
// Добавить в rerender добавление крестика в верхнем правом углу карточки товара.
function createRemoveBtn() {
  const btnRemove = document.createElement("button")
  btnRemove.innerText = "X"
  btnRemove.classList.add("remove_btn")
  return btnRemove
} 

// Добавить форму в HTML с полем ввода и кнопкой для поиска по товарам. Реализовать скрипт, который получает из формы строку при submit и выводит в консоль.
const filterForm = document.querySelector("#product_filters_form")
const searchTextInp = document.querySelector(".search_text")
const sortFieldElem = document.querySelector("#sort_field")
// change срабатывает тогда когда меняется значение какого то элемента внутри формы
// Меняем вызов обработчика формы с submit на change и убираем кнопку из формы.
// Сделать сортировку товаров по названию при change.
// Сделать сортировку товаров по цене при change.

filterForm.addEventListener("change", function (e) {
  e.preventDefault()
  console.log(searchTextInp.value)

  if (sortFieldElem.value === 'title') {
    products = products.sort(function(a, b) {
      return a.title.localeCompare(b.title)
    })
  } else if (sortFieldElem.value === 'price') {
    products = products.sort(function(a, b) {
      return b.price - a.price
    })
  }

  if (searchTextInp.value !== "") {
    // filter возвращает новый массив с элементами которые прошли проверку в callback функции
    products = products.filter(function(product) {
      return product.title.toLowerCase().includes(searchTextInp.value.toLowerCase())
      // startsWith если начало строки совпадает с нашей строкой то true, в противном случае false
      // includes если строка содержит заданную подстроку то true, в противном случае false
    })
  }

  rerender()
})

rerender() // вызываем прорисовку продуктов при открытии страницы