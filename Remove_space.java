public class Remove_space {
    public static void main(String[] args) {
        String str = "hello hi";
        String result ="";
        for(int i = 0;i<=str.length()-1;i++){
            char ch = str.charAt(i);

            if(ch!=' '){
                result = result+ch;
            }
        }
        System.out.println(result);
    }
    
}
