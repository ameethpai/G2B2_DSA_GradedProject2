import java.util.*;


public class SkyscraperConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the total number of floors in the building:");
        int n = sc.nextInt();
        
        PriorityQueue<Integer> sizes = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the floor size given on day " + i + ":");
            int size = sc.nextInt();
            
            sizes.add(size);
            
            List<Integer> toBeAssembled = new ArrayList<>();
            while (!sizes.isEmpty() && sizes.peek() == i) {
                toBeAssembled.add(sizes.poll());
            }
            
            if (toBeAssembled.isEmpty()) {
                System.out.println();
            } else {
                for (int s : toBeAssembled) {
                    System.out.print(s + " ");
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}