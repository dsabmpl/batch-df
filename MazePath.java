public class MazePath {

    static void printMazePath(int startRow, int startCol,
            int endRow, int endCol, String paths) {
        if (startRow == endRow && startCol == endCol) {
            System.out.println(paths);
            return;
        }
        if (startCol > endCol || startRow > endRow) {
            return;
        }
        printMazePath(startRow, startCol + 1, endRow,
         endCol, paths + "R");
        printMazePath(startRow + 1, startCol, endRow, 
        endCol, paths + "D");
    }

    public static void main(String[] args) {
        printMazePath(0, 0, 2, 2, "");
    }
}
