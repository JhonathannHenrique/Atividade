import java.util.Scanner; 
import java.util.ArrayList;

public class PetShop {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Categoria> categorias = new ArrayList<>();
        ArrayList<Tutor> tutores = new ArrayList<>();
        ArrayList<Animal> animais = new ArrayList<>();

        int opcao = 0;

        do{
            System.out.println("Menu De Sistema de Notas:");
            System.out.println("[1] - Cadastrar Categoria.");
            System.out.println("[2] - Cadastrar Tutor.");
            System.out.println("[3] - Cadastrar Animal.");
            System.out.println("[4] - Listar Categoria.");
            System.out.println("[5] - Listar Tutor.");
            System.out.println("[6] - Listar Animal.");
            System.out.println("[7] - Encerrar Programa.");
            System.out.print("Digite a opção desejada: "); // Menu de opções
            opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Categoria.");
                    System.out.println("Digite o ID da categoria:");
                    int idCategoria = scanner.nextInt();
                    System.out.println("Digite a descrição da categoria.");
                    String descricao = scanner.next();
                    Categoria categoria = new Categoria(idCategoria,descricao);
                    categorias.add(categoria);
                    break;

                case 2:
                    System.out.println("Cadastrar Tutor.");
                    System.out.println("Digite o ID do Tutor:");
                    int idTutor = scanner.nextInt();
                    System.out.println("Digite o nome do Tutor.");
                    String nomeTutor = scanner.next();
                    System.out.println("Digite o telefone do Tutor.");
                    String telefone = scanner.next();
                    System.out.println("Digite o E-mail do Tutor.");
                    String email = scanner.next();
                    Tutor Tutor = new Tutor(idTutor, nomeTutor, telefone, email);
                    tutores.add(Tutor);
                    break;

                case 3:
                    System.out.println("Cadastrar Animal.");
                    System.out.println("Digite o ID do animal:");
                    int idAnimal = scanner.nextInt();
                    System.out.println("Digite o nome do animal.");
                    String nomeAnimal = scanner.next();
                    System.out.println("Digite o peso do animal.");
                    int peso = scanner.nextInt();
                    System.out.println("Digite a Raça do animal.");
                    String racaAnimal = scanner.next();
                    System.out.println("Digite a categoria do animal.");
                    int idCategoriaAnimal = scanner.nextInt();
                    System.out.println("Digite o Id do Tutor.");
                    int idTutorAnimal = scanner.nextInt();
                    Animal Animal = new Animal(idAnimal, nomeAnimal, racaAnimal, peso, idCategoriaAnimal, idTutorAnimal);
                    animais.add(Animal);
                    break;

                case 4:
                    System.out.println("\nListar Categorias:");
                    System.out.println("Categorias Cadastradas:");
                    int valorCategoria = 0;
                        for (Categoria categoriaPrint : categorias) {
                            System.out.println("ID: " + categoriaPrint.id + " Descrição: " + categoriaPrint.descricao);
                            if (categoriaPrint.id == categoriaPrint.id) {
                                valorCategoria++;
                            }
                        }
                        System.out.println("\nQuantidade de Animais por Categoria: " + valorCategoria);
                    break;

                case 5:
                    System.out.println("Listar Tutor.");
                    System.out.println("Tutores Cadastradas:");
                    int valorTutor = 0;
                        for (Tutor tutorPrint : tutores) {
                            System.out.println("ID: " + tutorPrint.idTutor + " Nome: " + tutorPrint.nomeTutor + " Telefone: " + tutorPrint.telefone + " E-mail: " +tutorPrint.email);
                            if (tutorPrint.idTutor == tutorPrint.idTutor) {
                                valorTutor++;
                            }
                        }
                        System.out.println("\nQuantidade de Tutores por Categoria: " + valorTutor);
                    break;

                case 6:
                    System.out.println("Listar Animal.");
                    System.out.println("Animais Cadastrados:");
                    int valorAnimal = 0;
                        for (Animal animalPrint : animais) {
                            System.out.println("ID: " + animalPrint.idAnimal + " Nome: " + animalPrint.nomeAnimal + " Raça: " + animalPrint.racaAnimal + " Peso: " + animalPrint.peso +"ID categoria: " + animalPrint.idCategoriaAnimal + "ID tutor: " + animalPrint.idTutorAnimal);
                            if (animalPrint.idAnimal == animalPrint.idAnimal) {
                                valorAnimal++;
                            }
                        }
                        System.out.println("\nQuantidade de Animais por Categoria: " + valorAnimal);
                    break;

                case 7:
                    System.out.println("Encerrando o Programa.");
                    break;

                default:
                System.out.println("Opção Invalida.");
                    break;
            }
            
        }while(opcao !=7);

        scanner.close();
    }
}