class person {
    void displayName() {
        System.out.println("Name: Jaish");
    }

}

class student extends person{

    void displayClass() {
        System.out.println("class:12th");
    }
}

class Monitor extends student{

    void checkDiscipline() {
        System.out.println("Monitor is checking Discipline");
    }
}

public class Main {
    public static void main (String[] args) {
        Monitor mo = new Monitor();
        mo.displayName();
        mo.displayClass();
        mo.checkDiscipline();
    }
}
