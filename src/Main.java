import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 21, 43, 38, 50, 9, 1, 77, 95, 63};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an index : ");
        int index = scanner.nextInt();

        try {
            int element = getElement(list, index);
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index is out of bounds!");
        }
    }

    public static int getElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

}
