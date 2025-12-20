import java.util.*;
public class KthSmallest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 12, 3, 5, 7, 19, 1);
        int k = 3;  
        Collections.sort(list); 
        int kthSmallest = list.get(k - 1); 
        System.out.println("The " + k + "rd smallest element is: " + kthSmallest);
    }
}
