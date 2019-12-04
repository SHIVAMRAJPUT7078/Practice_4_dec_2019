package JavaAbstraction;

public abstract class Bank {
    abstract int getInterest();
}
class SBI extends Bank{
    // THE ABOVE LINE CAN ALSO BE WRITTEN AS ABSTRACT CLASS SBI IF WE DO NOT IMPLEMENT THE ABSTRACT METHOD OF THE BANK CLASS
    int getInterest(){
        return 10;
    }
}
class PNB extends Bank{
    int getInterest(){
        return 15;
    }
}
class TestClass{
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println(b.getInterest());
        b = new PNB();
        System.out.println(b.getInterest());
    }

}