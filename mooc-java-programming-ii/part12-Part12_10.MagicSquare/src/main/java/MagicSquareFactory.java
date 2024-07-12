
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm
        // here
        int col = size / 2;
        int row = 0;
        for (int i = 0; i < size * size; i++) {
            square.placeValue(col, row, i + 1);
            // System.out.println(square);
            int oldcol = col;
            int oldrow = row + 1;
            col++;
            row--;

            if (row < 0) {
                row = size - 1;
            }
            if (col > size - 1) {
                col = 0;
            }

            if (square.readValue(col, row) != 0) {
                if (oldrow > size - 1) {
                    oldrow = 0;
                }
                row = oldrow;
                col = oldcol;
            }
        }
        return square;
    }

}
