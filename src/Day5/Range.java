package Day5;

public class Range {
    Long start;
    Long end;
    public Range(String start, String end) {
        this.start =Long.parseLong(start);
        this.end = Long.parseLong(end);
    }
    public Range(Long start, Long end) {
        this.start =start;
        this.end = end;
    }
    public boolean canBeMerged(Range other) {
        return other.start <= this.end + 1;
    }
    public Range merge(Range other) {
        return new Range(Math.min(this.start,other.start),Math.max(this.end,other.end));
    }
}
