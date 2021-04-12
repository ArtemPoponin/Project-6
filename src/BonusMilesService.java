public class BonusMilesService {
    public long calculate(long price) {
        long miles = price / 20;
        return miles;
    }
}
