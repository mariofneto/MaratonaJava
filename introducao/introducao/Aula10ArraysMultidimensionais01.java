package maratonajava.introducao.introducao;

public class Aula10ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [][] random = new int[3][3];

        random[0][0] = 0;
        random[0][1] = 0;
        random[0][2] = 0;

        random[1][0] = 0;
        random[1][1] = 0;
        random[1][2] = 0;

        random[2][0] = 0;
        random[2][1] = 0;
        random[2][2] = 0;

        // usando for normal
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random[i].length; j++) {
                System.out.print(random[i][j]);
            }
            System.out.println();
        }

        // usando foreach
        for(int[] arrBase : random){
            for(int num : arrBase){
                System.out.print(num);
            }
            System.out.println();
        }


    }
}
