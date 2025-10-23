public class CockTailSort {
    private int iteracao;
    private int trocas;
    private long tempo;

    public CockTailSort(){}

    public void sort(int tamanho, int[] vetor){
        int temp;
        int trocas = 0;
        int iteracao = 0;

        long inicio = System.nanoTime();

        boolean change = true;
        int inicio_array = 0;
        int fim_array = tamanho - 1;
        while (change){
            change = false;
            for (int i = inicio_array; i < fim_array; i++){
                if (vetor[i] > vetor[i+1]){
                    temp = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = temp;
                    trocas++;
                    change = true;
                }
                iteracao++;
            }

            if(!change){
                break;
            }

            change = false;
            fim_array--;

            for (int j = fim_array; j > inicio_array; j--){
                if (vetor[j] < vetor[j-1]){
                    temp = vetor[j];
                    vetor[j] = vetor[j-1];
                    vetor[j-1] = temp;
                    trocas++;
                    change = true;
                }
                iteracao++;
            }
            inicio_array++;
        }

        long fim = System.nanoTime();
        long tempo = fim - inicio;

        this.iteracao = iteracao;
        this.trocas = trocas;
        this.tempo = tempo;

        System.out.println("Iterações: " + iteracao);
        System.out.println("Trocas: " + trocas);
        System.out.println("Tempo de execução: " + tempo + " ns");
    }

}
