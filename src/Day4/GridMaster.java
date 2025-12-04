package Day4;

public class GridMaster {
    int width;
    int height;
    int canBeForked=0;
    public GridMaster(String input) {
        width = input.split("\n")[0].split("").length;
        height =input.split("\n").length;
        solve(input);
    }
    private void solve(String input) {
        for (int i = 0; i<width; i++) {
            for (int j = 0; j<height; j++) {
                if (countNeighbours(input,i,j)<4) {
                    canBeForked++;

                }
            }
        }
        System.out.println(canBeForked);
    }

    private int countNeighbours(String input, int i, int j) {
        int neighbours=0;
        if (charAt(input,i,j)) {
            if (charAt(input,i-1,j+1)) {
                neighbours++;
            }
            if (charAt(input,i,j+1)) {
                neighbours++;
            }
            if (charAt(input,i+1,j+1)) {
                neighbours++;
            }
            if (charAt(input,i+1,j)) {
                neighbours++;
            }
            if (charAt(input,i+1,j-1)) {
                neighbours++;
            }
            if (charAt(input,i,j-1)) {
                neighbours++;
            }
            if (charAt(input,i-1,j-1)) {
                neighbours++;
            }
            if (charAt(input,i-1,j)) {
                neighbours++;
            }
            return neighbours;
        } else return 8;
    }
    private boolean charAt(String input,int i, int j) {
        if(i<0 || j<0) return false;
        if(i>=width || j>=height) return false;
        return input.split("\n")[j].split("")[i].equals("@");
    }
}
