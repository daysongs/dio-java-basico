package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploListas {
    public static void main(String[] args) {
    
        //Criando uma lista
        List <Double> notas = new ArrayList<>();
        // Adicionando elementos a Lista
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        // exibindo a lista
        System.out.println(notas);
        // exibindo  posição de um determinado intem da lista
        System.out.println("Exiba a posição da nota 5: ele esta na posição " + notas.indexOf(5d));

        // adicionar intem em uma determinada posição
        notas.add(4,8d);
        System.out.println(notas);

        // subistituindo um elemento da lista
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        // Verificando se um determinado intem esta na lista
        System.out.println("conira se a nota 5 esta na lista: " + notas.contains(5d));

        // ver o intem de uma determinada posição

        System.out.println("Exiba a tericeira nota adicionada: " + notas.get(2));

        // verificcar o menor valor de uma lista, na classe lista não tem o metodo nativo para esta função
        // mas como ele se trata de uma colletion podemos utilizar o metodo da colletion
        System.out.println("Exiba a menor nota: a menor nota é " + Collections.min(notas));
        // para o maior valor é analogo ao menor valor
        System.out.println("Exiba a maior nota: a maior nota é " + Collections.max(notas));
         // para somar os valores da lista não existe um metodo por isso utilizaremos
         // o metodo Iteratir
         
         Double soma = 0d;
         for(Double nota:notas){
            Double next = nota;
            soma += next;
         }
         
         System.out.println("a soma dos elemento da lista é: " + soma);

         // para media precisamos da quantidade elemento na lista para isso utilizamos o metodo size

         System.out.println(" a media é: " + (soma/notas.size()));

         // para remover podemos passar a posição ou o objeto
         notas.remove(0d);
         notas.remove(0);
         System.out.println(notas);

         Iterator<Double> iterator1 = notas.iterator();
         while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
         }
         System.out.println(notas);

         // para apagar toda a lista utilizamos o metodo clear
         notas.clear();
         System.out.println(notas);
         // para verificar se uma lista esta vazia utilizamos o metodo isEmpty
         System.out.println(notas.isEmpty());





    
}
}
