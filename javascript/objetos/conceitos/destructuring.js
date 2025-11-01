const tenis = {
    dimensoes: {
        altura: 10,
        largura: 20,
        profundidade: 5
    },
    estoque: true,
    cores: ["azul", "branco"]
}

function dimensoes({estoque, cores, dimensoes: {altura}}) {
    console.log(`Estoque: ${estoque} `)
    console.log(`Cores: ${cores}`)
    console.log(`Altura: ${altura}`)
}

dimensoes(tenis)