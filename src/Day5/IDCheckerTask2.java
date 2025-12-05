package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IDCheckerTask2 {
        public IDCheckerTask2(String input) {
            String idRanges = (input.split("\n\n")[0]);
            List<Long> knownIds = new ArrayList<>();
            String[] idRangesList = idRanges.split("\n");
            for(String idRange : idRangesList){
                long start = Long.parseLong(idRange.split("-")[0]);
                long end = Long.parseLong(idRange.split("-")[1]);
                for (long i = start; i<=end;i++) {
                    if (!knownIds.contains(i)) {
                        knownIds.add(i);
                    }
                }
            }
            System.out.println(knownIds.size());
        }
}
