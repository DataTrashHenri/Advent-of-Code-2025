package Day4;

import java.util.ArrayList;
import java.util.List;

public class GridMasterTask2 {
    int width;
    int height;
    int canBeForked=0;
    char[] input;
    List<Integer> toBeCleared;
    public GridMasterTask2(String input) {
        width = input.split("\n")[0].split("").length;
        height =input.split("\n").length;
        this.input = input.toCharArray();
        toBeCleared = new ArrayList<>();
    }
    public int solve() {
        toBeCleared.clear();
        canBeForked=0;
        for (int i = 0; i<width; i++) {
            for (int j = 0; j<height; j++) {
                if (countNeighbours(i,j)<4) {
                    canBeForked++;
                    toBeCleared.add(i+ (width+1)*j);
                }
            }
        }
        for(int i = 0; i< toBeCleared.size(); i++){
            input[toBeCleared.get(i)] ='.';
        }
        return toBeCleared.size();
    }

    private int countNeighbours(int i, int j) {
        int neighbours=0;
        if (charAt(i,j)) {
            if (charAt(i-1,j+1)) {
                neighbours++;
            }
            if (charAt(i,j+1)) {
                neighbours++;
            }
            if (charAt(i+1,j+1)) {
                neighbours++;
            }
            if (charAt(i+1,j)) {
                neighbours++;
            }
            if (charAt(i+1,j-1)) {
                neighbours++;
            }
            if (charAt(i,j-1)) {
                neighbours++;
            }
            if (charAt(i-1,j-1)) {
                neighbours++;
            }
            if (charAt(i-1,j)) {
                neighbours++;
            }
            return neighbours;
        } else return 8;
    }
    private boolean charAt(int i, int j) {
        if(i<0 || j<0) return false;
        if(i>=width || j>=height) return false;
        return input[i+(width+1)*j] == '@';
    }
}
