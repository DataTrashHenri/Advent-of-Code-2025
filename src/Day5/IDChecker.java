package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IDChecker {
    public long sum = 0;
    private int firstID;
    public IDChecker(String input) {
        List<String> IDRanges = Arrays.stream(input.split("\n")).filter(line -> line.split("-").length!=1).toList();
        List<Long> IDs = Arrays.stream(input.split("\n")).filter(line -> line.split("-").length==1 && !line.isEmpty()).map(s-> Long.parseLong(s)).toList();
        for (Long id : IDs) {
            resolve(IDRanges,id);
            //System.out.println(id);
        }
        System.out.println("sum: " + sum);
    }
    private void resolve(List<String> Ranges, Long id) {
        for (String range : Ranges) {
            if (rangeContainsID(range, id)) {
                sum++;
                //System.out.println(id);
                return;
            }
        }
    }
    private boolean rangeContainsID(String range, Long id) {
        long start = Long.parseLong(range.split("-")[0]);
        long end = Long.parseLong(range.split("-")[1]);
        return  id>=start && id<=end;

    }
}
