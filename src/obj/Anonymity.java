package obj;

public interface Anonymity {
    int run(int distance);

}

//class AnonymityImpl implements Anonymity{
//
//    @Override
//    public void run() {
//        System.out.println("run");
//    }
//}
class Main2 {
    public static void main(String[] args) {
        Anonymity a = d ->d;
        System.out.println(a.run(10));


    }
}