package day50_Inheritance_Overriding;
import day50_Inheritance_Overriding.AccessModifier;

public class InheritanceTest  extends AccessModifier{
    public static void main(String[] args) {
        System.out.println(InheritanceTest.publicData); //public visible outside pachage
        System.out.println(InheritanceTest.protectedData); //protected is visible always
        System.out.println(InheritanceTest.defaultData); //
    }
}
