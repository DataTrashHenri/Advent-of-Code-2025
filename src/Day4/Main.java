package Day4;

import Input.INPUT;

public class Main {
    public static void main(String[] args) {
        GridMasterTask2 gridMaster = new GridMasterTask2(INPUT.INPUT_DAY_4);
        int sum = 0;
        while (gridMaster.solve()!=0) sum+= gridMaster.canBeForked;
        System.out.println(sum);
    }
}
