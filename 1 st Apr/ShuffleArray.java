import java.util.*;

public class ShuffleArray { public static void main(String[] args) { int[] arr = {1, 2, 3, 4, 5}; List<Integer> list = new ArrayList<>(); for (int num : arr) { list.add(num); }

Collections.shuffle(list); // Shuffle the array
    System.out.println("Shuffled array: " + list);
    
    // Performing operations
    int Result1 = list.get(0) + list.get(1);
    int Result2 = Result1 - list.get(1);
    int Result3 = Result2 * list.get(2);
    double Result4 = (double) Result3 / list.get(4);
    
    System.out.println("Shuffled numbers: " + list);
    System.out.println("+ = " + Result1);
    System.out.println("- =  " +Result2);
    System.out.println("* =  " +Result3);
    System.out.println("/ =  " +Result4);
    
    
}

}


