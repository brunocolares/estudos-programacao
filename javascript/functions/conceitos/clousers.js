function QualSeuNome(nome) {
    const msg = `O seu nome é`;

     function seuNome() {
        return `${msg} ${nome}`;
    }

    return seuNome();
}

console.log(QualSeuNome("Bruno"))

function calculadora(num1, num2) {
    const msg = "Resultado";
    const soma = () => {
        return `${msg} ${num1 + num2}`;
    }

    const subtracao = () => {
        return `${msg} ${num1 - num2}`;
    }

    return {
        soma: soma(),
        subtracao: subtracao()
    }
}

console.log(calculadora(10, 5));
console.log(calculadora(20, 5))