const carro = {
    marca: "ford",
    modelo: "fiesta",
    ano: 2017,
    placa: "GZX-9593"
}

let carro2 = {
    marca: "wolkswagen",
    modelo: "gol",
    ano: 2005,
    placa: "TUV-3125"
};

console.log(carro)
console.log(carro2)

delete carro.ano;
delete carro2.ano;
console.log("Após delete de ano: ")
console.log(carro)
console.log(carro2)

// carro = {
//     marca: "chevrolet",
//     modelo: "cruze",
//     ano: 2021,
//     placa: "QAP-2578"
// }

carro2 = {
    marca: "chevrolet",
    modelo: "cruze",
    ano: 2021,
    placa: "QAP-2578"
}
console.log("Atribuindo novos carros: ")
console.log(carro)
console.log(carro2)