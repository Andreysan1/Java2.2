package lesson2;

public class MyArrayDataException extends RuntimeException {
    private int row;
    private int col;

    int getRow() {return row;}

    int getCol() {return col;}

    public MyArrayDataException(String message, int row, int col) {
        super(message);
        this.row = row;
        this.col = col;
    }
}
