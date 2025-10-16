"use strict";
function Automovel(marca, modelo, ano) {
    this.marca = marca,
    this.modelo = modelo,
    this.ano = ano;
}

const automovel = new Automovel("Fiat", "Saveiro", 2010);
console.log(automovel);

// factory
function criarAutomovel(marca, modelo, ano) {
    return {
        marca: marca,
        modelo: modelo,
        ano: ano
    }
}

console.log(criarAutomovel("Chevrolet", "Cruze", 2015));


