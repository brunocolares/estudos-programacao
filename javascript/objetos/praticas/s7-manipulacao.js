const usuario = {
    nome: "Bruno Colares",
    idade: 21,
    contato: {
        email: "bruno@gmail.com",
        telefone: "31972581209" 
    },
    enderecos: [
        { rua: "Rua Bélgica", numero: 105},
        { rua: "Rua Brasil", numero: 200}
    ]
}
// 1
const {nome, contato: {email}} = usuario;
const { [1]: {numero}} = usuario.enderecos;
console.log("Destructuring de nome e email e segundo numero: "+nome+ " - " + email + " - " + numero)


function mostrarDados({nome, idade}) {
    return nome + ' e ' + idade;
}

console.log(mostrarDados(usuario))

if(usuario.hasOwnProperty('idade')) {
    console.log('Usuário tem idade')
} else {
    console.log('Usuario nao tem idade')
}

if('cpf' in usuario) {
    console.log('Usuário tem cpf')
} else {
    console.log('Usuario nao tem cpf')
}

if(usuario['contato'].hasOwnProperty("telefone")) {
    console.log('Usuário contato tem telefone')
} else {
    console.log('Usuario contato nao tem telefone')
}

usuario.profissao = "Analista de Sistemas";
usuario.ativo = "true";

delete usuario.contato.telefone;
if(usuario['contato'].hasOwnProperty("telefone")) {
    console.log('Usuário contato tem telefone')
} else {
    console.log('Usuario contato nao tem telefone')
}

const extras = {
    premium: true,
    pontos: 300
};

const usuarioCompleto = Object.assign(usuario, extras);
console.log(`usuarioCOmpleto: ${JSON.stringify(usuarioCompleto)}`)

const usuarioClone = {...usuario};
usuario.contato.email = "Emillin@outlook.com"
console.log("Teste de clonagem: "+usuarioClone.contato.email)
console.log("Teste de clonagem no obj original: "+usuario.contato.email)
// O objeto original também foi alterado. isso é cópia rasa, pois os objetos internos continuam a serem
// modificados por referência.

const copiaProfunda = JSON.parse(JSON.stringify(usuario));
copiaProfunda.contato.email = "israel@yahoo.com"
console.log("Teste de clonagem profunda: "+usuario.contato.email)
console.log("Teste de clonagem profunda no obj original: "+copiaProfunda.contato.email)

function atualizarUsuario(user, novosDados) {
    return {...user, ...novosDados}
}

const novo = atualizarUsuario(usuario, { idade: 22, premium: false })
console.log(JSON.stringify(novo))


