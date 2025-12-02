package Day2;

public class SequenceDetectorTask2 {
    private long sum;
    public SequenceDetectorTask2(){
        sum=0;
    }
    public void addWrongIDs(long start, long end){
        for (long i = start; i <= end; i++) {
            String currentID = Long.toString(i);
            if (followsPattern(currentID)) sum+=i;
        }
    }
    private boolean followsPattern(String number) {
        int numLength = number.length();
        for (int i = 1; i < numLength; i++) {
            if(numLength % i != 0)continue; // e.g. 12345 cant have pattern with length 3, 5%3!=0
            String patternTemplate = number.substring(0, i);
            patternTemplate = patternTemplate.repeat(numLength/i);
            if (patternTemplate.equals(number)) return true;
        }
        return false;
    }
    public void computeRangeInput(String input){
        for (String range : input.split(",")) {
            addWrongIDs(Long.parseLong(range.split("-")[0]),Long.parseLong(range.split("-")[1]));
        }
    }
    public long getSum(){return sum;}
}
