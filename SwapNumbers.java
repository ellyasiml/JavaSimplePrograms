import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        
        System.out.println("Before swapping: ");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        
        
        int temp = x;
        x = y;
        y = temp;
        
        System.out.println("After swapping: ");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        
        scanner.close();
    }
}
