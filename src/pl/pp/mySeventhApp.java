package pl.pp;
public class mySeventhApp {
    private int age;

    public mySeventhApp(int age) {
        this.age = age;
    }

    public void growOld(int years) {
        this.age += years;
    }

    public void beYounger() {
        this.age -= 1;
    }

    public static void main(String[] args) {
        mySeventhApp person1 = new mySeventhApp(30);
        System.out.println("Initial age: " + person1.age); // Output: Initial age: 30
        person1.growOld(10);
        System.out.println("Age after growing old: " + person1.age); // Output: Age after growing old: 40
        person1.beYounger();
        System.out.println("Age after getting younger: " + person1.age); // Output: Age after getting younger: 39
    }
}
