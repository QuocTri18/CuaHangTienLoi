package Lib.MaHoa;

import java.security.MessageDigest;

public class MaHoaUtil {

    public static String sha256(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashed = md.digest(input.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : hashed) {
                sb.append(String.format("%02x", b));  // convert byte to hex
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException("❌ Không thể mã hóa SHA-256", e);
        }
    }
}
