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
            "café",
            "1) Seguir o rastro de sangue pela janela.",
            "2) Investigar a biblioteca",
            Personagem2,
            50
        );

        capitulo chapter2 = new capitulo(
            "Um Encontro Inesperado",
            "leite",
            null,
            null,
            Personagem1,
            100
        );

        capitulo chapter3 = new capitulo(
            "Alguém do Passado",
            "pão",
            "2.1) Descobrir o passado do seu parceiro.",
            "2.1) Queimar a carta e ir embora.", 
            Personagem1,
            0
        );

        capitulo chapter4 = new capitulo(
            "Raízes Profundas",
            "torrada",
            null,
            null,
            Personagem1,
            79
        );

        capitulo chapter5 = new capitulo(
            "Não é da minha conta",
            "manteiga",
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
