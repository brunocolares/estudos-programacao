// // 1
// const usuario ={
//     nome: 'bruno',
//     falarNormal: function() {
//         console.log(this.nome);
//     },
//     falarArrow: () => console.log(this.nome)
// }

// usuario.falarNormal() // Este metodo herda o this do escopo em que ele é chamado. o escopo é a function, logo, herda o this dela, o escopo usuario.
// usuario.falarArrow() // Aqui será undefined, pois o this herdado é o mesmo de "usuario", ou seja, o escopo externo, o window.


// 2
const relogio = {
    hora: 10, // herdei o relogio como this
    iniciar: function() { 
        setTimeout(() => console.log(this.hora), 1000) // aqui eu herdo o this de onde foi declarado,
        // a function arrow foi declarada dentro do escopo de iniciar(), logo, o this dela também
        //é o this do relogio
    }
}
relogio.iniciar()


//

    

