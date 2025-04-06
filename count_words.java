public class count_words{
    public static void main(String[] args) {
        String str = "hello my sharavanan thankyou visit my github account";
        int count= 1;

        for(int i = str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if(ch==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}