package Day3;

public class NumPickerTask2 {
    private long sum;
    private long num;
    public long solve(String input) {
        for (String line : input.split("\n")) {
            num = ~0+1; // :)
            getHighestConsumption(line,0,12);
            sum+=num;
        }
        return sum;
    }

    private void getHighestConsumption(String input, int start, int remaining_digits) {
        if (remaining_digits == 0) return;
        int max_index = findMax(input.substring(start,input.length()-remaining_digits+1))+start;
        num = num * 10 + input.charAt(max_index) - '0';
        getHighestConsumption(input,max_index + 1,--remaining_digits);
    } // who can beat 4 lines? (could have inlined max_index so basically did it in 3 lines)

    private int findMax(String input) {
        int highest_index = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)>input.charAt(highest_index)) highest_index = i;
        }
        return highest_index;
    }
}
