package DESAFIOS;

public class EX001 {
    public static void main(String[] args) {

        //ORIGEM
        String aldeia = "Aldeia da Folha";

        //NARUTO
        String nameN = "Naruto Uzumak";
        int idadeN = 15;
        String missaoN;
        String nivelMissaoN;
        String statusMissaoN;

        if (idadeN < 16) {
            System.out.println(nameN + " NÃO CONSEGUE EFEUTAR A MISSÃO, DEVIDO A IDADE");
        } else {
            missaoN = "Encontrar bandido";
            nivelMissaoN = "C";
            statusMissaoN = "Missão Concluída!";
            System.out.println("Missão: " + missaoN);
            System.out.println("Nome do Ninja: " + nameN);
            System.out.println("Nível da Missão: " + nivelMissaoN);
            System.out.println("Status da missão = " + statusMissaoN + " Parabéns, " + nameN + "!");
        }

            System.out.println("-------------------------");

            //Sasuke
            String nameS = "Sasuke Uchiha";
            int idadeS = 16;
            String missaoS;
            String nivelMissaoS;
            String statusMissaoS;

            if (idadeS < 16) {
                System.out.println(nameS + " NÃO CONSEGUE EFEUTAR A MISSÃO, DEVIDO A IDADE");
            } else {
                missaoS = "Proteger a vila";
                nivelMissaoS = "A";
                statusMissaoS = "Missão Concluída!";
                System.out.println("Missão: " + missaoS);
                System.out.println("Nome do Ninja: " + nameS);
                System.out.println("Nível da Missão: " + nivelMissaoS);
                System.out.println("Status da missão = " + statusMissaoS + " Parabéns, " + nameS + "!");
            }

            System.out.println("-------------------------");

            //Rock
            String nameR = "Rock Lee";
            int idadeR = 16;
            String missaoR;
            String nivelMissaoR;
            String statusMissaoR;

            if (idadeR < 16) {
                System.out.println(nameR + " NÃO CONSEGUE EFEUTAR A MISSÃO, DEVIDO A IDADE");
            } else {
                missaoR = "Tomar uma";
                nivelMissaoR = "S";
                statusMissaoR = "Missão Concluída!";
                System.out.println("Missão: " + missaoR);
                System.out.println("Nome do Ninja: " + nameR);
                System.out.println("Nível da Missão: " + nivelMissaoR);
                System.out.println("Status da missão = " + statusMissaoR + " Parabéns, " + nameR + "!");
            }

        }
    }
