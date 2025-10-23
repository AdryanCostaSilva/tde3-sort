public class BubbleSort {
    private int interacao;
    private int trocas;
    private int tempo;

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
        System.out.println("--- Bubble com Flag --- ");
        System.out.println("Iterações: " + iteracao);
        System.out.println("Trocas: " + trocas);
        System.out.println("Tempo de execução: " + tempo + " ns");
    }

    public int getInteracao() {
        return interacao;
    }

    public int getTempo() {
        return tempo;
    }

    public int getTrocas() {
        return trocas;
    }

}
