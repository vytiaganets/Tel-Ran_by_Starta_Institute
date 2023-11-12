//-----------------1. Number//-----------------
// const num = 42 // integer
// const float = 42.42 // float
// const pow = 10e3
// console.log(pow) // 10000
// Number.MAX_SAAFE_INTEGER
// console.log(Number.MAX_SAFE_INTEGER) // 9007199254740991
// console.log(Math.pow(2, 53)-1) // 9007199254740991
// console.log(Number.MIN_SAFE_INTEGER) // -9007199254740991
// const negative = -42


// console.log('Number.MAX_VALUE: ', Number.MAX_VALUE) // 1.7976931348623157e+308
// console.log('Number.MIN_VALUE: ', Number.MIN_VALUE) // 5e-324
// console.log('POSITIVE_INFINITY: ', Number.POSITIVE_INFINITY) // // Infinity
// console.log('NEGATIVE_INFINITY: ', Number.NEGATIVE_INFINITY) // -Infinity
// console.log('2/0: ', 2 / 0) // Infinity
// console.log(Number.NaN)
// console.log(typeof NaN) // number
// console.log(2 / undefined) // NaN
// const weid = 2 / undefined
// console.log(Number.isNaN(weid)) // true
// console.log(Number.isNaN(42)) // false
// console.log(Number.isFinite(Infinity)) // false
// console.log(Number.isFinite(42)) // true


// const stringInt = '40'
// const stringFloat = '40.42'
// console.log(Number.parseInt(stringInt) + 2) //42
// console.log(parseInt(stringInt) + 2) //42
// console.log(Number(stringInt) + 2) //42
// console.log(+stringInt + 2) //42

// console.log(parseFloat(stringFloat) + 2) //42.42
// console.log(+stringFloat + 2) //42.42

// console.log(0.4 + 0.2) //0.6000000000000001
// console.log((2 / 5) + (1 / 5)) //0.6000000000000001
// console.log((0.4 + 0.2).toFixed(4)) //0.6000
// console.log(+(0.4 + 0.2).toFixed(1)) //0.6
// console.log(parseFloat((0.4 + 0.2).toFixed(1))) //0.6

//-----------------2. BigInt//-----------------
//console.log(Number.MAX_SAFE_INTEGER) //9007199254740991
// console.log(typeof 9007199254740991n) //bigint
// console.log(typeof 9007199254740991.31232n) //errror
//console.log(9007199254740991n - 900719925474099n) //8106479329266892n

//console.log(10n - 4) //error
//console.log(parseInt(10n)-4) //6
//console.log(10n - BigInt(4)) //6n
//console.log(5n / 2n) //2n

//-----------------3. Math//-----------------
// console.log(Math.E) //2.718281828459045
// console.log(Math.PI) //3.141592653589793
// console.log(Math.sqrt(25)) //5
// console.log(Math.pow(5, 3)) //125
// console.log(Math.abs(-42)) //42
// console.log(Math.max(42, 12, 30, 11, 422)) //422
// console.log(Math.min(42, 12, 30, 11, 422)) //11
// console.log(Math.floor(4.9)) //4
// console.log(Math.ceil(4.9)) //5
// console.log(Math.round(4.9))//5
// console.log(Math.trunc(4.9))//4

// console.log(Math.random()) //0.7318199745688222

// 4 Example

// function getRandomBetween(min, max){
//   return Math.floor(Math.random() * (max -min) + min)
// }
// console.log(getRandomBetween(10, 42)) //35

