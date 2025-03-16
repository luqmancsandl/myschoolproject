import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("The generated code is: " + rand.nextInt());
    }
}