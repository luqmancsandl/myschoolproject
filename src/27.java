import java.util.Random;

public class MySchoolProject {
    public static void main(String[] args) {
        int x = 5;
        Random rand = new Random();
        System.out.println("The number " + x + " is in the range " + (rand.nextInt(10) + 1));
    }
}
