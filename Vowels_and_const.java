public class Vowels_and_const{
    public static void main(String[] args) {
        String str = "hello";
        int count = 0;
        int con = 0;

        for(int i = str.length() -1;i>=0;i--){
            char ch = str.charAt(i);
            if(ch== 'a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'){
                count++;
            }
            else{
                con++;
            }
        }
        System.out.println(count);
        System.out.println(con);
    }
}