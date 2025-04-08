import java.security.DrbgParameters.Capability;

public class Upper_Case {
    public static void main(String[] args) {
        String str = "hello world";
        String capital = "";


        for(int i=0;i<str.length();i++){
            
            char ch = str.charAt(i);
            if(i==0||str.charAt(i-1)==' '){
                capital+=Character.toUpperCase(ch);

            }else{
                capital = capital +ch;
            }
             
        }
        System.out.println(capital);
    }
    
}
