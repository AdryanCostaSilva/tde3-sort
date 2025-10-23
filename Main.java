public class Main {
    public static void main(String[] args){
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        BubbleSort bs = new BubbleSort();

        int[] copiaBubble1 = copia(vetor1);
        int[] copiaBubble2 = copia(vetor2);
        int[] copiaBubble3 = copia(vetor3);

        System.out.println("===========Buble com Flag===========\n");

        System.out.println("---Vetor 1---");
        bs.bubbleFlag(20, copiaBubble1);
        printArray(copiaBubble1);

        System.out.println(" ");

        System.out.println("---Vetor 2---");
        bs.bubbleFlag(20, copiaBubble2);
        printArray(copiaBubble2);

        System.out.println(" ");

        System.out.println("---Vetor 3---");
        bs.bubbleFlag(20, copiaBubble3);
        printArray(copiaBubble3);


        SelectionSort ss = new SelectionSort();

        int[] copiaSelectionSort1 = copia(vetor1);
        int[] copiaSelectionSort2 = copia(vetor2);
        int[] copiaSelectionSort3 = copia(vetor3);

        System.out.println(" ");

        System.out.println("===========Selection Sort===========\n");

        System.out.println("---Vetor 1---");
        ss.sort(20, copiaSelectionSort1);
        printArray(copiaSelectionSort1);

        System.out.println(" ");

        System.out.println("---Vetor 2---");
        ss.sort(20, copiaSelectionSort2);
        printArray(copiaSelectionSort2);

        System.out.println(" ");

        System.out.println("---Vetor 3---");
        ss.sort(20, copiaSelectionSort3);
        printArray(copiaSelectionSort3);
    }

    static void printArray(int[] vetor) {
        for (int v : vetor) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    private static int[] copia(int[] vetor) {
        int[] copia = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            copia[i] = vetor[i];
        }
        return copia;
    }
}
