public class Ex1_OrdemInversa {
    public static void main(String[] args) throws Exception {
        int[] vetor = {1, -5, 80, -90, 100, 32};
        int count = 0;
        System.out.println("Vetor: ");
        while(count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;


        }

        System.out.println("\nVetor inverso: ");
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
        
    }
}
