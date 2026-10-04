# Resolução exercício Beecrowd1072

## Descrição do projeto
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

## Como Funciona
1. O usuário define a quantidade de casos de teste, armazenada na variável `controle`.
2. Uma estrutura de repetição `for` roda o número de vezes definido por `controle` para capturar as entradas na variável `numeros`.
3. Um bloco condicional `if (numeros >= 10 && numeros <= 20)` analisa cada valor:
   - Se pertencer ao intervalo: Incrementa o contador `in`.
   - Caso contrário (`else`): Incrementa o contador `out`.
4. Após o laço de repetição, o programa imprime o total de números de cada categoria acompanhado dos respectivos rótulos `"in"` e `"out"`.