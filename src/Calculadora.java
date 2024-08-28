import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double n1, n2, R;
        char OP;

        System.out.println("Escreva o primeiro número: ");
        n1 = scan.nextDouble();
        System.out.println("Escreva o segundo número: ");
        n2 = scan.nextDouble();
        System.out.println("Escreva a operação: +, -, *, /");
        OP = scan.next().charAt(0);

        switch(OP) {
            case '+':
                R = n1 + n2;
                break;
            case '-':
                R = n1 - n2;
                break;
            case '*':
                R = n1 * n2;
                break;
            case '/':
                R = n1 / n2;
                break;
            default:
                System.out.println("Pode não man >:( ");
                return;
        }
    System.out.println("Os números: "+n1+ " e " +n2+ " com a operação " +OP+ " o resultado é: " +R);
    }
}