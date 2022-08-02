
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        int q = array[0];
        for (int i : array) {
            if (i < q) {
                q = i;
            }
        }
        return q;
    }

    public static int indexOfSmallest(int[] array) {
        int q = smallest(array);
        int x = 0;

        for (int i : array) {
            if (i == q) {
                break;
            }
            x++;
        }
        return x;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int q = table[startIndex];
        int x = startIndex;

        for (int i = startIndex; i <= table.length - 1; i++) {
            if (table[i] < q) {
                q = table[i];
                x = i;
            }
            
        }
        return x;
    }

    public static void swap(int[] array, int index1, int index2) {
        int ph1 = array[index1];
        int ph2 = array[index2];
        array[index2] = ph1;
        array[index1] = ph2;
    }

    public static void sort(int[] array) {

        System.out.println(array);

        for (int i = 0; i <= array.length - 1; i++) {
            int q = indexOfSmallestFrom(array, i);
            swap(array, q, i);
        }
        
        System.out.println(array);
    }
}
