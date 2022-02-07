package lesson2;

public class Main {
    static int size = 4;

    public static void main(String[] args){
        String [] [] arr = {
                {"10", "4", "7", "6"},
                {"24", "3", "1", "8"},
                {"2", "15", "7", "3"},
                {"9", "11", "3", "7"}
        };
        try {
            System.out.println(sum(arr));

        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getRow() + " " + e.getCol());
            System.out.println(arr[e.getRow()][e.getCol()]);
        }

        System.out.println("end");
    }
    static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != size) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != size) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("format " + i + " " + j, i, j);
                }
            }
        }
        return sum;
    }
}
