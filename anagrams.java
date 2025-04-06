import java.util.Arrays;
public class anagrams {
    public static void main(String[] args) {
        String str1 = "eat";
        String str2 ="teag";

        if(str1.length()!=str2.length()){
            System.out.println("its not a anagrams");
            return ;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("its an anagrams");
        }else{
            System.out.println("ist not a anagrams");
        }


        

       
    }
    
}
