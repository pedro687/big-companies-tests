public class SubArraySum {
    public static void main(String[] args) {
        Integer[] vector =  {1,2,3,7,5};
        Integer[] vector2 = {4,2,3,7,2,4,2};

        subArraySum_approach1(vector, 12);
        subArraySum_approach2(vector, 12);
    }


    //O(N²)
    private static boolean subArraySum_approach2(Integer[] vector, int S) {
        Integer soma;

        for (int i = 0; i < vector.length; i++) {
            soma = 0;
            for (int j = i; j < vector.length; j++) {
                soma += vector[j];
                if (soma == S) {
                    System.out.printf("%d , %d", i+1, j+1 );
                    return true;
                }
            }
        }
        System.out.println(-1);
        return false;
    }

    //O(N^3)
    private static boolean subArraySum_approach1(Integer[] vector, Integer S) {
         Integer soma;

         for (int i = 0; i < vector.length; i++) {
             for (int j = i; j < vector.length; j++) {
                 soma = 0;
                 for (int k = i; k <= j; k++) {
                     soma += vector[k];
                 }

                 if (soma == S) {
                     var indice1 = i+1;
                     var indice2 = j+1;
                     System.out.println("indice 1: " + indice1 + " indice2: " + indice2);
                    return true;
                 }
             }
         }

        System.out.println(-1);
         return false;
    }

}
