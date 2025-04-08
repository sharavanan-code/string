public class Remove_space_add {
    public static void main(String[] args) {
        String str = "hello my name is sharavanan";
        String result = "";
        String final_result = "";

        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch==' '){
                result+="-";
            }
            else{
                result+=ch;
            }
        }

        for(int i =0;i<result.length();i++){
            char ch = result.charAt(i);
            if(ch!=' '){
                final_result +=ch;
            }

        }

        System.out.println(str);
        System.out.println(result);
        //System.out.println(final_result);
    }
    
}
