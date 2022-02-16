import passwordUtils.RuleEngine;

import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a senha: ");
        String input = scanner.nextLine();
        System.out.println(numberOfMissingCharacters(input));
    }

    public static int numberOfMissingCharacters(String password){
        int minSize = 6;
        int missingCharacters = new RuleEngine().process(password);

        if(missingCharacters + password.length() >= minSize){
            return missingCharacters;
        }

        //quantidade de caracters obrigatórios mais a quantidade para completar o tamanho mínimo
        return missingCharacters + (minSize - missingCharacters - password.length());
    }
}
