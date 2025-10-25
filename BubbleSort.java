public class BubbleSort {
    private int iteracao;
    private int trocas;
    private long tempo;

    public BubbleSort(){}

    public void bubbleFlag(int tamanho, int []vetor){
        int temp = 0;
        int iteracao = 0;
        int trocas = 0;

        long inicio = System.nanoTime();
        for (int i = 0; i < tamanho - 1; i++){
            boolean change = false;
            for (int j = 1; j < tamanho-i; j++) {
                iteracao++;
                if (vetor[j - 1] > vetor[j]) {
                    temp = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = temp;
                    change = true;
                    trocas++;
                }
            }
            if (change == false){
                break;
            }
        }
        long fim = System.nanoTime();
        long tempo = fim - inicio;

        this.iteracao = iteracao;
        this.trocas = trocas;
        this.tempo = tempo;

    }

    public int getInteracao() {
        return iteracao;
    }

    public long getTempo() {
        return tempo;
    }

    public int getTrocas() {
        return trocas;
    }

}
