package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IDCheckerTask2 {
        public IDCheckerTask2(String input) {
            List<Range>ranges = mapToRangesSorted(input);

            for (int i = 0; i < ranges.size()-1; i++)
                if (ranges.get(i).canBeMerged(ranges.get(i + 1))) mergeRanges(ranges, i--);

            long sum = ranges.stream().mapToLong(range -> range.end - range.start + 1).sum();
            System.out.println(sum);
        }
        private List<Range> mapToRangesSorted(String input) {
            return new ArrayList<>(Arrays.stream(input
                    .split("\n\n")[0]
                    .split("\n"))
                    .map(s -> new Range(s.split("-")[0], s.split("-")[1]))
                    .sorted(Comparator.comparing(range -> range.start))
                    .toList());
        }
        private void mergeRanges(List<Range> ranges,int i) {
            ranges.set(i,ranges.get(i).merge(ranges.get(i+1)));
            ranges.remove(i+1);
        }
}
