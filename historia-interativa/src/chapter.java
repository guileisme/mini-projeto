import java.util.Scanner;

public class chapter {
    Scanner input = new Scanner(System.in);
    String nome;
    String texto;
    character personagem;
    int custoEnergia;
    String[] escolhas;

    chapter
        (
        String nome, 
        String texto, 
        character personagem,
        int custoEnergia,
        String[] escolhas
        )
        {
            this.nome = nome;
            this.texto = texto;
            this.personagem = personagem;
            this.custoEnergia = custoEnergia;
            this.escolhas = escolhas;
                
        }

    public void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.texto + "\n");
        this.personagem.stamina -= custoEnergia;
        System.out.println("\n" + this.personagem.name + " perdeu " + this.custoEnergia + " de Stamina.");
        if (this.personagem.stamina <= 0){
            System.out.println("\n" + this.personagem.name + " morreu.");
        }

        if (escolhas != null){
        for (int index = 0; index < escolhas.length; index++) {
                System.out.println(escolhas[index]);
            }
        }
    }

    public int escolher(){
        System.out.println("\nDigite: ");
        int escolha = input.nextInt();

        if (escolhas != null)
        {
            for (int i = 0; i < escolhas.length; i++) {
                if (escolha == i)
                {
                    escolha = i;
                }
            }
        }
        
        return escolha;

    }



}

