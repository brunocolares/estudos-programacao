function subtracao(a, b) {
    return a - b;
}

const subtracao2 = (a, b) => a - b;

function somar2(a) {
    return a + 2;
}

const somar2versao2 = a => a + 2;

function returnDay() {
    return (new Date()).getDate();
} 

function superFuncao(a, b) {
    let subtracao = a - b;
    subtracao -= 2;
    let diaDoMes = (new Date()).getDate();
    return diaDoMes;
}

const superFuncaoVersao2 = (a, b) => {
    let subtracao = a - b;
    subtracao -= 2;
    let diaDoMes = (new Date()).getDate();
    return diaDoMes;
}

const returnDayVersion2 = () => (new Date()).getDate();

console.log(returnDay());
console.log(returnDayVersion2())

