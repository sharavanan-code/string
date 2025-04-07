public class Digitcheck {
    public static void main(String[] args) {
        String str = "1234";

        boolean only_digits = true;

        for(int i = 0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                only_digits=false;
                break;
            }
        }

        if(only_digits==true){
            System.out.println("string contains only numbers");
        }
        else{
            System.out.println("String does not contain numbers");
        }
    }
    
}
