public class valid_palindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

      
        boolean isPalindrome = cleaned.equals(reversed);

        System.out.println("Is valid palindrome? " + isPalindrome);
        System.out.println(reversed);
    }
}
