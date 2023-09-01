package estruturas_excepcionais.excecoes_customizadas;

public class Main {
    public static void main(String[] args) throws CepInvalidoException {
        String cep = "123456789";

        formatarCep(cep);
    }

    public static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }
}
