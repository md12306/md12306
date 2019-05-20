package com.qianfeng.md.vo;

public class JSONTable {
    private Integer row;
    private Integer col;
    private Integer style;

    @Override
    public String toString() {
        return "JSONTable{" +
                "row=" + row +
                ", col=" + col +
                ", style=" + style +
                '}';
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }
}
