package interfaceExample;

public interface Bank {
    public static final int a = 0;
    // the above line can also be written as int a = 0; public static final is by default in the interface
    public abstract int getInt();
}
//interface LOAN{
//    public abstract int getLoan();
//}
class SBI implements Bank{
    public int getInt(){
        return 0;
    }
}
class CBI implements Bank{
    public int getInt(){
        return 10;
    }
}
class TestClass1 implements Bank {
    // the above line is written as i case of multiple inheritance
    // class TestClass1 implements Bank,LOAN{
    public int getInt(){
        return 4;
    }
    public int getLoan(){
        return 14;
    }
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println(b.getInt());
        b = new CBI();
        System.out.println(b.getInt());
        //TestClass1 testClass1 = new TestClass1();
        //System.out.println(testClass1.getInt());
        //System.out.println(testClass1.getLoan());
    }
}

