package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(100,90,85,75,55,45,73,73,35,47,60,87,77,67,57,47,93,83,73,63,53,43) );
        System.out.println(list.toString());


        ArrayList<Integer> gradeA = new ArrayList<>(); //90~100
        gradeA.addAll( list ); //first store all the grades
        gradeA.removeIf(each -> each<90); //remove the grades that are not A.
             //only retain the grades of A
        System.out.println("Grade A: "+gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>(); //80~89
        gradeB.addAll(list); //first store all the grades
        gradeB.removeIf( p -> p < 80 || p>89 ); // second remove the grades that are not B
        System.out.println("Grade B: " + gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>();
        gradeC.addAll(list); //first store all the grades
        gradeC.removeIf( p -> p < 70 || p>79 ); // second remove the grades that are not C
        System.out.println("Grade C: " + gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll(list); //first store all the grades
        gradeD.removeIf( p -> p < 60 || p>69 ); // second remove the grades that are not D
        System.out.println("Grade D: " + gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>();
        /*gradeE.addAll(list); //first store all the grades
        gradeE.removeIf( p ->  p>59 ); // second remove the grades that are not F
        System.out.println("Grade E: " + gradeE); */
        gradeF.addAll(list);
        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);
        System.out.println("Grade F: " + gradeF);

        System.out.println(gradeA.size()+ " students made A");
        System.out.println(gradeB.size()+ " students made B");
        System.out.println(gradeC.size()+ " students made C");
        System.out.println(gradeD.size()+ " students made D");
        System.out.println(gradeF.size()+ " students failed");















    }
}
