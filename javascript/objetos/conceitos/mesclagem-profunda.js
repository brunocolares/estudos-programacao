const apartamento = {
    andar: 331
}

const casa = {
    portas: {
        quantidade: 5,
        cor: "marrom"
    },
    quarto: {
        largura: 10,
        altura: 20
    }
};

const casaObj = JSON.parse(JSON.stringify(casa));
const objCompleto = {...apartamento, ...casaObj}
console.log(objCompleto)