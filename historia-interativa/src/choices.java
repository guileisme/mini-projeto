public class choices {
    String text; //TEXTO DA ESCOLHA
    chapter next; //CAPÍTULO RELACIONADO À ESCOLHA

    choices
    (
        String text,
        chapter next
    )
    
    {
        this.text = text;
        this.next = next;
    }

}
