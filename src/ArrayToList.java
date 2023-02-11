import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        // given integer array
        Integer[] array = new Integer[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        // convert array to a list
        List<Integer> list = toList(array);
        // print list
        System.out.println(list);
    }

    // Generic method to convert an array to an ArrayList
    public static <T> List<T> toList(T[] array) {
        // create an empty list
        List<T> list = new ArrayList<>();
        // push each array element into the list
        for (T i : array) {
            list.add(i);
        }
        // return the list
        return list;
    }
}
