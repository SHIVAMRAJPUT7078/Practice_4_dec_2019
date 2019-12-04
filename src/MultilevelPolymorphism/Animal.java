package MultilevelPolymorphism;


public class Animal {
    public void eat(){
        System.out.println("Eating");
    }
}
class DOG extends Animal{
    public void eat(){
        System.out.println("Eating fruits");
    }
}
class BabyDOG extends DOG{
    public void eat(){
        System.out.println("Drinking milk");
    }
}
class TestClass{
    public static void main(String[] args) {
        Animal a1 = new Animal();

        Animal a2 = new DOG();
        DOG a3 = new BabyDOG();
        a1.eat();
        a2.eat();
        a3.eat();

    }

}
