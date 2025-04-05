function nomeFuncao() {
    return "Bruno Colares"
}

console.log(nomeFuncao());

const arrowFunction = () =>  "Bruno Colares";
console.log(arrowFunction())


class newFunc{
    constructor(nome) {
        this.nome = nome
    }
}

const a = new newFunc("Bruno");

// this
const lanches = {
    cardapio: [
        {nome: "x-salada", preco: 25},
        {nome: "x-presunto", preco: 17},
    ],
    meuPedidoFunc: function(select) {
        console.log(this.cardapio[select])
    },

    meuPedidoFuncTimeOut: function() {

    },

    meuPedidoArrowFunc: (select) => {
        this.cardapio = [
            {nome: "x-salada", preco: 25},
            {nome: "x-presunto", preco: 17}
        ];
        return console.log(this.cardapio[select]);
    },
};

lanches.meuPedidoFunc(1);
lanches.meuPedidoArrowFunc(1);


