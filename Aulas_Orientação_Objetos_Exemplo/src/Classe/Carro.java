package Classe;
 class Carro {
    // Atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    // Costrutor
    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }


    // gat e set
    void setCor(String cor){
        this.cor = cor;
    }

    String gatCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String gatModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int gatCapacidadeTanque(){
        return capacidadeTanque;
    }
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque*valorCombustivel;
    }
}
