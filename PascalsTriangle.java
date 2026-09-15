import java.util.*;

class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int value = result.get(i - 1).get(j - 1)
                              + result.get(i - 1).get(j);

                    row.add(value);
                }
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int numRows = sc.nextInt();

        List<List<Integer>> result = generate(numRows);

        System.out.println("Pascal's Triangle:");

        for (List<Integer> row : result) {
            System.out.println(row);
        }
       }
    }
}