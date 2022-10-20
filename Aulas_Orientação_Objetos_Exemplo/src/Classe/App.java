package Classe;
public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.gatModelo());
        System.out.println(carro1.gatCor());
        System.out.println(carro1.gatCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2 = new Carro("Ciza","Mercedez-Benz Classe C", 66);


        System.out.println(carro2.gatModelo());
        System.out.println(carro2.gatCor());
        System.out.println(carro2.gatCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));
        
    }
}
