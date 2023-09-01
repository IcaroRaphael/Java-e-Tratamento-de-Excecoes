package estruturas_excepcionais.hierarquia_das_excecoes;

import java.text.NumberFormat;

/*
As linhas 14 e 16, apresentarão uma exceção ao serem executadas, e a linha 5 contém um método que pode disparar uma
exceção checada, logo, nós programadores que iremos usar este método, teremos que tratá-la explicitamente com
try \ catch.
*/

public class ExemploExcecao {
    public static void main(String[] args) {
        try{
            Number valor = Double.valueOf("a1.75");

            valor = NumberFormat.getInstance().parse("a1.75");

            System.out.println(valor);
        }
        catch (Exception e){
            //Bloco onde a exception é disparada
        }
    }
}
