import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        float codigo, quantidade;

        System.out.println("**********[CARDAPIO]**********");
        System.out.println("[100] Cachorro Quente   R$1.20");
        System.out.println("[101] Bauru Simples     R$1.30");
        System.out.println("[102] Bauru com Ovo     R$1.50");
        System.out.println("[103] Hamburguer        R$1.20");
        System.out.println("[104] Cheeseburguer     R$1.70");
        System.out.println("[105] Suco              R$2.20");
        System.out.println("[106] Refrigerante      R$1.00");

        System.out.print("Digite o codigo do lanche desejado: ");
        codigo = leitura.nextFloat();
        while (codigo < 100 || codigo > 106) {
            System.out.println("Nao existe esse codigo, digite novamente: ");
            codigo = leitura.nextFloat();
        }

        System.out.print("Digite a quantidade: ");
            quantidade = leitura.nextFloat();

        if (codigo == 100) {
            System.out.printf("Cachorro Quente R$: %.2f", quantidade * 1.20);
        } else if (codigo == 101) {
            System.out.printf("Bauru Simples R$: %.2f", quantidade * 1.30);
        } else if (codigo == 102) {
            System.out.printf("Bauru com Ovo R$: %.2f", quantidade * 1.50);
        } else if (codigo == 103) {
            System.out.printf("Hamburguer R$: %.2f", quantidade * 1.20);
        } else if (codigo == 104) {
            System.out.printf("Cheeseburguer R$: %.2f", quantidade * 1.70);
        } else if (codigo == 105) {
            System.out.printf("Suco R$: %.2f", quantidade * 2.20);
        } else if (codigo == 106) {
            System.out.printf("Refrigerante R$: %.2f", quantidade * 1.00);
        }
    }
}
