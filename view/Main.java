package view;
import java.util.Scanner;
import model.Pet;

public class Main {

    public static void main(String[] args) {
        Pet pet = new Pet();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma opção: ");
        System.out.println("1 - Cadastrar Pet ");
        System.out.println("2 - Listar pets ");
        System.out.println("3 - Sair ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("--- CADASTRO DO PET --- ");
                System.out.println("Digite o nome do seu pet: ");
                pet.setNome (scanner.nextLine());
                System.out.println("Digite a idade do seu pet: ");
                pet.setIdade(scanner.nextInt());
                System.out.println("Digite a especie do seu pet: ");
                pet.setEspecie(scanner.nextLine());
                System.out.println("Digite a raça do seu pet: ");
                pet.setRaca(scanner.nextLine());

                petDAO.salvar(pet);

                break;

            case 2:
                System.out.println("--- LISTA DE PETS ---");

                break;

            case 3:
                System.out.println("Você saiu da página. ");

                break;
            // Você pode adicionar quantos cases precisar...
            default:
                System.out.println("Digite uma opção valida!");
                break;
        }
    }
}
