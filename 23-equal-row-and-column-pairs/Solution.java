import java.util.HashMap;
import java.util.Map;

class Solution {
    public int equalPairs(int[][] grid) {

        int result = 0;

        Map<String, Integer> rowsFrequency = new HashMap<>();
        Map<String, Integer> columnsFrequency = new HashMap<>();

        StringBuilder columns = new StringBuilder();
        StringBuilder rows = new StringBuilder();
        for (int i = 0; i < grid.length; i++) {
            columns.delete(0, columns.length());
            rows.delete(0, rows.length());
            for (int j = 0; j < grid.length; j++) {
                rows.append(grid[i][j] + ",");
                columns.append(grid[j][i] + ",");
            }
            rowsFrequency.put(rows.toString(), rowsFrequency.getOrDefault(rows.toString(), 0) + 1);
            columnsFrequency.put(columns.toString(), columnsFrequency.getOrDefault(columns.toString(), 0) + 1);
        }

        for (String rowString : rowsFrequency.keySet()) {
            if (columnsFrequency.containsKey(rowString)) {
                int rowsCount = rowsFrequency.get(rowString);
                int columsCount = columnsFrequency.get(rowString);

                if (rowsCount == 1 || columsCount == 1) {
                    result += Math.max(1, Math.max(columsCount, rowsCount));
                } else {
                    result += (rowsCount * columsCount);
                }
            }
        }
        return result;
    }
}