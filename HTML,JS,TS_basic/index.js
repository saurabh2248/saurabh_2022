/*
var name = "Saurabh"
var age = 25;
var isGraduate = true;
var laptop;
laptop = "Dell";
console.log(name);

function alertUser() {
    var favChips = "Lays Blue";
    console.log("This user loging in " + name)
    alert("This user loging in " + name)
}
alertUser();
//console.log(favChips);

//if else if statement
function operators(num) {
    if (num > 20) {
        console.log("Number is grater than " + num);
    } else if (num == 20) {
        console.log("Number is equal to " + num);
    } else {
        console.log("Number is lesser than " + num);
    }
    operators(87);
}

function creditScore(score) {
    var creditLimit;
    switch (score) {
        case 800: creditLimit = "above 1 lak";
            break;
        case 700: creditLimit = "50,000 to 1,00,000";
            break;
        case 600: creditLimit = "10,000 to 50,000";
            break;
        case 800: creditLimit = "Not eligible";
            break;
        default:
    }
    creditScore(800);
    console.log(creditLimit);
}

function counting() {
    for (let i = 1; i < 10; i++) {
        console.log(i);
    }
}
counting();

var Car = new Object();
Car.brand= "TATA";
Car.Model= "A3480";
Car.price= "800000";
console.log(Car);

var names =["Saurabh", "Manish", "Kunal"];
console.log(names);


//Creating the class and do some operation
class Cars{

    constructor(brand, modelNumber, price){
       this.brand=brand;
       this.modelNumber=modelNumber;
       this.price=price;
    }

    print(){
        console.log("This is a " + this.brand+" "+this.modelNumber+" which cost is "+this.price);

    }
}
var C1= new Cars("Punch", "A", 600000);
var C2=  new Cars("Maruti", "K", 900000);
C1.print();
C2.print();

*/

/*
//Inheritance concepts with the help of inbult methods
class todaysDate extends Date{
     constructor(){
         super();
     }

     printDate(){
         console.log("Today date: "+this.getDate());
     }
}
let today = new todaysDate();
today.printDate();

*/

/*
// Inheritance with parent child class
class AppleLaptops{
    constructor(brand){
        this.brand="Apple";
    }
}

class MacBookPro extends AppleLaptops {
    constructor(model, proccessor, ram){
        super();
        this.model=model;
        this.proccessor=proccessor;
        this.ram=ram;
    }
}
    let l1= new MacBookPro("2022AC2", "i7", 16);
    console.log(l1.brand+" "+l1.model+" "+l1.proccessor+" "+l1.ram);

*/

/*
//...spread operators
let genralFruts = ["Apple", "Banana", "PineApple"]
let seasonalFruts = ["Mango", "Lichi"]
let allFruts = [...genralFruts, ...seasonalFruts]
console.log(allFruts);
*/


/*
//Arrow/inline function
let counting=() =>{
    for(let i=1;i<10;i++){
        console.log(i);
    }
}
counting();
*/

/*******************************************************************************************/
//There are three keyword which is used to decleare variable in java scripts
//var ->This has a scope of function, It can be re-declear
var num1=1000;
var num1=2000;
console.log(num1);


//let-> It as annoused with ES6, It has a block scope, Vraiable can not re-define
let a=100;
function addNumbers(){
  a=230;
  let b=100;
  console.log(a+b);
}
addNumbers();
console.log(a+1000);


//const-> This is constant so we can niot change the value directly, this also has a scope of block
function addNumbers1(){
    const num2=100;
    //num2=800;
    console.log(num2);
}
addNumbers1()


/****************************************************************************************/
//Abstraction
function dogs(){
    this.dogName="Lab"
    throw new error("This is not a wild dog")
}
dogs.prototype.display = function(){
    return "This dog brid is: "+this.dogName;

}

//constructor function
function Animal(dogName){
    this.dogName=dogName;
}

//create an object without using constructor
Animal.prototype= Object.create(dogs.prototype);
let tommy = new Animal("German shepherd");
console.log(tommy.display())


