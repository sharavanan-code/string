public class remove_dulicate {
    public static void main(String[] args) {
        String str ="hello";
        String result ="";

        for(int i =0;i<str.length();i++){
            char current_char = str.charAt(i);
            
            if(result.indexOf(current_char)==-1){
                result+=current_char;
            }
        }
        System.out.println(result);


    }
    
}
