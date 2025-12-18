import java.io.*;
public class file_sys2 {

    public static void main(String[] args) {
        File file=new File ("Cat.java");
        try{
            if(file.createNewFile()){
                System.out.println("File created"+file.getName());
                System.out.println("File created"+file.getAbsoluteFile());

            }else{
                System.out.println("File already existed");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    
        
    }
}
