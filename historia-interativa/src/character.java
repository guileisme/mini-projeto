public class character {
    String name;
    String classe;
    int stamina;

    character(String name, String classe, int stamina){
        this.name = name;
        this.classe = classe;
        this.stamina = stamina;
    }

    int Stamina(int perder){
        this.stamina += perder;
        System.out.println("\n" + this.name + " [" +perder + " stamina]");
        System.out.println(this.name + " [" +this.stamina + " de stamina restante]");


        if (perder == 0){
            System.out.println("\n" + this.name + " não perdeu nenhuma stamina ao realizar a ação.");
            System.out.println(this.name + " [" +this.stamina + " de stamina restante]");
            

        }

        if (this.stamina <= 0){
            this.stamina = 0;
            System.out.println("\n" + this.name + " perdeu toda stamina e morreu.\n");

        }

        return stamina;
    }
}

