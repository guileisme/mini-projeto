import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

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

        capitulo chapter1 = new capitulo(
            "A cena do Crime",
            "Há um corpo no chão da biblioteca, múltiplos golpes de faca e um tiro no peito...\nA casa está cheia de sangue e há vestígios de uma luta entre duas pessoas. A janela está quebrada e parece que foi aqui que tudo terminou, pois o sangue está fresco e há pegadas mostrando a direção do suposto assassino.\nEsse crime não parece ser diferente dos outros, um assassino e uma vítima. Já investiguei milhares de casos assim, desde que cheguei na cidade. Mastem algo aqui que faz tudo ser diferente de um assassinato comum... \nO homem no chão é o meu parceiro.\nÉramos próximos o suficiente para tornar esse caso extremamente pessoal para mim.",
            "1) Seguir o rastro de sangue pela janela.",
            "2) Investigar a biblioteca.",
            Personagem2,
            50
        );

        capitulo chapter2 = new capitulo(
            "Um Encontro Inesperado",
            "Vejo que o rastro vai até o beco ao lado e sigo até chegar em uma lata de lixo.\nLá está a arma do crime, revólver taurus calibre .22, a arma que o meu parceiro costumava usar em casos mais sérios...\nMeu palpite é que-\n -Não devia ter se metido onde não foi chamado... \n BANG!\n Sinto a bala perfurando meu peito e olho o rosto de quem que fez o mesmo com o meu parceiro.\nCurioso saber que estou morrendo pelas mãos da mesma que pretendia matar, para vingar a morte de meu amigo...\n A vida é mesmo uma grande piada de mau gosto...",
            null,
            null,
            Personagem1,
            100
        );

        capitulo chapter3 = new capitulo(
            "Alguém do Passado",
            "No local do crime, vejo que há um livro jogado no chão, junto de um papel recortado que deixa uma mensagem\n Você não vai escapar dos seus pecados... Eu sei o que você fez com Lyla e logo todos saberão também.\nMas não antes que você pague por isso. Assim como ela, você também não vai poder se defender das acusações...\nParece que isso foi o estopim para a briga e o remetente estava esperando para fazer a sua emboscada. O que eu devo fazer...? ",
            "1) Descobrir o passado do seu parceiro.",
            "2) Queimar a carta e ir embora.", 
            Personagem1,
            0
        );

        capitulo chapter4 = new capitulo(
            "Raízes Profundas",
            "Guardei aquele papel em meu casaco e decidi investigar o passado inexplorado do meu parceiro. Não tinha nada sobre ele nos arquivos da delegacia, então tive que ir atrás de pessoas que podiam me ajudar.\nPrimeiro, fui atrás de sua ex-esposa Claire e descobri o motivo da separação. Robert, meu parceiro, teve uma filha com Claire e ela se chamava Mary. Mary cresceu em um ambiente tradicional e conservador, típico do que temos por aqui.\nPorém, Mary chegou na fase mais temida pelos pais, a adolescência, e se envolveu com pessoas má intencionadas que a introduziram ao mundo das drogas.\nMary tentou esconder isso de seu pai, sabendo como ele reagiria se soubesse que a própria filha estava no grupo o qual ele buscava prender, todas as vezes que saía de casa. Infelizmente, o infeliz dia chegou e Robert viu sua filha junto de usuários de cocaína, enquanto investigava um caso de tráfico na região onde morava.\nAquilo o deixou ensandecido e, durante um ataque de fúria, Robert tentou resolver seus problemas com a sua filha naquele momento.\nDurante a discussão, um dos amigos de Mary tentou atacar Robert com uma faca e acabou sendo baleado.\nMary tentou tirar a arma de seu pai e isso trouxe mais uma morte... a de Lyla, amiga que interviu na discussão e levou o tiro que devia ter acertado Mary. Sabia que aquilo se tratava de um acerto de contas e decidi ir atrás do assassino de meu parceiro, só não esperava que ele estivesse na mesma casa que eu...\nMary estava na cozinha e escutou tudo... \nEla confessou o crime na minha frente, enquanto apontava a arma que matou o meu amigo, um revólver taurus .22.\nEu disse que não tinha intenção de prendê-la, pois sabia que a sua ação tinha sido uma forma de acertar as contas com o seu pai.\nEla caiu no chão da sala, chorando e balbuciando palavras que não tive a mínima intenção de ouvir. \nMais um caso encerrado...",
            null,
            null,
            Personagem1,
            79
        );

        capitulo chapter5 = new capitulo(
            "Não é da minha conta",
            "Seja quem for Lyla, parece que Robert não fez algo honrável com ela...\nNão quero me meter em uma história que não me pertence.",
            null,
            null,
            Personagem2,
            0
        );

        chapter1.mostrar();
        if (chapter1.escolher() == 1){
            chapter2.mostrar();
        };

        if (chapter1.escolher() == 2){
            chapter3.mostrar();
            chapter3.escolher();
            if (chapter3.escolher() == 1){
                chapter4.mostrar();
            }

            else if (chapter3.escolher() == 2){
                chapter5.mostrar();

            }
        };

    input.close();

    }
}
