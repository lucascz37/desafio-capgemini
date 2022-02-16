import java.util.Scanner;

public class LadderString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de n: ");
        try{
            int input = Integer.parseInt(scanner.nextLine());
            System.out.println(createLadder(input));
        }catch (NumberFormatException e){
            System.out.println("Input inválido");
        }
    }

    public static String createLadder(int n){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 1; i <= n; i++){
            stringBuilder.append(" ".repeat(n-i)).append("*".repeat(i)).append("\n");
        }

        return stringBuilder.toString();
    }
}
