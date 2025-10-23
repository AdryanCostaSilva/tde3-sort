public class Main {
    public static void main(String[] args){
        int[] vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        BubbleSort bs = new BubbleSort();

        System.out.println("Vetor 1: ");
        bs.bubbleFlag(20, vetor1);
        printArray(vetor1);

        System.out.println("Vetor 2: ");
        bs.bubbleFlag(20, vetor2);
        printArray(vetor2);

        System.out.println("Vetor 3: ");
        bs.bubbleFlag(20, vetor3);
        printArray(vetor3);
    }

    static void printArray(int[] vetor) {
        for (int v : vetor) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
