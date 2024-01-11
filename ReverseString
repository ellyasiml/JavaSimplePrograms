import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string:");
        String input = scanner.nextLine();
        
        String reversed = reverseString(input);
        
        System.out.print("Reversed string: " + reversed);
        
        scanner.close();
    }
    private static String reverseString(String input){
        char[] charArray = input.toCharArray();
        
        int start = 0;
        int end = charArray.length - 1;
        
        while(start<end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            
            start++;
            end--;
        }
        
        return new String(charArray);
    }
}
