
import java.util.Random;
import java.util.Scanner;
public class RandomStringGenerator {
    // User-defined function
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of random string: ");
        int length = sc.nextInt();

        String randomString = generateRandomString(length);
        System.out.println("Generated Random String: " + randomString);

        sc.close();
    }
}