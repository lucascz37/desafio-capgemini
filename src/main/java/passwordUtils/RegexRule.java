package passwordUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRule implements Rule {

    private final String regex;

    public RegexRule(String regex) {
        this.regex = regex;
    }

    @Override
    public boolean evaluate(String password) {
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(password);
        return !m.find();
    }
}
