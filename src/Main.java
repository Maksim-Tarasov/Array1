public class Main {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 2, 3};
        double[] secondArray = new double[]{1.57, 7.6d, 9.986};
        int[] thirdArray = new int[]{371, 31, 80, 97, 77};

        for (int i = 0; i < firstArray.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(firstArray[i]);
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(secondArray[i]);
        }
        System.out.println();
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i] + ",");
        }
        System.out.println();
        for (int i = firstArray.length - 1; i >= 0; i--) {
            if (i != firstArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(firstArray[i]);
        }
        System.out.println();
        for (int i = 2; i >= secondArray.length; i--) {
            System.out.print(secondArray[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = thirdArray.length - 1; i >= 0; i--) {
            System.out.print(thirdArray[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0)
                firstArray[i] += 1;
        }
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            {
                if (i != 2)
                    System.out.print(", ");
            }
        }
    }
}









