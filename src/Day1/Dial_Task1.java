package Day1;

public class Dial_Task1 {
    private int current_rotation;
    private int hits;
    public Dial_Task1(){
        current_rotation = 50;
        hits = 0;
    }
    public int getRotation(){
        return current_rotation;
    }
    public int getHits(){return hits;}
    public void rotate(int i) {
        if (i > 0) rotate_clockwise(i);
        else rotate_counter_clockwise(-i);
    }
    private void rotate_clockwise(int delta) {
        for (int i = 0; i < delta; i++) {
            if (current_rotation == 99) {
                current_rotation = 0;
            }else {
                current_rotation++;
            }
        }
        if (current_rotation == 0) hits++;
    }
    private void rotate_counter_clockwise(int delta) {
        for (int i = 0; i < delta; i++) {
            if (current_rotation == 0) {
                current_rotation = 99;
            }else {
                current_rotation--;
            }
        }
        if (current_rotation == 0) hits++;
    }

}
