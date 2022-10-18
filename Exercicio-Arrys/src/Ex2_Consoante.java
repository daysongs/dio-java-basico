import java.util.Scanner;

public class Ex2_Consoante {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] consoantes = new String[6];
        int quantidadeConoante = 0;
        int count = 0;

        do{
            System.out.println("Letra " + count + " :");
            String letra = scan.next();
            if(!(letra.equalsIgnoreCase("a")||
            letra.equalsIgnoreCase("e")||
            letra.equalsIgnoreCase("i")||
            letra.equalsIgnoreCase("o")||
            letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                quantidadeConoante++;

            }
            count++;

        }while(count < consoantes.length);

        for (String consoante : consoantes ) {
            if( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println(" Quantidade de consoantes: " + quantidadeConoante);
    }
    
}
