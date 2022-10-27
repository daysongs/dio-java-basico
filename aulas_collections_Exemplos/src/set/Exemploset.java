package set;

import java.util.*;


public class Exemploset {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        
        //      Set notas = new HashSet(); //antes do java 5
        //      HashSet<Double> notas = new HashSet<>();
        //      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
        /*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
                notas.add(1d);
                notas.remove(5d);
                System.out.println(notas);
        */
        
                System.out.println("Crie um conjunto e adicione as notas: ");
                Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
                System.out.println(notas.toString());

                // Verificar se um determinado intem esta no set
                System.out.println("a nota 5 esta no set: " + notas.contains(5d));
        
        //      // exibir menor e moiro nota  
                System.out.println("a maior nota é: " + Collections.max(notas));
                System.out.println("a menor nota é: " + Collections.min(notas));
                // para somar temos que utilizar o interator como foi feito na lista
                Iterator<Double> iterator = notas.iterator();
                Double soma = 0d;
                while(iterator.hasNext()){
                    Double next = iterator.next();
                    soma+= next;
                }
                System.out.println("A soma é: " + soma);
                // para saber a quantidade utiliza o meto size
                System.out.println("A media é: " + (soma/notas.size()));
                // para remover utiliza o metodo remove
                notas.remove(0d);
                System.out.println(notas);
                System.out.println("Remova as notas menores que 7 e exiba a lista: ");
                Iterator<Double> iterator1 = notas.iterator();
                while(iterator1.hasNext()){
                    Double next = iterator1.next();
                    if (next < 7) iterator1.remove();
                }
                System.out.println(notas);
        
                System.out.println("Exiba todas as notas na ordem em que foram informados: ");
                Set<Double> notas2 = new LinkedHashSet<>();
                notas2.add(7d);
                notas2.add(8.5);
                notas2.add(9.3);
                notas2.add(5d);
                notas2.add(7d);
                notas2.add(0d);
                notas2.add(3.6);
                System.out.println(notas2);
        
                System.out.println("Exiba todas as notas na ordem crescente: ");
                Set<Double> notas3 = new TreeSet<>(notas2);
                System.out.println(notas3);
        
                System.out.println("Apague todo o conjunto");
                notas.clear();
        
                System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
                System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
                System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());


        
            }
}
