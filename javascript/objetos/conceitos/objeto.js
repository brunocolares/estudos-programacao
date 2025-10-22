let tenis = {
    tipo: "Corrida",
    cadarco: "G",
    estoque: false,
    tamanho: {
        palmilha: 39,
        tenis: 40,
        caixa: {
            largura: 35,
            altura: 40,
            profundidade: 10
        }
    },
    marca: [
        {
            nome: "Nike",
        },
        {
            nome: "Adidas"
        }
    ],
    getMarca: function() {
        return this.marca;
    }
};

console.log(tenis)
console.log(tenis.getMarca())