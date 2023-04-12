package javabasic;

import java.util.Arrays;

import java.util.Scanner;

public class TicTacToe {

	private static final char EMPTY_BOX = ' ';

	private static final char PLAYER_ONES_SYMBOL = 'X';

	private static final char PLAYER_TWOS_SYMBOL = '0';

	private final char[][] gameBoard = new char[3][3];

	private final Scanner input = new Scanner(System.in);

	private String playerOne;

	private String playerTwo;

	private String currentPlayer;

	private String whoWonTheGame;

	public void start() {

		MakeBoard();

		askForUserNames();

		while (isGameNotOver()) {

			drawBoard();

			printPlayerTurn();

			askForManeover();

		}

		printGameOver();

	}

	private void MakeBoard() {

		for (char[] chars : gameBoard) {

			Arrays.fill(chars, EMPTY_BOX);

		}

	}

	private void askForUserNames() {

		System.out.println("Welcome to TicTacToe");

		System.out.println("What's your name?");

		playerOne = input.nextLine();

		System.out.println("Who are you playing with?");

		playerTwo = input.nextLine();

		System.out.println("Who is playing first? press" + "\n1 for " + playerOne + "\n2 for " + playerTwo);

		int player = input.nextInt();

		currentPlayer = player == 1 ? playerOne : playerTwo;

	}

	private boolean isGameNotOver() {

		return !(isBoardIsFull() || hasAnyPlayerWon());

	}

	private void drawBoard() {

		System.out.println("|---|---|---|");

		for (char[] chars : gameBoard) {

			System.out.printf("| %c | %c | %c | %n", chars[0], chars[1], chars[2]);

			System.out.println("|---|---|---|");

		}

	}

	private void printPlayerTurn() {

		System.out.println(whoIsPlaying() + " 's turn");

	}

	private void askForManeover() {

		int row;

		int col;

		do {

			System.out.println("Enter a row number(1,2 or 3)");

			row = input.nextInt();
			row--;

			System.out.println("Enter a column number(1,2 or 3");

			col = input.nextInt();
			col--;

		}

		while (!validateInput(row, col));

		if (whoIsPlaying().equals(playerOne)) {

			gameBoard[row][col] = PLAYER_ONES_SYMBOL;

			currentPlayer = playerTwo;

		}

		else {

			gameBoard[row][col] = PLAYER_TWOS_SYMBOL;

			currentPlayer = playerOne;

		}

	}

	private void printGameOver() {

		drawBoard();

		System.out.println("Game over!");

		if (whoWonTheGame != null) {

			System.out.println(whoWonTheGame + " won the game");

		}

		else {

			System.out.println("game ended in tie!play again");

		}

	}

	private boolean isBoardIsFull() {

		boolean result = true;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (gameBoard[i][j] == EMPTY_BOX) {

					result = false;

					break;

				}

			}

			if (!result)
				break;

		}

		return result;

	}

	private boolean hasAnyPlayerWon() {

		char cross = ' ';

		for (int i = 0; i < 3; i++) {

			if (gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][1] == gameBoard[i][2]
					&& gameBoard[i][0] != EMPTY_BOX) {

				cross = gameBoard[i][0];

			}

		}

		for (int j = 0; j < 3; j++)

		{

			if (gameBoard[0][j] == gameBoard[1][j] && gameBoard[1][j] == gameBoard[2][j]
					&& gameBoard[0][j] != EMPTY_BOX) {

				cross = gameBoard[0][j];

			}

		}

		if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2] && gameBoard[0][0] != EMPTY_BOX) {

			cross = gameBoard[0][0];

		}

		if (gameBoard[2][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[0][2] && gameBoard[2][0] != EMPTY_BOX) {

			cross = gameBoard[2][0];

		}

		if (cross == PLAYER_ONES_SYMBOL) {

			whoWonTheGame = playerOne;

		}

		else if (cross == PLAYER_TWOS_SYMBOL) {

			whoWonTheGame = playerTwo;

		}

		return whoWonTheGame != null;

	}

	private String whoIsPlaying() {

		return currentPlayer;

	}

	private boolean validateInput(int row, int col) {

		boolean result = false;

		if (row < 0 || col < 0 || row > 2 || col > 2) {

			System.out.println("The position is the off the bounds" + "of the board try again");

		}

		else if (gameBoard[row][col] != EMPTY_BOX) {

			System.out.println("someone has already made a move" + "at this position try again!");

		}

		else {

			result = true;

		}

		return result;

	}

}