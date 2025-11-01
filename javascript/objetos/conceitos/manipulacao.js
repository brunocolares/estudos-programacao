
// Adiciona nova propriedade
const tenis = {
    tamanho: 41,
    estoque: true
};

tenis.tamanho = 42;
tenis.estoque = false;
tenis["preco"] = 49.5;
console.log(tenis)

// Removendo propriedade
if(tenis.hasOwnProperty("preco")) {
    console.log("Propriedade existente")
    delete tenis["preco"];
    if(!("preco" in tenis)) {
        console.log("preço deletado");
    }
}

console.log(tenis)


