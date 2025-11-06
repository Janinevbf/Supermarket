import implementation.Supermarket;

import java.util.Scanner;

public class Main {
    private static final int SIZE =3 ;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Supermarket supermarket = new SupermarketArray(SIZE);
        int opcao;
        do{
            System.out.println("\n Lista de Compras");
            System.out.println("1.Inserir");
            System.out.println("2.Listar");
            System.out.println("3.Excluir");
            System.out.println("4.Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Digite o item a ser iserido: ");
                    String item = sc.next();
                    supermarket.add(item);
                    break;

                case 2:
                    supermarket.print();
                    break;
                    case 3:
                        System.out.print("Digite a posiçao do item removido: ");
                        int index = sc.nextInt();
                        supermarket.delete(index);
                        break;
                case 4:
                    System.out.println("Saindo do programa");
                    break;
                    default:
                        System.out.println("Opção invalida. Por favor, escolha outro");
            }

        }while (opcao != 4); // se nao digitar o 4, fica em loop

        sc.close();
    }

}
