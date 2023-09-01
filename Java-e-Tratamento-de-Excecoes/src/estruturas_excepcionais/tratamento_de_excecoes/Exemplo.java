package estruturas_excepcionais.tratamento_de_excecoes;

/*
- A instrução try, permite que você defina um bloco de código, para ser testado quanto a erros enquanto está sendo
executado.

- A instrução catch, permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.

- A instrução finally, permite definir um bloco de código a ser executado, independente de ocorrer um erro ou não.
As palavras-chave try e catch vem em pares.
*/

public class Exemplo {
    public static void main(String[] args) {
        try {
            //  bloco de código conforme esperado
        }
        catch(Exception e) {// precisamos saber qual exceção
            // bloco de código que captura as exceções que podem acontecer
            // em caso de um fluxo não previsto
        }
    }
}
