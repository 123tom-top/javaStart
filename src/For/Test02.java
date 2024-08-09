package For;


    class Super {
        int i = 0;

        public Super(String a) {
            System.out.println("A");
            i = 1;
        }

        public Super() {
            System.out.println("B");
            i += 2;
        }
    }

    class Test extends Super {
        public Test(String a) {

            System.out.println("C");
            i = 5;
        }

        public static void main(String[] args) {
            int i = 4;
            Super d = new Test("A");
            System.out.println(d.i);
        }
    }



