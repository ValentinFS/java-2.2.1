public class BonusMilesService {

    public int calculate(int price) {

        int mile = 20;
        int milesAmount = price / mile;

        return milesAmount;
    }
}
