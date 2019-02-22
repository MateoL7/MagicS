package model;

/**
 * @author: Mateo Loaiza
 * @version: 2/19/2019 Class MagicS
 */
public class MagicS {
//Constants
	public final static String NO = "NO";
	public final static String NE = "NE";
	public final static String SO = "SO";
	public final static String SE = "SE";
	public final static String TOP = "Top";
	public final static String RIGHT = "Right";
	public final static String DOWN = "Down";
	public final static String LEFT = "Left";

//Attributes
	private int[][] square;

	// Methods
	// Builder
	/**
	 * This is the constructor, is in charge of instantiate what the object must
	 * have
	 * 
	 * @param pMode int with the dimensions, != null, != 0, != 1, must be odd number
	 */
	public MagicS(int pMode) {
		square = new int[pMode][pMode];
	}

	/**
	 * Method that calls the corresponding attribute
	 * 
	 * @return int[][]
	 */
	public int[][] getSquare() {
		return square;
	}

	/**
	 * This method allows the square to be created by using the values in the
	 * parameter, this values will the define the square itself. Here the matrix is
	 * beign filled according to the position and the orientation, it has a
	 * different condition for each case
	 * 
	 * @param pMode        int with the dimensions, != null, != 0, != 1, must be odd
	 *                     number
	 * @param pLocation    String with the location of the first number, must use
	 *                     the constants
	 * @param pOrientation String with the orientation in which the square will be
	 *                     filled, must use the constants
	 */

	public void fillSquare(int pMode, String pLocation, String pOrientation) {
		int num = 1;
		int row = 0;
		int col = 0;
		int pRow = row;
		int pCol = col;
		if (pLocation.equalsIgnoreCase(TOP)) {
			col = square[0].length / 2;
			if (pOrientation.equalsIgnoreCase(NO)) {
				while (num <= pMode * pMode) {
					if (square[row][col] == 0) {
						square[row][col] = num;
						num++;
					} else {
						if (square[pRow + 1][pCol] == 0) {
							row = pRow + 1;
							col = pCol;
							if (row < 0) {
								row = pMode - 1;
							}
							if (pMode - 1 < row) {
								row = 0;
							}
							square[row][col] = num;
							num++;
						}
					}
					pRow = row;
					pCol = col;
					row--;
					col++;
					if (row < 0) {
						row = pMode - 1;
					}
					if (pMode - 1 < row) {
						row = 0;
					}
					if (col < 0) {
						col = pMode - 1;
					}
					if (pMode - 1 < col) {
						col = 0;
					}
				}
			} else if (pOrientation.equalsIgnoreCase(NE)) {
				while (num <= pMode * pMode) {
					if (square[row][col] == 0) {
						square[row][col] = num;
						num++;
					} else {
						if (square[pRow + 1][pCol] == 0) {
							row = pRow + 1;
							col = pCol;
							if (row < 0) {
								row = pMode - 1;
							}
							if (pMode - 1 < row) {
								row = 0;
							}
							square[row][col] = num;
							num++;
						}
					}
					pRow = row;
					pCol = col;
					row--;
					col--;
					if (row < 0) {
						row = pMode - 1;
					}
					if (pMode - 1 < row) {
						row = 0;
					}
					if (col < 0) {
						col = pMode - 1;
					}
					if (pMode - 1 < col) {
						col = 0;
					}
				}
			}
		}
		if (pLocation.equalsIgnoreCase(DOWN)) {
			col = square[0].length / 2;
			row = pMode - 1;
			if (pOrientation.equalsIgnoreCase(SO)) {
				while (num <= pMode * pMode) {
					if (square[row][col] == 0) {
						square[row][col] = num;
						num++;
					} else {
						if (square[pRow + 1][pCol] == 0) {
							row = pRow + 1;
							col = pCol;
							if (row < 0) {
								row = pMode - 1;
							}
							if (pMode - 1 < row) {
								row = 0;
							}
							square[row][col] = num;
							num++;
						}
					}
					pRow = row;
					pCol = col;
					row++;
					col++;
					if (row < 0) {
						row = pMode - 1;
					}
					if (pMode - 1 < row) {
						row = 0;
					}
					if (col < 0) {
						col = pMode - 1;
					}
					if (pMode - 1 < col) {
						col = 0;
					}
				}
			} else if (pOrientation.equalsIgnoreCase(SE)) {
				while (num <= pMode * pMode) {
					if (square[row][col] == 0) {
						square[row][col] = num;
						num++;
					} else {
						if (square[pRow + 1][pCol] == 0) {
							row = pRow + 1;
							col = pCol;
							if (row < 0) {
								row = pMode - 1;
							}
							if (pMode - 1 < row) {
								row = 0;
							}
							square[row][col] = num;
							num++;
						}
					}
					pRow = row;
					pCol = col;
					row++;
					col--;
					if (row < 0) {
						row = pMode - 1;
					}
					if (pMode - 1 < row) {
						row = 0;
					}
					if (col < 0) {
						col = pMode - 1;
					}
					if (pMode - 1 < col) {
						col = 0;
					}
				}
			}
		}
	}

	/**
	 * This method calculates the magic constant for the square
	 * 
	 * @param pMode int with the dimensions of the square, must be an odd number !=1
	 * @return
	 */
	public int magicConstant(int pMode) {
		int mc = (pMode * ((pMode * pMode) + 1)) / 2;
		return mc;
	}
}
