package tetris;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Figure {

    static final int [][]FIGURE_I = {
            {0,1,0,0},
            {0,1,0,0},
            {0,1,0,0},
            {0,1,0,0},
    };

    static final int [][]FIGURE_L = {
            {0,1,0,0},
            {0,1,0,0},
            {0,1,1,0},
            {0,0,0,0},
    };

    static final int [][]FIGURE_Z = {
            {0,0,0,0},
            {0,1,1,0},
            {0,0,1,1},
            {0,0,0,0},
    };

    static final int [][]FIGURE_T = {
            {0,0,0,0},
            {0,1,1,1},
            {0,0,1,0},
            {0,0,0,0},
    };

    static final int[][] FIGURE_0 = {
            {0,0,0,0},
            {0,1,1,0},
            {0,1,1,0},
            {0,0,0,0},
    };

    static int[][] rotate(int [][]data){
        // rotate 90 degrees counter-clockwise
        int[][]newdata = new int [4][4];
        //homework
        return newdata;
    }

    static int[][] flip(int [][]data){
        // flip by vertical axis
        int[][]newdata = new int [4][4];
        //homework
        return newdata;
    }

    static List<int[][]> figureData = new ArrayList<>(19);

    static {
        figureData.add(FIGURE_L);
        figureData.add(FIGURE_L);
        figureData.add(FIGURE_L);
        figureData.add(FIGURE_L);
        figureData.add(FIGURE_L);
        figureData.add(FIGURE_L);
        figureData.add(FIGURE_L);
        figureData.add(FIGURE_L);

        figureData.add(FIGURE_Z);
        figureData.add(FIGURE_Z);
        figureData.add(FIGURE_Z);
        figureData.add(FIGURE_Z);

        figureData.add(FIGURE_T);
        figureData.add(FIGURE_T);
        figureData.add(FIGURE_T);
        figureData.add(FIGURE_T);

        figureData.add(FIGURE_I);
        figureData.add(FIGURE_I);

        figureData.add(FIGURE_0);
    }

    static Random random = new Random();

    public int[][] data = new int[4][4];

    private Figure(){
    }

    public static Figure randomFigure() {
        Figure figure = new Figure();
        int[][] data = figureData.get(random.nextInt(figureData.size()));
        figure.data = data;
        return figure;
    }
}
