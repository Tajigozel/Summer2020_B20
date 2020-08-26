package day46_ConstructorCalls2;

    import day45_Constructor.Constructor;

    public class ConstructorCall2 {

        public ConstructorCall2() {
            System.out.println("A"); //A
        }

        public ConstructorCall2(int a) {  // AB
            // ConstructorCalls2();
            this(); // calling default constructor    A
            System.out.println("B"); // B

        }


        public ConstructorCall2(String str) {
            this(4); //A B
            System.out.println("C"); // C
        }


        public ConstructorCall2(char a) {
            this();  // A
            System.out.println("D");  // D
        }

        public ConstructorCall2(double a) {
            System.out.println("E");
            // this(10);
        }


    }



