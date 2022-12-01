/*
const fun1=()=>{
    console.log("This is the function 1")
}


const fun2=()=>{
    setTimeout( ()=>{console.log("Hey this function will be executed set time out");
                }, 5000);
    console.log("This is the function 2")
}

const fun3=()=>{
    console.log("This is the function 3")
}
fun1();
fun2();
fun3();

*/


const fun1=()=>{
    return "This is the function 1"
}

/*
const fun2=()=>{
    setTimeout( ()=>{
        return "This is the function 2"
            }, 5000);
    
}
*/
const fun2 = () => {
    return new Promise((resolve, reject) => {
    setTimeout( ()=>{
        resolve("This is the function 2");
        }, 2000);
    });
}

const fun3=()=>{
    return "This is the function 3"
}

const callFun = async() =>{
    let val1=fun1();
    console.log(val1)

    let val2= await fun2();
    console.log(val2)

    let val3=fun3();
    console.log(val3)
}