public class remove_dulicate {
    public static void main(String[] args) {
        String str ="hello my name is shararvanan how are you?";
        String spaces = "";
        String result ="";

        for(int i = 0;i<str.length();i++){
            char remove_space = str.charAt(i);
            if(remove_space!=' '){
                spaces+=str.charAt(i);
            }
        }

        for(int i =0;i<spaces.length();i++){
            char current_char = spaces.charAt(i);
            
            if(result.indexOf(current_char)==-1){
                result+=current_char;
            }
        }
        System.out.println(result);


    }
    
}
