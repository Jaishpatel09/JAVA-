import java.util.Arrays;

public class hello {
    public static void main(String[] args){
        String a= "hello";
        String b= "lloeh";
        char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String str1=new String(ch1);
        String str2=new String(ch2);
        if(str1.equals(str2)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }

}
