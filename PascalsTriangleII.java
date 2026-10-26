
import java.util.*;

public class PascalsTriangleII {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }

            row.add(1);
        }

        return row;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row index: ");
        int rowIndex = sc.nextInt();

        System.out.println("Pascal's Triangle row: " + getRow(rowIndex));

        sc.close();
    }
}
