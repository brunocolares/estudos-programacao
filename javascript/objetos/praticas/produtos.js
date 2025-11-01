const produto = {
    nome: "Computador",
    preco: 5000.00,
    especificacoes: {
        armazenamento: 500,
        memoria: 8
    }
}

const {nome, preco, especificacoes: {armazenamento}, especificacoes: {memoria}} = produto;

if(produto.hasOwnProperty("preco")) console.log(`preco é uma propriedade de produto`);
if("marca" in produto) console.log(`marca é uma propriedade de produto`);
if("especificacoes" in produto) console.log("especificacoes é uma propriedade de produto")

produto.marca = "Kabum";
produto["emEstoque"] = 1;

console.log("Após adicionar: "+JSON.stringify(produto));
delete produto.preco;
console.log("Após deletar preco: "+JSON.stringify(produto));

const desconto = {
    porcentagem: 50,
    vencimento: "10/10/2025"
}

// Object.assign(produto, {desconto});
// console.log("Após mesclar com assign: "+JSON.stringify(produto))

const produtoDesconto = {...produto, ...{desconto}}
console.log("produto com desconto: "+JSON.stringify(produtoDesconto))

const copiaProfunda = JSON.parse(JSON.stringify(produtoDesconto))

produto.especificacoes.armazenamento = 2000;
console.log("Após mudar armazenamento do produto")
console.log("produtoDesconto: "+JSON.stringify(produtoDesconto))

console.log("Copia profunda: ");
console.log(JSON.stringify(copiaProfunda))

