abstract class Animal{
abstract void eat();    
}

class Cat extends Animal{
    void eat(){
        System.out.println("kitkat");
    }
}
class Main{
    public static void main(String[] args) {
        Cat s1=new Cat();
        s1.Cat();
    }
}