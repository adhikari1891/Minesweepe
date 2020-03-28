package Minsweeper;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Minsweeper.minController.amousePressed;

import java.awt.Dimension;

public class minView extends JFrame {

	private Object statusbar;

	void initUI() {

		
		add((Component) statusbar, BorderLayout.SOUTH);

		add(new Board());

		setResizable(false);
		pack();

		setTitle("Minesweeper");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public class MinesAdapter extends MouseAdapter {

		private Object statusbar;
		private final int NUM_IMAGES = 13;
		private final int CELL_SIZE = 15;

		private final int COVER_FOR_CELL = 10;
		private final int MARK_FOR_CELL = 10;
		private final int EMPTY_CELL = 0;
		private final int MINE_CELL = 9;
		private final int COVERED_MINE_CELL = MINE_CELL + COVER_FOR_CELL;
		private final int MARKED_MINE_CELL = COVERED_MINE_CELL + MARK_FOR_CELL;

		private final int DRAW_MINE = 9;
		private final int DRAW_COVER = 10;
		private final int DRAW_MARK = 11;
		private final int DRAW_WRONG_MARK = 12;

		private final int N_MINES = 40;
		private final int N_ROWS = 16;
		private final int N_COLS = 16;

		private final int BOARD_WIDTH = N_COLS * CELL_SIZE + 1;
		private final int BOARD_HEIGHT = N_ROWS * CELL_SIZE + 1;

		private int[] field;
		private boolean inGame;
		private int minesLeft;
		private Image[] img;

		private int allCells;

		@Override
		public void mousePressed(MouseEvent e) {

			int x = e.getX();
			int y = e.getY();

			int cCol = x / CELL_SIZE;
			int cRow = y / CELL_SIZE;

			boolean doRepaint = false;


			if ((x < N_COLS * CELL_SIZE) && (y < N_ROWS * CELL_SIZE)) {

				if (e.getButton() == MouseEvent.BUTTON3) {

					if (field[(cRow * N_COLS) + cCol] > MINE_CELL) {

						doRepaint = true;

						if (field[(cRow * N_COLS) + cCol] <= COVERED_MINE_CELL) {

							if (minesLeft > 0) {
								field[(cRow * N_COLS) + cCol] += MARK_FOR_CELL;
								minesLeft--;
								String msg = Integer.toString(minesLeft);
								statusbar.setText(msg);
							} else {
								statusbar.setText("No marks left");
							}
						} else {

							field[(cRow * N_COLS) + cCol] -= MARK_FOR_CELL;
							minesLeft++;
							String msg = Integer.toString(minesLeft);
							statusbar.setText(msg);
						}
					}

				} else {

					if (field[(cRow * N_COLS) + cCol] > COVERED_MINE_CELL) {

						return;
					}

					if ((field[(cRow * N_COLS) + cCol] > MINE_CELL)
							&& (field[(cRow * N_COLS) + cCol] < MARKED_MINE_CELL)) {

						field[(cRow * N_COLS) + cCol] -= COVER_FOR_CELL;
						doRepaint = true;

						if (field[(cRow * N_COLS) + cCol] == MINE_CELL) {
							inGame = false;
						}

						if (field[(cRow * N_COLS) + cCol] == EMPTY_CELL) {
							find_empty_cells((cRow * N_COLS) + cCol);
						}
					}}}
				}

		
public void paintComponent(Graphics g) {

	int uncover = 0;

	for (int i = 0; i < N_ROWS; i++) {

		for (int j = 0; j < N_COLS; j++) {

			int cell = field[(i * N_COLS) + j];

			if (inGame && cell == MINE_CELL) {

				inGame = false;
			}

			if (!inGame) {

				if (cell == COVERED_MINE_CELL) {
					cell = DRAW_MINE;
				} else if (cell == MARKED_MINE_CELL) {
					cell = DRAW_MARK;
				} else if (cell > COVERED_MINE_CELL) {
					cell = DRAW_WRONG_MARK;
				} else if (cell > MINE_CELL) {
					cell = DRAW_COVER;
				}

			} else {

				if (cell > COVERED_MINE_CELL) {
					cell = DRAW_MARK;
				} else if (cell > MINE_CELL) {
					cell = DRAW_COVER;
					uncover++;
				}
			}

			
		}
	}

	if (uncover == 0 && inGame) {

		inGame = false;
		statusbar.setText("Game won");

	} else if (!inGame) {
		statusbar.setText("Game lost");
	}
}



}
	public void mousePressed(amousePressed amousePressed) {
		// TODO Auto-generated method stub
		
	}}
