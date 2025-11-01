function construirPessoa(nome, idade) {
    return {
        nome,
        idade
    }
}

const p1 = construirPessoa("Bruno", 21);
console.log(p1)

let nome = "bruno";
const p2 = {
    nome
}

console.log(p2)