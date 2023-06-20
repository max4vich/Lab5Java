import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumberFromText {
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
        String text = "When be 44 draw drew ye. Defective in do recomm55end suffering." +
                "\nHouse it se-2ven 4 in spoil tiled court." +
                "\nSister oth+3ers marked 3 fat missed did out use." +
                "\nAlte4ration possession dispatched collecting instrument travelling he or on." +
                "\nSnug give made at spot or late that mr.";
        SumOfNumberFromText sumOfNumberFromTextin = new SumOfNumberFromText();
        System.out.println(sumOfNumberFromTextin.positiveIntSum(text));
    }
}
