import java.util.Scanner;

public class ClassificadorHeroi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do herói: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade de XP do herói: ");
        int xp = scanner.nextInt();

        String nivel;

        int faixa;
        if (xp < 1000) {
            faixa = 0;
        } else if (xp <= 2000) {
            faixa = 1;
        } else if (xp <= 5000) {
            faixa = 2;
        } else if (xp <= 7000) {
            faixa = 3;
        } else if (xp <= 8000) {
            faixa = 4;
        } else if (xp <= 9000) {
            faixa = 5;
        } else if (xp <= 10000) {
            faixa = 6;
        } else {
            faixa = 7;
        }

        switch (faixa) {
            case 0:
                nivel = "Ferro";
                break;
            case 1:
                nivel = "Bronze";
                break;
            case 2:
                nivel = "Prata";
                break;
            case 3:
                nivel = "Ouro";
                break;
            case 4:
                nivel = "Platina";
                break;
            case 5:
                nivel = "Ascendente";
                break;
            case 6:
                nivel = "Imortal";
                break;
            case 7:
                nivel = "Radiante";
                break;
            default:
                nivel = "Desconhecido";
        }

        System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);

        scanner.close();

    }
}
