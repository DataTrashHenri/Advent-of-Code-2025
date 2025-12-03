package Day3;

public class NumPickerTask1 {

    private int sum = 0;
    public int solve(String input) {
        for (String line : input.split("\n")) {
            sum+= getHighestConsumption(line);
        }
        return sum;
    }
    private int getHighestConsumption(String input) {
        int tenth_index = findMax(input.substring(0,input.length()-1));
        int ones_index = findMax(input.substring(tenth_index+1));
        return (input.charAt(tenth_index)-'0')*10 + (input.substring(tenth_index+1).charAt(ones_index)-'0');
    }
    private int findMax(String input) {
        int highest_index = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)>input.charAt(highest_index)) highest_index = i;
        }
        return (highest_index);
    }
}
