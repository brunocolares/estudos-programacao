const funcionario = {
    nome: "Bruno Colares",
    idade: 21,
    cargo: "Analista de Sistemas",
    endereco: {
        cidade: "Coronel Fabriciano",
        estado: "Minas Gerais",
        cep: "35170-250"
    },
    salario: 5000.00
}

const {nome, cargo, endereco: {cidade, estado}} = funcionario;

if(!(funcionario.hasOwnProperty("salario"))) {
    console.log("O funcionário não possui a propriedade 'salario'.");
}

if(!("cpf" in funcionario)) {
    console.log("O funcionário não possui a propriedade 'cpf'");
}

funcionario.departamento = 'TI';
funcionario.ativo = true;
console.log("Obj funcionário após ativo: "+JSON.stringify(funcionario))
delete funcionario.idade;

console.log("Obj funcionário após remover 'idade': "+JSON.stringify(funcionario));

const beneficios = {
    planoSaude: 500,
    planoAlimentacao: 650
}

const projetos = [{
    numero: 0,
    nome: "IA no LEME"
    },
    {
        numero: 1,
        nome: "Sistema NQEM"
    }];

const funcionarioCompleto = Object.assign(funcionario, {beneficios}, {projetos});

console.log("funcionaroCompleto:")
console.log(JSON.stringify(funcionarioCompleto))

const copiaFuncionario = {...funcionario}
copiaFuncionario["cargo"] = "Coordenador I"
copiaFuncionario["salario"] = 15480.00

console.log("Funcionario: "+JSON.stringify(funcionario))





