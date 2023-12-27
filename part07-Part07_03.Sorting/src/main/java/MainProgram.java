import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
        int smallest =  array[0];
        int index = 0;

        while (index < array.length){
            if(smallest > array[index]){
                smallest = array[index];
            }
            index++;
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int smallest  = smallest(array);
        int indexOfSmallest = 0;
        int index = 0;
        while(index < array.length){
            if(smallest == array[index]){
                indexOfSmallest = index;
            }
            index++;
        }

        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int index = startIndex;
        int indexOfSmallest = index;
        int smallest = table[startIndex];

        while(index < table.length){
            if(smallest > table[index]){
                smallest = table[index];
                indexOfSmallest = index;
            }
            index++;
        }

        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2){
        int swap  = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;

    }

    public static void sort(int[] array){
        int index = 0;
        while (index < array.length){
           swap(array, index, indexOfSmallestFrom(array, index));
           System.out.println(Arrays.toString(array));
            index++;
        }
    }
}
