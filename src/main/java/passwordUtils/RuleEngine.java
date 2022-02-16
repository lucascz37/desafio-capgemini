package passwordUtils;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {

    private final List<Rule> rules = new ArrayList<>();

    public RuleEngine(){
        rules.add(new RegexRule("[!@#$%^&*()-+]+"));
        rules.add(new RegexRule("[0-9]+"));
        rules.add(new RegexRule("[a-z]+"));
        rules.add(new RegexRule("[A-Z]+"));
    }

    public int process(String password){
        return (int) rules.stream().filter((r) -> r.evaluate(password)).count();
    }
}
