const usuarios = [
    {
        nome: 'Bruno',
        idade: 21,
        endereco: {
            cidade: 'Coronel Fabriciano',
            estado: 'MG'
        }
    },
    {
        nome: 'Cláudia',
        idade: 51,
        endereco: {
            cidade: 'Coronel Fabriciano',
            estado: 'MG'
        }
    },
    {   
        nome: 'Israel',
        idade: 54,
        endereco: {
            cidade: 'Coronel Fabriciano',
            estado: 'MG'
        }
    }
];

const {nome, endereco: {cidade}} = usuarios[1];

console.log(`2. O usuario ${nome} mora em ${cidade}`);

if(!(usuarios[0].hasOwnProperty('email'))) {
    usuarios[0]['email'] = 'brunocolares06@gmail.com';
}

console.log(`3. A propriedade email com valor ${usuarios[0].email} foi adicionada para o usuario ${usuarios[0].nome}`);

if('estado' in usuarios[2].endereco) {
    delete usuarios[2].endereco.estado;
    console.log(`4. Propriedade 'endereco' removida do usuario ${usuarios[2]['nome']}`)
}

const usuarioPradao = {
    ativo: true,
    cargo: 'usuario comum'
}

Object.assign(usuarios[0], usuarioPradao);
console.log("5. Após mesclar via assign no primeiro usuário: ")
console.log("* "+JSON.stringify(usuarios[0]))

const obj = {...usuarios[1], ...usuarioPradao}
console.log("6. Após mesclar via spread no segundo usuário: ")
console.log("usuario original "+JSON.stringify(usuarios[1]))
console.log("obj atualizado "+JSON.stringify(obj))

const copiaProfunda = JSON.parse(JSON.stringify(usuarios))
copiaProfunda[0].nome = 'Aline'
console.log(`CÓPIA PROFUNDA: ${JSON.stringify(copiaProfunda)}`)
console.log(`OBJETO ORIGINAL: ${JSON.stringify(usuarios[0])}`)