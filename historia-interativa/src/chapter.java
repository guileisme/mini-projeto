//IMPORTANDO BIBLIOTECAS
import java.util.ArrayList;
import java.util.Scanner;

public class chapter {
    private Scanner input = new Scanner(System.in);

    private String title; //TÍTULO DO CAPÍTULO
    private String text; //TEXTO DO CAPÍTULO
    private character character; //PERSONAGEM DO CAPÍTULO
    private int EnergyCost; //GASTO DE STAMINA DO PERSONAGEM
    public ArrayList<choices> chapterChoices; //LISTA DE DECISÕES RELACIONADAS AO CAPÍTULO

    //MÉTODO GET & SET PARA O TÍTULO
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    //MÉTODO GET & SET PARA O TEXTO
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }

    //MÉTODO GET & SET PARA O PERSONAGEM
    public character getCharacter(){
        return character;
    }
    public void setCharacter(character character){
        this.character = character;
    }

    //MÉTODO GET & SET PARA O CUSTO DE STAMINA DO PERSONAGEM
    public int getEnergyCost(){
        return EnergyCost;
    }
    public void setEnergyCos(int EnergyCost){
        this.EnergyCost = EnergyCost;
    }

    //MÉTODO GET & SET PARA AS ESCOLHAS
    public ArrayList<choices> getChoices(){
        return chapterChoices;
    }
    public void setChoices(ArrayList<choices> chapterChoices){
        this.chapterChoices = chapterChoices;
    }

    
    //MÉTODO CONSTRUTOR
    chapter
        (
        String name, 
        String text, 
        character character,
        int EnergyCost
        )

        {
            this.setTitle(name);
            this.setText(text);
            this.setCharacter(character);
            this.setEnergyCos(EnergyCost);
            this.chapterChoices = new ArrayList<choices>();
        }

    //MÉTODO MOSTRAR CAPÍTULO
    public void show() 
    {
        System.out.println("\n" + this.title); //TÍTULO
        System.out.println(this.text + "\n"); //HISTÓRIA DO CAPÍTULO
        this.character.setCharacterStamina(this.character.getCharacterStamina() - getEnergyCost()); //CUSTO DE STAMINA
        System.out.println("\n" + this.character.getCharacterName() + " perdeu " + this.EnergyCost + " de Stamina."); 

        // MORTE DO PERSONAGEM
        if (this.character.getCharacterStamina() <= 0)
        {
             System.out.println("\n" + this.character.getCharacterName() + " morreu.");
        }
        
        // MOSTRANDO AS ESCOLHAS
        if (chapterChoices.size() > 0)
        {
            for (choices index : chapterChoices) 
            {
            System.out.println(index.getChoicesText());
            }
            int userDecision = choose();
            this.chapterChoices.get(userDecision).getNextChoice().show();

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
        
        return decision-1;
        
    }

    //EXECUTANDO MOSTRAR & ESCOLHER AO MESMO TEMPO E LEVANDO AO CAPÍTULO RELACIONADO À ESCOLHA DO JOGADOR
    public void execute()
    {
        System.out.println(this.getTitle()); //TÍTULO
        System.out.println(this.getText() + "\n"); //HISTÓRIA DO CAPÍTULO
        this.character.setCharacterStamina(this.character.getCharacterStamina() - getEnergyCost()); //CUSTO DE STAMINA
        System.out.println("\n" + this.character.getCharacterName() + " perdeu " + this.getEnergyCost() + " de Stamina."); 

        // MORTE DO PERSONAGEM
        if (this.character.getCharacterStamina() <= 0)
        {
             System.out.println("\n" + this.character.getCharacterName() + " morreu.");
        }
        
        // MOSTRANDO AS ESCOLHAS
        if (chapterChoices.size() > 0)
        {
            for (choices index : chapterChoices) 
            {
            System.out.println(index.getChoicesText());
            }
            
            int userDecision = choose();
            this.chapterChoices.get(userDecision).getNextChoice().show();

        }

    }

}

