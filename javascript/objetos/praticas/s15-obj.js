function Checagem(tipo, equipamento, data, usuario) {
    this.tipo = tipo;
    this.equipamento = equipamento;
    this.data = data;
    this.usuario = usuario;
}

const c1 = new Checagem('CHA', '8372819', '2025-11-21', 'U011312');

function ChecagemCharpy(pc1, pc2, pc3) {
    this.pc1 = pc1;
    this.pc2 = pc2;
    this.pc3 = pc3;

    function teste() {
        
    }

    this.charpy = function() {
        console.log("charpy")
    }
}

const charpy = new ChecagemCharpy(10, 12, 30);

const checagemCharpy = {...c1, ...charpy}
console.log(JSON.stringify(checagemCharpy))

const c2 = {
    tipo: 'TRA',
    equipamento: '7383920',
    data: '2025-11-21',
    usuario: 'U011312',
    teste() {
        console.log("ata")
    }
}

function construirChecagemTracao(le, lr, alo) {
    return {
        le: le,
        lr: lr,
        alo: alo,
        detalhes() {
            console.log("Detalhes")
        },
    }
}

const checagemTracao = {...c2, ...construirChecagemTracao(10, 22, 33)}
console.log(JSON.stringify(checagemTracao))