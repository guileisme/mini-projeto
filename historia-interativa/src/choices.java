public class choices {
    private String text; //TEXTO DA ESCOLHA
    private chapter next; //CAPÍTULO RELACIONADO À ESCOLHA

    //MÉTODO GET & SET PARA O TEXTO
    public String getChoicesText(){
        return text;
    }
    public void setChoicesText(String text){
        this.text = text;
    }

    //MÉTODO GET & SET PARA A PRÓXIMA ESCOLHA
    public chapter getNextChoice(){
        return next;
    }
    public void setNextChoice(chapter next){
        this.next = next;
    }


    choices
    (
        String text,
        chapter next
    )
    
    {
        this.setChoicesText(text);
        this.setNextChoice(next);
    }

}
