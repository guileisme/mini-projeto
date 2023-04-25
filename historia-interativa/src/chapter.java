//IMPORTANDO BIBLIOTECAS
import java.util.ArrayList;
import java.util.Scanner;

public class chapter {
    Scanner input = new Scanner(System.in);
    String title; //TÍTULO DO CAPÍTULO
    String text; //TEXTO DO CAPÍTULO
    character character; //PERSONAGEM DO CAPÍTULO
    int EnergyCost; //GASTO DE STAMINA DO PERSONAGEM
    ArrayList<choices> chapterChoices; //LISTA DE decisionS RELACIONADAS AO CAPÍTULO

    
    //MÉTODO CONSTRUTOR
    chapter
        (
        String name, 
        String text, 
        character character,
        int EnergyCost
        )

        {
            this.title = name;
            this.text = text;
            this.character = character;
            this.EnergyCost = EnergyCost;
            this.chapterChoices = new ArrayList<choices>();
        }

    //MÉTODO MOSTRAR CAPÍTULO
    public void show() 
    {
        System.out.println(this.title); //TÍTULO
        System.out.println(this.text + "\n"); //HISTÓRIA DO CAPÍTULO
        this.character.stamina -= EnergyCost; //CUSTO DE STAMINA
        System.out.println("\n" + this.character.name + " perdeu " + this.EnergyCost + " de Stamina."); 

        // MORTE DO PERSONAGEM
        if (this.character.stamina <= 0)
        {
             System.out.println("\n" + this.character.name + " morreu.");
        }
        
        // MOSTRANDO AS ESCOLHAS
        if (chapterChoices.size() > 0)
        {
            for (choices index : chapterChoices) 
            {
            System.out.println(index.text);
            }

        }
    }

    // MÉTODO PARA ESCOLHA DE DECISÕES
    public int choose(){
        System.out.println("\nDigite: ");
        int decision = input.nextInt(); //LENDO A DECISÃO DO JOGADOR
        
        if (decision != 0)
        {
            for (choices i : chapterChoices) 
            {
                if (decision == chapterChoices.indexOf(i))
                {
                    decision = chapterChoices.indexOf(i);
                }
            }
        }
        
        return decision;
        
    }

    //EXECUTANDO MOSTRAR & ESCOLHER AO MESMO TEMPO E LEVANDO AO CAPÍTULO RELACIONADO À ESCOLHA DO JOGADOR
    public void execute ()
    {
        System.out.println(this.title); //TÍTULO
        System.out.println(this.text + "\n"); //HISTÓRIA DO CAPÍTULO
        this.character.stamina -= EnergyCost; //CUSTO DE STAMINA
        System.out.println("\n" + this.character.name + " perdeu " + this.EnergyCost + " de Stamina."); 

        // MORTE DO PERSONAGEM
        if (this.character.stamina <= 0)
        {
             System.out.println("\n" + this.character.name + " morreu.");
        }
        
        // MOSTRANDO AS ESCOLHAS
        if (chapterChoices.size() > 0)
        {
            for (choices index : chapterChoices) 
            {
            System.out.println(index.text);
            }

            int userDecision = choose();
            this.chapterChoices.get(userDecision).next.show();

        }
    }
}

