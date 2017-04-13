import java.util.HashMap;

/**
 * Created by Amit on 04/03/17.
 */
public class StringReverse {
    public static void reverseMe(String str){
        char []str1 = reverseString(str.toCharArray(),0, str.length());
        int startIndex = 0;
        for (int i =0; i< str1.length;i++){
            if(str1[i] == ' '){
                System.out.println(startIndex+" i = "+(i));
                reverseString(str1, startIndex,(i));
                startIndex = i+1;
            }
        }
        reverseString(str1, startIndex,str1.length);
        System.out.println(str1);
    }

    public static char[] reverseString(char[] str, int start, int end){
        //int end = str.length;
        for (int i = start;i< end; i++,end--){
            char temp = str[i];
            str[i] = str[end-1];
            str[end-1] = temp;
        }
        return str;
    }

    public static void main(String[] args) {
        reverseMe("My Name is Amit");
        HashMap<String ,String> map = new HashMap<>();
        map.put("Amit","Kumar");

    }
}
