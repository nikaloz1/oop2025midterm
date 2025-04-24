import java.util.Arrays;
import java.util.List;

public class t1 {
    public static void main(String[] args) {
        // lists 1 and 2
        List<Integer> list1 = Arrays.asList(6, 1, 4, 7, 3, 9, 10, 5, 8, 2);
        List<String> list2 = Arrays.asList(
            "zwu", "zkt", "bmf", "rfw", "msz", "yym", 
            "eql", "hbw", "bcf", "wo", "ply", "miv"
        );

        // list3 using list1 elements-1 as indices
        List<String> list3 = new java.util.ArrayList<>();
        for (int index : list1) {
            list3.add(list2.get(index - 1));
        }

        // printing all the lists
        printList("list1:", list1);
        printList("list2:", list2);
        printList("list3 (result):", list3);
    }
     // method for printing the lists
     private static void printList(String title, List<?> list) {
        System.out.println("\n## " + title);
        for (Object item : list) {
            System.out.print(item + "    ");
        }
        System.out.println(); // new lines after each list
    }
}