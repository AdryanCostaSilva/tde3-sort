public class SelectionSort {
    private int iteracao;
    private int trocas;
    private long tempo;

    public SelectionSort(){}

    public void sort(int tamanho, int[] vetor){
        int temp;
        int trocas = 0;
        int iteracao = 0;

        long inicio = System.nanoTime();
        for (int i = 0; i < tamanho - 1; i++){
            int indiceMinimo = i;
            for (int j = i + 1; j < tamanho; j++){
                if (vetor[j] < vetor[indiceMinimo]){
                    indiceMinimo = j;
                }
                iteracao++;
            }

            if (indiceMinimo != i){
                temp = vetor[i];
                vetor[i] = vetor[indiceMinimo];
                vetor[indiceMinimo] = temp;
                trocas++;
            }
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
