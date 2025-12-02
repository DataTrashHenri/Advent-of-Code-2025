package Day2;

import Input.INPUT;

public class Main {
    public static void main(String[] args) {
        SequenceDetectorTask2 sequenceDetectorTask2 = new SequenceDetectorTask2();
        sequenceDetectorTask2.computeRangeInput(INPUT.INPUT_DAY_2);
        System.out.println(sequenceDetectorTask2.getSum());
    }
}
