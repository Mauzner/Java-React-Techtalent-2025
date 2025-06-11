import java.sql.*;

public class DatabaseManager {
	private static final String URL = "jdbc:mysql://localhost:3306/tic_tac_toe_db";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	public static void registerPlayer(String name) {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
			String sql = "INSERT IGNORE INTO players (name) VALUES (?)";
			try (PreparedStatement stmt = conn.prepareStatement(sql)) {
				stmt.setString(1, name);
				stmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void recordWin(String winner, String loser) {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
			conn.setAutoCommit(false);

			try (PreparedStatement win = conn.prepareStatement("UPDATE players SET wins = wins + 1 WHERE name = ?");
					PreparedStatement lose = conn
							.prepareStatement("UPDATE players SET losses = losses + 1 WHERE name = ?")) {
				win.setString(1, winner);
				lose.setString(1, loser);
				win.executeUpdate();
				lose.executeUpdate();
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void recordDraw(String player1, String player2) {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
			try (PreparedStatement stmt = conn
					.prepareStatement("UPDATE players SET draws = draws + 1 WHERE name = ?")) {
				stmt.setString(1, player1);
				stmt.executeUpdate();
				stmt.setString(1, player2);
				stmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
