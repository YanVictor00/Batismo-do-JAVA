package Testes.Review.Ex001;

public class ReviewEx001 {
    public static void main(String[] args) {

    Ninja sasuke = new Ninja("Sasuke Uchiha", 19, "Matar itachi",5);
    Ninja naruto = new Ninja("Naruto Uzumaki", 16, "Se tornar Hogake",5);
    Ninja rock = new Ninja("Rock Lee", 18, "Treinar nas montanhas",5);

    sasuke.mostrar();
    if (sasuke.idade() > 17 ){
        System.out.println("Missão concluída!");
    }else{
        System.out.println("Missão pendente...");
    }
        System.out.println("-------------------------------------");
    naruto.mostrar();
        if (naruto.idade() > 18 ){
            System.out.println("Missão concluída!");
        }else{
            System.out.println("Missão pendente...");
        }
        System.out.println("-------------------------------------");
    rock.mostrar();
        if (rock.idade() > 16 ){
            System.out.println("Missão concluída!");
        }else{
            System.out.println("Missão pendente...");
        }
    }
}
