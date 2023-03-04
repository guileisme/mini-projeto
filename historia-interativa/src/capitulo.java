import java.util.Scanner;

public class capitulo {
    String nome;
    String texto;
    String escolha1;
    String escolha2;
    character personagem;
    int custoEnergia;

    capitulo(String nome, 
            String texto, 
            String escolha1, 
            String escolha2, 
            character personagem,
            int custoEnergia ){
                this.nome = nome;
                this.texto = texto;
                this.escolha1 = escolha1;
                this.escolha1 = escolha2;
                this.personagem = personagem;
                this.custoEnergia = custoEnergia;
                
            }

    public void mostrar() {
        System.out.println(this.nome);
        System.out.print(escolha1);
        System.out.print(escolha2);
        this.personagem.stamina -= custoEnergia;
        System.out.println(this.personagem.name + " perdeu " + this.custoEnergia + "de Stamina.");

    }

    public int escolher() {
        Scanner input = new Scanner(System.in);
        int escolha = input.nextInt();

        while (escolha != 1 || escolha != 2) {
            System.out.println("Digite uma escolha válida.");
            return escolha = input.nextInt();
            
        } 

        if (escolha == 1) {
            return escolha = 1;
        }

        else if (escolha == 2) {
            return escolha = 2;
        }

        return escolha;
    }

}

