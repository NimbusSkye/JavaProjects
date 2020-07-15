package Java;

public class SponsoredConcert extends Concert {
    String sponsor;
    int sponsortime;
    public SponsoredConcert (String title, String performer, int time, String s, int i) {
        super(title, performer, time);
        sponsor=s;
        sponsortime=i;
    }
    @Override
    public String description () {
        return String.format("%s by %s, sponsor is %s. Total running time is %d minutes.", getaTitle(), getaPerformer(), sponsor, runningTime());
    }
    @Override
    public int runningTime() {
        return sponsortime+getaRunningTime();
    }
    public static void main (String args[]) {
        SponsoredConcert a = new SponsoredConcert("h", "a", 100, "lol", 10);
        System.out.println(a.description());
    }
}
