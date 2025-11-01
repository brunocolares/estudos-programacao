// Cópia rasa
const tenis = {
    tamanho: 34,
    estoque: true
}

const camisa = {
    dimensao: "P",
    cor: "Azul"
}

console.log(tenis)

const cloneTenis = tenis;

let mesclagem = Object.assign(tenis, camisa)
console.log("mesclagem: "+ JSON.stringify(mesclagem))

// Cópia profundo:

