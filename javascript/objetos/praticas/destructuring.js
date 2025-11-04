const pessoa = {
    nome: 'Bruno',
    idade: 21,
    cpf: '70253303613',
    estatura: {
        altura: 1.68,
        peso: 60
    }
};

const {nome, idade, estatura: {altura}, estatura: {peso}} = pessoa;
console.log(nome, idade, altura, peso);

const apelidos = ['bruno', 'colares', 'tumati'];
const [primeiro, , terceira] = apelidos; 
console.log('Primeiro apelido: '+primeiro+ ", terceira: "+terceira)
