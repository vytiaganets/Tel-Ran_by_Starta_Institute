// const person = {
//   name: 'Andrii',
//   age: 26,
//   isProgrammer: true,
//   languages: ['ru', 'en', 'de'],
//   'complex key': 'Complex value',
//   ['key_'+(1+3)]: 'Computed Key', //key_4
//   // greet: function(){
//   // }
//   greet() {
//     console.log('greet from person')
//   }
// }

// console.log(person.name); //Andrii
// const ageKey = 'age'
// console.log(person['age']);//26
// console.log(person[ageKey]);//26
// console.log(person['complex key']);//Complex value

// console.log(person);
// person.greet()

// person.age++
// person.languages.push('by')
// console.log(person);
// person['key_4'] = undefined

// delete person['key_4']
// console.log(person['key_4']);//undefined

//деструктуризация обьекта

// const name = person.name
// const age = person.age
// const languages = person.languages
// console.log(name, age, languages); //Andrii – 26 - ['ru', 'en', 'de']

// const {name, age: personAge = 10, languages} = person
// console.log(name, personAge, languages);


03:56:45