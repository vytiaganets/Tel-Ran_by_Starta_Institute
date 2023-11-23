// const formElem = document.querySelector("form")
// const nameInputElem = document.querySelector(".name_input")
// // nameInputElem.value = pyfxtybt rrjnjhjt ddtk gjkmpjdfntkm
// //submit событие отправки данных на сервер
// formElem.addEventListener("submit", function(e){
//   e.preventDefault()
//   // e.preventDefault отменяет действия по умолчанию
//   console.log("submitted");
//   console.log(nameInputElem.value);
// })
// в данном случае действия по умолчанию это открытие ссылки
// document.querySelector('a').addEventListener("click", function(e){
//   e.preventDefault() // отмена действия открытия
// }) // при клике ничего не происходит

// const formElemWithName = document.forms.first_form
// console.log(formElemWithName);

//============================= Задачал 01 ==========================

// Создать форму в html (наименование товара и цена) и добавить скрипт, чтобы при отправке формы данные из нее выводились в консоль.
//============================= Задачал 02 ==========================

//Доработать процесс таким образом, чтобы при отправке формы данные из нее добавлялись в массив с продуктами в виде объекта. 
// { 
//   title: "Macbook", 
//   price: 2000 
// } 

const formElem = document.querySelector("#product_form")
const productNameInput = document.querySelector(".product_name_input")
const productPriceInput = document.querySelector(".product_price_input")

let products = [{
    title: "Mac",
    price: 100
  },
  {
    title: "Macbook",
    price: 1000
  },
  {
    title: "aPhone",
    price: 10000
  }
]
// rerender()
//const products = []
formElem.addEventListener("submit", function (e) {
  e.preventDefault()
  // console.log(nameNameElem.value);
  // console.log(namePriceElem.value);
  const product = {
    title: productNameInput.value,
    price: +productPriceInput.value
  }
  products.push(product)
  rerender() // вызов функции ререндеринга
  //console.log(products);
  formElem.reset() //очищает значение инпутов которые находятся внутри формы formElem
})

//============================= Задачал 03 ==========================
//Добавить функцию, которая получает наименование карточки и цену и возвращает HTML элемент с карточкой товара. 
// function createProductCard(title, price) { // let {title, price} = product

// }

// const product = {
//   title: "Mac",
//   price: 2000
// }

// const product2 = {
// count: 5
// }

// const {title, price} = product
// createProductCard(product)
// createProductCard(product2)// error

function createProductCard({
  title,
  price
}) { //let {title, price} = product

  const pTitle = document.createElement('p')
  pTitle.innerText = title
  const pPrice = document.createElement('p')
  pPrice.innerText = price
  const productCard = document.createElement('div')
  productCard.classList.add("product_card")

  productCard.append(pTitle, pPrice)

  return productCard
}
//console.log(createProductCard({
//   title: 'Mac',
//   price: '1000'
// }));
//<div class="product_card"><p>Mac</p><p>1000</p></div>


//============================= Задачал 04 ==========================

// Разработать функцию rerender. Эта функция очищает контейнер с карточками и создает множество карточек с товарами из массива. Настроить rerender при добавлении нового продукта. 



function rerender() {
  const productsListDiv = document.querySelector(".products_list_container")
  productsListDiv.innerHTML = "" // очищаем контейнер с карточками


  if (products.length === 0) {

    const pElem = document.createElement('p')
    pElem.innerText = "Товаров нет"
    pElem.classList.add("empty_msg")
    productsListDiv.append(pElem)
  }


  products = products.sort(function (a, b) {
    return a.title.localeCompare(b.title)
  })
  for (let i = 0; i < products.length; i++) {
    //console.log(products[i])
    const productCardElem = createProductCard(products[i])
    productCardElem.addEventListener("dblclick", function () { //*** 
      console.log(products[i].title);

    })
    const btnRemove = createRemoveBtn() //06
    productCardElem.append(btnRemove) //06


    btnRemove.addEventListener("click", function () {
      //splice(a, b ... c)
      // a индекс начального элемента
      // b кол-во элементов которые нужно удалить начания с индекса а
      // c необязательный параметр если нужно заменить какими то другими значениями

      products.splice(i, 1) // индекс продукта в массиве ptoducts
      rerender()

    })

    productsListDiv.append(productCardElem)
  }
}

//============================= Задачал 05*** ==========================
// Доработать rerender таким образом, чтобы при двойном клике по карточке в консоль выводилось название товара. 

//============================= Задачал 06 ==========================
// https://www.figma.com/file/c8FlmkTHbSRyPgCeLEGdBF/Untitled-(Copy)?type=design&node-id=1-2&mode=design&t=JeqhapMw7vdrGo1s-0 
// Добавить функцию, которая возвращает кнопку в виде крестика в красном кружке. 
// createRemoveBtn(){}
/* <button class="remove_btn">X</button> */
//============================= Задачал 07 ==========================
// Добавить в rerender добавление крестика в верхнем правом углу карточки товара. 

function createRemoveBtn() { //05
  const button = document.createElement('button');
  button.innerText = 'X'
  button.classList.add('remove_btn');
  return button
}

//============================= Задачал 08 ==========================
//Добавить отображение фразы “товаров нет”, когда товаров нет. 


//============================= Задачал 09 ==========================

//Добавить форму в HTML с полем ввода и кнопкой для поиска по товарам. Реализовать скрипт, который получает из формы строку при submit и выводит в консоль. 

const filterForm = document.querySelector("#product_filters_form")
const searchTextInp = document.querySelector(".search_text")
// change срабатывает тогда когда меняется значение какого то элемента внутри формы
const sortFieldElem = document.querySelector("#sort_field")
filterForm.addEventListener("change", function (e) {
  e.preventDefault()
  console.log(searchTextInp.value);
  // console.log(sortFieldElem.value);
  if (sortFieldElem.value === 'title') {
    products = products.sort(function (a, b) {
      //return 0 - a.title.localeCompare(b.title) //обратная сортировка
      return a.title.localeCompare(b.title)
    })
  } else if (sortFieldElem.value === 'price') {
    products = products.sort(function (a, b) {
      return b.price - a.price
    })
  }

  if (searchTextInp.value !== "") {
    products = products.filter(function (product) {
      //return product.title.startsWith(searchTextInp.value)
      // startsWith если начало строки совпадает с нашей строкой то true, в противном случае false 
      // includes если строка содержит заданную подстроку то true в противном случае false
      return product.title.toLowerCase().includes(searchTextInp.value.toLowerCase())
    })
  }

  rerender()
})


//============================= Задачал 10 ==========================
// Меняем вызов обработчика формы с submit на change и убираем кнопку из формы. 
//============================= Задачал 11 ==========================
// Сделать сотрировку товаров по названию при change
//============================= Задачал 12 ==========================
// Сделать сортировку товарров по цене при change



rerender()
// вызываем прорисовку продуктов при открытии страницы