import java.util.ArrayList;
import java.util.List;

public class Input_Decoder {
    public String input;
    public Input_Decoder(String input){
        this.input = input;
    }
    public List<Integer> decode(){
        List <Integer> decoded = new ArrayList<>();
        for (String s : input.split("\n")){
            int decodedInt;
            decodedInt = Integer.parseInt(s.substring(1));
            if (s.getBytes()[0]=='L') decodedInt*=-1;
            decoded.add(decodedInt);
        }
        return decoded;
    }
}
