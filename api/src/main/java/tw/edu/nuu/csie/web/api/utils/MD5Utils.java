package tw.edu.nuu.csie.web.api.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

    /**
     * Calculates the MD5 hash of a string.
     *
     * @param input the string to hash
     * @return the MD5 hash of the input string
     * @throws NoSuchAlgorithmException if the MD5 algorithm is not available
     */
    public static String md5(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hashBytes = md.digest(input.getBytes());

        // Convert the byte array to a hex string
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

}