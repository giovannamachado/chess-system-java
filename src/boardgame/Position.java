package boardgame;

public class Position {

	
	private int row;
	private int colum;
	
	public Position(int row, int colum) {
		this.row = row;
		this.colum = colum;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColor() {
		return colum;
	}

	public void setColor(int color) {
		this.colum = color;
	}
	
	@Override
		public String toString() {
		return row + "," + colum;
	}
}
