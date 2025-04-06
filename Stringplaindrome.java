public class Stringplaindrome {
    public static void main(String[] args) {
        String str = "hello";
        String reverse = "";

        for(int i = str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);

        if(str==reverse){
            System.out.println("its plaindrome");
        }
        else{
            System.out.println("its not plaindrome");
        }
    }
    
}
