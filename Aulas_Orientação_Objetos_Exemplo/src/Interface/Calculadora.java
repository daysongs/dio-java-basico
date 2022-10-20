package Interface;

public class Calculadora implements OperacaoMatematica {

    @Override
    public void somar(double numero1, double numero2) {
        System.out.println("soma = " + numero1 + numero2);
        
    }

    @Override
    public void subitrair(double numero1, double numero2) {
        System.out.println("subtração = " + (numero1 - numero2));
        
    }

    @Override
    public void multiplicar(double numero1, double numero2) {
        System.out.println("Multiplicação = " + (numero1 * numero2));
        
    }

    @Override
    public void dividir(double numero1, double numero2) {
        System.out.println("Divisão  = " + (numero1 / numero2));
        
    }
    
}
