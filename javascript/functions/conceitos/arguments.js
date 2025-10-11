function soma(num1, num2) {
    if(typeof num1 === "string" || typeof num2 === "string") {
        console.log("Argumentos inválidos: ")
        return arguments;
    }
    return num1 + num2;
}

console.log(soma("1", 1))