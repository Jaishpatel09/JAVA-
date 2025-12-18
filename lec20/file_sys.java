import java.io.*;
public class file_sys {

    public static void main(String[] args) {
        File file=new File ("tree.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already existed");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    
        
    }
}
