package Day2;

public class SequenceDetectorTask1 {
    private long sum;
    public SequenceDetectorTask1(){
        sum=0;
    }
    public void addWrongIDs(long start, long end){
        for (long i = start; i <= end; i++) {
            String currentID = Long.toString(i);
            if (currentID.length()%2==0) {
                if (currentID.substring(0,currentID.length()/2).equals(currentID.substring(currentID.length()/2))) sum+=i;
            }
        }
    }
    public void computeRangeInput(String input){
        for (String range : input.split(",")) {
            addWrongIDs(Long.parseLong(range.split("-")[0]),Long.parseLong(range.split("-")[1]));
        }
    }
    public long getSum(){return sum;}
}
