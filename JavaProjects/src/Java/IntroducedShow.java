package Java;

import java.util.Objects;

public class IntroducedShow implements Show {
    Show s;
    int length;
    String speaker;
    IntroducedShow (Show s, int length, String speaker) {
        this.s=s;
        this.length=length;
        this.speaker=speaker;
    }
    public String description () {
        return "[ "+speaker+" introduces "+s.description();
    }
    public int runningTime () {
        return s.runningTime()+length;
    }
    public Show copy () {
        return new IntroducedShow(s.copy(), length, speaker);
    }
    @Override
    public int hashCode () {
        return Objects.hash(s, length, speaker);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntroducedShow that = (IntroducedShow) o;
        return length == that.length &&
                s.equals(that.s) &&
                speaker.equals(that.speaker);
    }
}
