function somar(num1, num2) {
    const msg = "A soma é ";
    let soma = num1 + num2;
    function soma2() {
        return soma + 2;
    }
    return {
        total: soma2(),
        msg: `${msg}${soma2()}`
    }
}

console.log(somar(10, 10))
