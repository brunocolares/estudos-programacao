const tenis = {
    estoque: true,
   // tamanho: 41
}

// Verifica a existência de propriedade
console.log(tenis.hasOwnProperty("estoque"))
console.log("tamanho" in tenis)

if(tenis.hasOwnProperty("tamanho")) {
    console.log(`Tamanho do tênis: `+tenis.tamanho)
} else {
    console.log(`Propriedade inexistente.`)
}