package day35_ArrayList;
import java.util.ArrayList;
public class ArrayList_Method {
    public static void main(String[] args) {
        ArrayList<String> earlyBirdList = new ArrayList<>();
        earlyBirdList.add("Ibrahim");
        earlyBirdList.add("Virginia");
        earlyBirdList.add("Ziiadin");
        earlyBirdList.add("Erfan");
        earlyBirdList.add("Aalia");


        earlyBirdList.set(2, "Aslan");
        earlyBirdList.set(0, "lan");

        System.out.println(earlyBirdList);

        earlyBirdList.clear();

        System.out.println(earlyBirdList);
        System.out.println( earlyBirdList.size());

        System.out.println("================================");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //0
        list.add(2); //1
        list.add(3); //2
        list.add(4); //3
        list.add(5);  //4

        list.remove(2);  //[1, 2, 3, 4, 5]
        list.remove(3);

        System.out.println(list);

        //remove(Element)
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1); //0
        list2.add(2); //1
        list2.add(3); //2
        list2.add(4); //3
        list2.add(5);  //4

        //int a= 1; [1,3,4,5] removes the index
        Integer a = 1; //[2, 3, 4, 5] removes the element
        list2.remove(a);

        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Hamit");   //0
        list3.add("Lillia");  //1
        list3.add("Bulent");  //2
        list3.add("Viorel");  //3
        list3.add("Musa");    //4

        //list3.remove(2); [Hamit, Lillia, Viorel, Musa]
        list3.remove("Bulent");
        System.out.println(list3);


    }
}
