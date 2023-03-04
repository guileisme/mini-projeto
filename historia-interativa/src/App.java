import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        character Personagem1 = new character(
            "Montenegro",
            "Detetive",
            100
        );
        character Personagem2 = new character(
            "Robert",
            "Detetive",
            50
        );


        Scanner input = new Scanner(System.in);

        
        Personagem2.Stamina(-50);
        System.out.println("Há um corpo no chão da biblioteca, múltiplos golpes de faca e um tiro no peito... \nA casa está cheia de sangue e há vestígios de uma luta entre duas pessoas. A janela está quebrada e parece que foi aqui que tudo terminou, pois o sangue está fresco e há pegadas mostrando a direção do suposto assassino.");
        System.out.println("Esse crime não parece ser diferente dos outros, um assassino e uma vítima. Já investiguei milhares de casos assim, desde que cheguei na cidade. Mas tem algo aqui que faz tudo ser diferente de um assassinato comum... \nO homem no chão é o meu parceiro.");
        System.out.println("Éramos próximos o suficiente para tornar esse caso extremamente pessoal para mim. ");
        Personagem1.Stamina(-20);
        System.out.println("\n1) Seguir o rastro de sangue pela janela.");
        System.out.println("\n2) Investigar a biblioteca");
        String escolha1 = input.nextLine();

        if (escolha1.equals("1"))
        {
            System.out.println("Vejo que o rastro vai até o beco ao lado e sigo até chegar em uma lata de lixo.\nLá está a arma do crime, revólver taurus calibre .22, a arma que o meu parceiro costumava usar em casos mais sérios...\nMeu palpite é que-");
            System.out.println("        -Não devia ter se metido onde não foi chamado... \nBANG!");
            System.out.println("\nSinto a bala perfurando meu peito e olho o rosto de quem que fez o mesmo com o meu parceiro.\nCurioso saber que estou morrendo pelas mãos da mesma que pretendia matar, para vingar a morte de meu amigo...");
            System.out.println("A vida é mesmo uma grande piada de mau gosto...");
            Personagem1.Stamina(-100);

        }

        else if (escolha1.equals("2"))
        {
            System.out.println("No local do crime, vejo que há um livro jogado no chão, junto de um papel recortado que deixa uma mensagem");
            System.out.println("Você não vai escapar dos seus pecados... Eu sei o que você fez com Lyla e logo todos saberão também.\nMas não antes que você pague por isso. Assim como ela, você também não vai poder se defender das acusações...");
            System.out.println("Parece que isso foi o estopim para a briga e o remetente estava esperando para fazer a sua emboscada. O que eu devo fazer...?");
            System.out.println("\n2.1) Descobrir o passado do seu parceiro.");
            System.out.println("\n2.2) Queimar a carta e ir embora.");
            String escolha2 = input.nextLine();
                if (escolha2.equals("2.1"))
                {
                    System.out.println("Guardei aquele papel em meu casaco e decidi investigar o passado inexplorado do meu parceiro. Não tinha nada sobre ele nos arquivos da delegacia, então tive que ir atrás de pessoas que podiam me ajudar.\nPrimeiro, fui atrás de sua ex-esposa Claire e descobri o motivo da separação.");
                    System.out.println("Robert, meu parceiro, teve uma filha com Claire e ela se chamava Mary. Mary cresceu em um ambiente tradicional e conservador, típico do que temos por aqui.\nPorém, Mary chegou na fase mais temida pelos pais, a adolescência, e se envolveu com pessoas má intencionadas que a introduziram ao mundo das drogas.\nMary tentou esconder isso de seu pai, sabendo como ele reagiria se soubesse que a própria filha estava no grupo o qual ele buscava prender, todas as vezes que saía de casa.");
                    System.out.println("Infelizmente, o infeliz dia chegou e Robert viu sua filha junto de usuários de cocaína, enquanto investigava um caso de tráfico na região onde morava.\nAquilo o deixou ensandecido e, durante um ataque de fúria, Robert tentou resolver seus problemas com a sua filha naquele momento.\nDurante a discussão, um dos amigos de Mary tentou atacar Robert com uma faca e acabou sendo baleado.\nMary tentou tirar a arma de seu pai e isso trouxe mais uma morte... a de Lyla, amiga que interviu na discussão e levou o tiro que devia ter acertado Mary.");
                    System.out.println("Sabia que aquilo se tratava de um acerto de contas e decidi ir atrás do assassino de meu parceiro, só não esperava que ele estivesse na mesma casa que eu...\nMary estava na cozinha e escutou tudo... \nEla confessou o crime na minha frente, enquanto apontava a arma que matou o meu amigo, um revólver taurus .22.\nEu disse que não tinha intenção de prendê-la, pois sabia que a sua ação tinha sido uma forma de acertar as contas com o seu pai.\nEla caiu no chão da sala, chorando e balbuciando palavras que não tive a mínima intenção de ouvir");
                    System.out.println("Mais um caso encerrado...");
                    Personagem1.Stamina(-79);
                    
                }

                else if (escolha2.equals("2.2"))
                {
                    System.out.println("Seja quem for Lyla, parece que Robert não fez algo honrável com ela...\nNão quero me meter em uma história que não me pertence.");
                    Personagem1.Stamina(0);

                }
        }

        else
        {
            System.out.println("Você escolheu a opção errada...");
        }
    input.close();

    }
}
