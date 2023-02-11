import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[10];
    }

    class Main
    {
        // Generic method to convert an array to an ArrayList
        public static <T> List<T> convertToList(T arr[])
        {
            // create an empty list
            List<T> list = new ArrayList<>();

            // push each array element into the list
            for (T i: arr) {
                list.add(i);
            }

            // return the list
            return list;
        }

        // Program to convert an array to a list in Java
        public static void main(String[] args)
        {
            // given string array
            String str[] = { "A", "B", "C", "D" };

            // convert array to a list
            List<String> list = convertToList(str);

            // print list
            System.out.println(list);
        }
    }
}
