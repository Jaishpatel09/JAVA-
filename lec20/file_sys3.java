import java.io.*;

import javax.xml.crypto.Data;
public class file_sys3 {
    static void writeData(String data){
        try{
            FileWriter writer=new FileWriter("New.txt",true);
            writer.write(data);
            writer.close();
            System.out.println("hiiiiiii");
        }catch(Exception e){
            System.out.println(e);
        }
    }
        static void FileRead(){
            try{
                FileReader reader=new FileReader("New.txt");
                int ch;
                while ((ch=reader.read())!=-1) {
                    System.out.println((char)ch);
                    
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
        static void Filedelete(){
            File File=new File("new.txt");
            if(File.delete()){
                System.out.println("file delellll");
            
            }    else{
                System.out.println("nooo");

            }
        }

    public static void main(String[] args) {
        File file=new File ("Cat.txt");
        writeData("hii\n");
        FileRead();
        Filedelete();


    }
}
