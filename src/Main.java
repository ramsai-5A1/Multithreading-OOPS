

class Box {
    int id;
    String name;

    Box(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printAsString() {
        System.out.println("Id is: " + id + " Name is: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Box obj = new Box(1, "Ram");
        obj.printAsString();
    }
}