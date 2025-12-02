package Day1;

import Input.INPUT;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Input_Decoder inputDecoder = new Input_Decoder(INPUT.INPUT_DAY_1);
        Dial_Task2 dial = new Dial_Task2();
        for(Integer i :inputDecoder.decode()) dial.rotate(i);
        System.out.println(dial.getHits());

    }
}
