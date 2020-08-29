package day47_Encapsulations;

public class Test {
    public static void main(String[] args) {
        System.out.println(Access_Modifiers.publicVariable);
        Access_Modifiers.publicMethod();

        System.out.println(Access_Modifiers.defaultVariable);
        Access_Modifiers.defaultMethod();

        //System.out.println(Access_Modifiers.privateVariable); // private
        //AccessModifiers.privateMethod();

        Encapsulation obj1 = new Encapsulation();
        //System.out.println(obj1.ssn);
        System.out.println(obj1.getSsn());

        obj1.setSsn(7654321);
        System.out.println(obj1.getSsn());




    }


}
