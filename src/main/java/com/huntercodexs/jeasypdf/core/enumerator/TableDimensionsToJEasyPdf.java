package com.huntercodexs.jeasypdf.core.enumerator;

public enum TableDimensionsToJEasyPdf {
    TABLE_5X6(5, 6),
    TABLE_5X5(5, 5),
    TABLE_5X4(5, 4),
    TABLE_5X3(5, 3),
    TABLE_5X2(5, 2),

    TABLE_4X6(4, 6),
    TABLE_4X5(4, 5),
    TABLE_4X4(4, 4),
    TABLE_4X3(4, 3),
    TABLE_4X2(4, 2),

    TABLE_3X6(3, 6),
    TABLE_3X5(3, 5),
    TABLE_3X4(3, 4),
    TABLE_3X3(3, 3),
    TABLE_3X2(3, 2),

    TABLE_2X6(2, 6),
    TABLE_2X5(2, 5),
    TABLE_2X4(2, 4),
    TABLE_2X3(2, 3),
    TABLE_2X2(2, 2);

    private final int tableLines;
    private final int tableColumns;

    TableDimensionsToJEasyPdf(int tableLines, int tableColumns) {
        this.tableLines = tableLines;
        this.tableColumns = tableColumns;
    }

    public int getTableLines() {
        return tableLines;
    }

    public int getTableColumns() {
        return tableColumns;
    }

    public static int[] tableSize(TableDimensionsToJEasyPdf template) {
        return new int[]{template.getTableLines(), template.getTableColumns()};
    }
}
