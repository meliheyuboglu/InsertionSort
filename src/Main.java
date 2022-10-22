import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InsertionSort objekt = new InsertionSort();
        int[] array = { 28 , 16 , 13 , 51 , 61 , 1 };
        objekt.insertionsort(array);
        System.out.println(Arrays.toString(array));
    }
}
