public class BonusMilesService {
    public int calculate (int price) {
        int conversation = 20;
        int bonus = price / conversation;
        return bonus;
    }
}
