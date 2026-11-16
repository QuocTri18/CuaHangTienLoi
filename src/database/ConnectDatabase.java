package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=CuaHangTienLoi;encrypt=false";
    private static final String USER = "RightTom";
    private static final String PASSWORD = "18042004";
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    /**
     * Kết nối tới SQL Server.
     *
     * @return Đối tượng Connection nếu thành công, ngược lại null
     */
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.err.println("❌ Kết nối CSDL thất bại: " + e.getMessage());
            return null;
        }
    }

    // Hàm main test kết nối (tuỳ chọn)
    public static void main(String[] args) {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("✅ Kết nối thành công!");
        } else {
            System.out.println("❌ Kết nối thất bại!");
        }
    }
}
