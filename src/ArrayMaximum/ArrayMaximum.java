package ArrayMaximum;

public class ArrayMaximum {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
        int max = array[0];
        for (int k = 1; k < array.length; k++) {
            if (max < array[k]) max = array[k];
        }

        System.out.println("Максимальное число: " + max);
        int min = array[0];
        for (int l = 1; l < array.length; l++) {
            if (min > array[l]) min = array[l];
        }
        System.out.println("Минимальное число: " + min);
    }
}
