public class stringcode {
    public static void main(String[] args) {
        String str="Hello";
        String newStr="";
        for (char ch: str.toCharArray()){
            if(newStr.indexOf(ch)==-1){
                newStr+=ch;
            }
        }
        System.out.println(newStr);
    }


    
}
