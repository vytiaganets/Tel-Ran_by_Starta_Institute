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
const products = []
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

const productsListDiv = document.querySelector(".products_list_container")

function rerender() {
  productsListDiv.innerHTML = "" // очищаем контейнер с карточками
  for (let i = 0; i < products.length; i++) {
    //console.log(products[i])
    const productCardElem = createProductCard(products[i])
    productsListDiv.append(productCardElem)
  }
}