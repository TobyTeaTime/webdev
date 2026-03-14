interface Interface {

    int addition(int a, int b);

}
public class Lesson {

    public static void main(String[] args) {

        Interface add = (a, b) -> a + b;

        int result = add.addition(10, 20);
        System.out.println("Sum: " + result);

    }

}