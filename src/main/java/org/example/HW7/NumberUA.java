package HW7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberUA {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("+380932223355");
        numbers.add("+380932223g355");
        numbers.add("+38093222334555");
        numbers.add("++380932223355");
        String regex = "\\+\\d{12}";
        Pattern pattern = Pattern.compile(regex);
        for (String number : numbers) {
            Matcher matcher = pattern.matcher(number);
            System.out.println(number + " : " + matcher.matches());
        }
    }
}
