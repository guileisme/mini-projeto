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
                this.escolha2 = escolha2;
                this.personagem = personagem;
                this.custoEnergia = custoEnergia;
                
            }

    public void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.texto + "\n");
        this.personagem.stamina -= custoEnergia;
        System.out.println("\n" + this.personagem.name + " perdeu " + this.custoEnergia + " de Stamina.");
        if (this.personagem.stamina <= 0){
            System.out.println("\n" + this.personagem.name + " morreu.");
        }
        if (this.escolha1 != null){
            System.out.print(this.escolha1);
        }
        if (this.escolha2 != null){
            System.out.print("\n" + this.escolha2 + "\n");
        }


    }

    public int escolher() {
        Scanner input = new Scanner(System.in);
        int escolha = input.nextInt();

        while (escolha != 1 || escolha != 2) {
            System.out.println("\nDigite uma escolha válida.");
            return escolha = input.nextInt();
            
        } 

        if (escolha == 1) {
            escolha = 1;
        }

        else if (escolha == 2) {
            escolha = 2;
        }
        
        return escolha;
    }

}

