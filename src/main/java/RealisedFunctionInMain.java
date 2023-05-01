import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RealisedFunctionInMain {
    public int positiveIntSum(final String input) {
        int sum = 0;
        Pattern pattern = Pattern.compile("(?<!-)(?<!\\d)\\d+");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        return sum;
    }
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        RealisedFunctionInMain main = new RealisedFunctionInMain();
        System.out.println(main.positiveIntSum(input));
    }
}
