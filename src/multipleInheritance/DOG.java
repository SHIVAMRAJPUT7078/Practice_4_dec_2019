package multipleInheritance;
// this is the example of multiple inheritance;
public interface DOG {
    public abstract void eat();
}
interface CAT{
    public abstract void eat();
}
class TestClass2 implements DOG,CAT{
    public void eat(){
        System.out.println("hello!");
    }

    public static void main(String[] args) {
        TestClass2 t = new TestClass2();
        t.eat();
    }
}