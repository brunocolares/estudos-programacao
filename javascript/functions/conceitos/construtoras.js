function Name(nome, sobrenome) {
    this.nome = nome
    this.sobrenome = () => {
        const nomeCompleto = `${this.nome} ${sobrenome}`
        return nomeCompleto;
    }
}

const bruno = new Name("Bruno", "Colares");
console.log(bruno.sobrenome())

function Calculadora(num1, num2) {
    this.soma = () => {
        return num1 + num2
    }

    this.subtrair = () => {
        return num1 - num2;
    }
}

const calculadora = new Calculadora(2, 2)
console.log(calculadora.soma())
console.log(calculadora.subtrair())