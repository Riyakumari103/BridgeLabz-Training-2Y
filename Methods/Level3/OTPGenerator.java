package Methods.Level3;

import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {
    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000);
    }
    public static boolean generateUniqueOTPs() {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            otpSet.add(generateOTP());
        }
        return otpSet.size() == 10;
    }

    public static void main(String[] args) {
        System.out.println("Are all 10 OTPs unique? " + generateUniqueOTPs());
    }
}