// Função para exibir uma mensagem de boas-vindas
function welcomeMessage() {
  console.log("Bem-vindo ao mundo do JavaScript!");
}

// Função para somar dois números
function soma(a, b) {
  return a + b;
}

// Função para subtrair dois números
function subtracao(a, b) {
  return a - b;
}

// Função para multiplicar dois números
function multiplicacao(a, b) {
  return a * b;
}

// Função para dividir dois números
function divisao(a, b) {
  if (b === 0) {
    return "Erro: divisão por zero não é permitida!";
  }
  return a / b;
}

// Função para calcular a média de três números
function media(a, b, c) {
  return (a + b + c) / 3;
}

// Chamada das funções e exibição dos resultados
welcomeMessage();

let numero1 = 5;
let numero2 = 10;
console.log("A soma de " + numero1 + " e " + numero2 + " é: " + soma(numero1, numero2));

let numero3 = 15;
let numero4 = 7;
console.log("A subtração de " + numero3 + " e " + numero4 + " é: " + subtracao(numero3, numero4));

let numero5 = 4;
let numero6 = 3;
console.log("A multiplicação de " + numero5 + " e " + numero6 + " é: " + multiplicacao(numero5, numero6));

let numero7 = 20;
let numero8 = 4;
console.log("A divisão de " + numero7 + " por " + numero8 + " é: " + divisao(numero7, numero8));

let numero9 = 7;
let numero10 = 8;
let numero11 = 9;
console.log("A média de " + numero9 + ", " + numero10 + " e " + numero11 + " é: " + media(numero9, numero10, numero11));

