public class character {
    private String name; // NOME DO PERSONAGEM
    private String classe; //CLASSE DO PERSONAGEM
    private int stamina; //STAMINA DO PERSONAGEM

    //MÉTODO GET & SET PARA O NOME DO PERSONAGEM
    public String getCharacterName(){
        return name;
    }
    public void setCharacterName(String name){
        this.name = name;
    }

    //MÉTODO GET & SET PARA A CLASSE DO PERSONAGEM
    public String getCharacterClass(){
        return classe;
    }
    public void setCharacterClass(String classe){
        this.classe = classe;
    }

    //MÉTODO GET & SET PARA A STAMINA DO PERSONAGEM
    public int getCharacterStamina(){
        return stamina;
    }
    public void setCharacterStamina(int stamina){
        this.stamina = stamina;
    }


    character(String name, String classe, int stamina){
        this.setCharacterName(name);
        this.setCharacterClass(classe);
        this.setCharacterStamina(stamina);
    }

}

