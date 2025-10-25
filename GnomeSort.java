public class GnomeSort {
    private int iteracao;
    private int trocas;
    private long tempo;

    public GnomeSort(){}

    public void sort(int tamanho, int []vetor){
        int temp = 0;
        int iteracao = 0;
        int trocas = 0;

        long inicio = System.nanoTime();

        int i = 1;
        while (i < tamanho){
            if (i == 0 || vetor[i] >= vetor[i - 1]){
                i++;

            }
            else {
                temp = vetor[i];
                vetor[i] =  vetor[i - 1];
                vetor[i - 1] = temp;
                trocas++;
                i--;
            }
            iteracao++;
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

