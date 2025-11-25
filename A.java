
class Main{
    public static void main(String[] args){
        A s1= new Dog();
        s1.eat();
        Dog s2=(Dog)s1;
    }
   
}

public class A{
    
   void eat(){
        System.out.println("Pizza");
    }
     void sleep(){
        System.out.println("huu");
    }
}
class Dog extends A{
    void eat(){
        System.out.println("Biryanii");
    }
    void data(){
        System.out.println("hii");
    }
}

