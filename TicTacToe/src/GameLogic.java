import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameLogic extends JPanel implements ActionListener {
	private JButton[] buttons = new JButton[9];
	private boolean playerXTurn = true;
	private String playerX, playerO;

	public GameLogic() {
		setLayout(new GridLayout(3, 3));
		setBackground(Color.DARK_GRAY);

		playerX = JOptionPane.showInputDialog("Nombre del Jugador X:");
		playerO = JOptionPane.showInputDialog("Nombre del Jugador O:");

		DatabaseManager.registerPlayer(playerX);
		DatabaseManager.registerPlayer(playerO);

		for (int i = 0; i < 9; i++) {
			buttons[i] = new JButton();
			buttons[i].setFont(new Font("Arial", Font.BOLD, 40));
			buttons[i].setFocusPainted(false);
			buttons[i].addActionListener(this);
			add(buttons[i]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		if (!clicked.getText().equals(""))
			return;

		clicked.setText(playerXTurn ? "X" : "O");
		clicked.setForeground(playerXTurn ? Color.BLUE : Color.RED);

		if (checkWin()) {
			String winner = playerXTurn ? playerX : playerO;
			JOptionPane.showMessageDialog(this, "Ganador: " + winner);
			DatabaseManager.recordWin(winner, playerXTurn ? playerO : playerX);
			resetBoard();
		} else if (isDraw()) {
			JOptionPane.showMessageDialog(this, "Empate");
			DatabaseManager.recordDraw(playerX, playerO);
			resetBoard();
		} else {
			playerXTurn = !playerXTurn;
		}
	}

	private boolean checkWin() {
		String[][] board = new String[3][3];
		for (int i = 0; i < 9; i++)
			board[i / 3][i % 3] = buttons[i].getText();

		for (int i = 0; i < 3; i++) {
			if (!board[i][0].equals("") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]))
				return true;
			if (!board[0][i].equals("") && board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]))
				return true;
		}

		return !board[1][1].equals("") && ((board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
				|| (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])));
	}

	private boolean isDraw() {
		for (JButton button : buttons)
			if (button.getText().equals(""))
				return false;
		return true;
	}

	private void resetBoard() {
		for (JButton button : buttons)
			button.setText("");
		playerXTurn = true;
	}
}
