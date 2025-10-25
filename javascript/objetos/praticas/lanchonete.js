const cardapio = [{
        nome: 'x-bacon',
        preco: 20.0,
    },
    {
        nome: 'x-tudo',
        preco: 34.2
    }
];

const pedidos = [];

function fazerPedido(nomeItem, quantidade) {
    const opcao = cardapio.find(value => value.nome.toUpperCase() == nomeItem.toUpperCase());
    if(opcao) {
        pedidos.push({nomeItem, quantidade, total: opcao.preco * quantidade})
    } else {
        console.log("Opção inexistente.")
    }
}

let valorFinal = 0.0;
function mostrarConta() {
    if(pedidos) {
        
        pedidos.forEach((value, index) => {
            console.log(`Pedido ${index}: ${value.nomeItem}, Qnt: ${value.quantidade} - Valor: ${value.total}`)
            valorFinal += value.total;
        })
    }
}

fazerPedido("x-bacon", 2);
mostrarConta();

console.log("Valor final: "+valorFinal)