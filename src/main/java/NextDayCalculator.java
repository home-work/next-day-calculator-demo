public class NextDayCalculator {
    public static void main(String[] args) {

    }

    public static int[] nextDay(int[] date) {
        if (date[0] == 31) {
            date[0] = 1;
            date[1] = date[1] + 1;
        }else date[0] = date[0]+ 1;
        return date;
    }
}
