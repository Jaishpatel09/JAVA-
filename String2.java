public class String2 {
   public static void main(String[] args){
    String str="java is powerful";
    String a[]=str.split( " ");
    String lagest="";
    for(String val :a){
        if(val.length()>lagest.length()){
            lagest=val;
        }
    }
    System.out.println(lagest);
   }
       

}
