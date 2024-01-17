package io.codeforall.heapsdontlie;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(80,50);
        grid.init();
        Cursor position = new Cursor(0,0,grid);
    }
}
