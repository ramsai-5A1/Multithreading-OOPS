import java.util.Arrays;

class Box {
    int id;
    String name;

    Box() {
        this(-1, "Dummy");
    }

    Box(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Box(Box other) {
        this.id = other.id;
        this.name = other.name;
    }

    public void printAsString() {
        System.out.println("Id is: " + id + " Name is: " + name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.id + " Object is getting destroyed");
    }
}

public class Main {
    public static void main(String[] args) {

//        Box obj = new Box(1, "Ram");
//        obj.printAsString();
//        Box obj2 = new Box(1, "Ram");
//        System.out.println(obj2);

//        Box[] arr = new Box[2];
//        System.out.println(Arrays.toString(arr));
//        Box obj3 = new Box(obj2);
//        obj2.printAsString();

//        Box obj4 = new Box();
//        obj4.printAsString();

//        Box curr;
//        for(int i = 0; i < 100000000; i++) {
//            curr = new Box(i, "Kumar");
//        }
        Box obj = new Box();
        obj.printAsString();
    }
}