package RandomGeneration;
import java.util.Random;

public class RandomNumberOTP4Digit {
    public static void main(String[] args) {

        Random ramdom = new Random();
        int otp = ramdom.nextInt(1000, 9999);
        System.out.println("Your OTP is: " + otp);

    }
}
