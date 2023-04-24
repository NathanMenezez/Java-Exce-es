import exceptions.MinhaException;
import exceptions.MinhaException2;

public class Fluxo {

    public static void main(String[] args) throws MinhaException2 {
        
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (MinhaException | ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void metodo1() throws MinhaException2{
        System.out.println("Ini do metodo1");
        metodo2();
        throw new MinhaException2("ERROR 2");
    }
    
    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            throw new MinhaException("ERROR");
        }
        System.out.println("Fim do metodo2");
    }
}


//Exception -  é necessario colocar um throws na assinatura do método

//RuntimeException -  não é necessario colocar o throws na assinatura do método