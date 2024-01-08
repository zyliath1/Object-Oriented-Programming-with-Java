public class PrintDiamond {
    public void print() {
        int rows = 7; // Kuvion korkeus
        int midRow = rows / 2; // Kuvion keskirivi

        // Kuvion yläosa (rivit 1-4) ja alaosa (rivit 5-7) ovat peilikuvia toisistaan.
        for (int i = 0; i < rows; i++) {
            int stars = i <= midRow ? 2 * i + 1 : 2 * (rows - i - 1) + 1;
            int spaces = (rows - stars) / 2;
            System.out.println(" ".repeat(spaces) + "*".repeat(stars));
        }
    }
}
