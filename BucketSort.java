public class BucketSort {
    private int iteracao;
    private int trocas;
    private long tempo;

    public BucketSort() {}

    public void sort(int tamanho, int[] vetor) {
        int iteracao = 0;
        int trocas = 0;
        long inicio = System.nanoTime();

        int numBuckets = 5;
        int intervalo = 100 / numBuckets;

        int[][] buckets = new int[numBuckets][tamanho];
        int[] indices = new int[numBuckets];

        for (int i = 0; i < tamanho; i++) {
            int bucketIndex = (vetor[i] - 1) / intervalo;
            if (bucketIndex >= numBuckets) bucketIndex = numBuckets - 1;
            buckets[bucketIndex][indices[bucketIndex]] = vetor[i];
            indices[bucketIndex]++;
        }

        BubbleSort bs = new BubbleSort();
        for (int b = 0; b < numBuckets; b++) {
            bs.bubbleFlag(indices[b], buckets[b]);
            iteracao += bs.getInteracao();
            trocas += bs.getTrocas();
        }

        int pos = 0;
        for (int b = 0; b < numBuckets; b++) {
            for (int j = 0; j < indices[b]; j++) {
                vetor[pos++] = buckets[b][j];
            }
        }

        long fim = System.nanoTime();
        tempo = fim - inicio;

        this.iteracao = iteracao;
        this.trocas = trocas;

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
