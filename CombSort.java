public class CombSort {
    private int iteracao;
    private int trocas;
    private long tempo;

    public CombSort(){}

    public void sort(int tamanho, int []vetor){
        int temp = 0;
        int iteracao = 0;
        int trocas = 0;

        long inicio = System.nanoTime();
        boolean change = true;
        int gap = tamanho;

        while(gap > 1 || change){

            change = false;
            if (gap > 1) {
                gap = (int) (gap / 1.3);
            }

            for (int i = 0; i + gap < tamanho; i++){
                if (vetor[i] > vetor[i + gap]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i + gap];
                    vetor[i + gap] = temp;
                    change = true;
                    trocas++;
                }
                iteracao++;
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

    public int getIteracao() {
        return iteracao;
    }

    public long getTempo() {
        return tempo;
    }

    public int getTrocas() {
        return trocas;
    }
}
