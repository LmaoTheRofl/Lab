public class Lab1 {
    public static void main(String[] args) {
        short x1 = 15;
        short[] c = new short[10];
        for (int i = 0; i<10; i++) {
            c[i] = x1;
            x1--;
         }
       float[] x = new float[20];
       for (int i = 0; i<20; i++) {
           float num = (float) (Math.random()*22-10);
           x[i] = num;
       }
       double[][] d = new double[10][20];
       for (int i = 0; i<10; i++){
           for (int j = 0; j<20; j++){
               if (c[i] == 13){
                   d[i][j] = Math.tan(Math.tan(Math.pow(x[j], ((x[j]+1/3)/3))));
               }
               else if (c[i]==6 | c[i]==9 | c[i]==13 | c[i]==14 | c[i]==15) {
                   d[i][j] = Math.pow(2*Math.tan(Math.atan((x[j]+1)/22)), (3/4)/(2/((2/3)+x[j])));
               }
               else {

                   d[i][j] = Math.pow(Math.asin(Math.cos(Math.log(Math.pow(Math.E, x[j])))), 3);
               }

           }
       }
        for (int i = 0; i<10; i++){
            for (int j = 0; j<20; j++){
                System.out.printf("%.3f", d[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        }
}
