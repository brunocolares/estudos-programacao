const biblioteca = {
    nome: "Biblioteca Central",
    livros: [
        {
            titulo: "O homem mais rico da babilônia",
            autor: "Robert J",
            disponivel: true
        }
    ],
    listarLivros: function() {
        this.livros.forEach(livro => console.log(`Livro ${livro.titulo} - Autor: ${livro.autor} - Disponivel? ${livro.disponivel ? 'S' : 'N'}`));
    },
    emprestarLivro: function(titulo) {
        this.livros.find(livro => {
            if(livro.titulo.toUpperCase() == titulo.toUpperCase()) {
                if(livro.disponivel) {
                    livro.disponivel = false;
                } else {
                    console.log("Livro já foi emprestado.");
                }
            }
        })
    },
    devolverLivro: function(titulo) {
        this.livros.forEach(livro => {
            if(livro.titulo.toUpperCase() == titulo.toUpperCase()) {
                if(!livro.disponivel) {
                    livro.disponivel = true;
                } else {
                    console.log("Livro já foi devolvido.");
                }
            }
        })
    },
    adicionarLivro: function(titulo, autor) {
        this.livros.push({titulo, autor, disponivel: true});
    }
}

biblioteca.listarLivros()
biblioteca.emprestarLivro("O homem mais rico da babilônia");
biblioteca.listarLivros();
biblioteca.devolverLivro("O homem mais rico da babilônia");
biblioteca.adicionarLivro("Código limpo", "Robert Joson");
biblioteca.listarLivros();
