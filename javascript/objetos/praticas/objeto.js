function User(nome, idade, email, ativo, enderecos) {
    this.nome = nome; 
    this.idade = idade;
    this.email = email;
    this.ativo = ativo;
    this.enderecos = enderecos;
    
    this.mostrarInfo = function() {
        console.log(`Nome: ${this.nome}`);
        console.log(`Idade: ${this.idade}`);
        console.log(`Email: ${this.email}`);
        console.log(`Ativo? ${this.ativo}`);
    }

    this.atualizarEmail = function(novoEmail) {
        this.email = novoEmail;
        console.log("Email atualizado: "+this.email)
    }

    this.desativar = function() {
        this.ativo = false;
        console.log("Usuário desativado")
    }

    this.adicionarEndereco = function(novoEndereco) {
        this.enderecos.push(novoEndereco);
    }

    this.mostrarEnderecos = function() {
        this.enderecos.forEach(endereco => {
            console.log(`Endereço - Rua: ${endereco.rua} - Cidade: ${endereco.cidade} - Estado: ${endereco.estado}`)
        });
    }
}

const enderecos = [
    {
        rua: "Bélgica",
        cidade: "Coronel Fabriciao",
        estado: "Minas Gerais"
    }
];
const user1 = new User("Bruno", 21, "brunocolares06@gmail.com", true, enderecos);
console.log(user1.mostrarInfo());
user1.atualizarEmail("cruzeiro@gmail.com");
user1.desativar();
console.log(user1.mostrarInfo());
user1.adicionarEndereco({rua: "Itália", cidade: "Coronel Fabriciano", estado: "Minas Gerais"});
console.log(user1.mostrarInfo());
console.log(user1.mostrarEnderecos());