public class Longest_word {
    public static void main(String[] args) {
        String sentence = "i love programming language";
        String[] words = sentence.split(" ");

        String long_word ="";
        int max_length =0;
        String reverse ="";


        for(String word:words){
            if(word.length()>max_length){
                max_length = word.length();
                long_word = word;
            }
        }
        System.out.println(long_word);

        for(int i =words.length-1;i>=0;i--){
            reverse = reverse + words[i] +" ";
        }

        System.out.println(reverse);

        


    }
    
}
