package Arrays;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {

        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto";
        ninjasEAldeias[0][2] = "Sasuke";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Kaku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Deidara";

        for (int i = 0; i < ninjasEAldeias.length ; i++) {
            System.out.println(ninjasEAldeias[i][0]);
            System.out.println(ninjasEAldeias[i][1]);
            System.out.println(ninjasEAldeias[i][2]);
        }

    }
}
