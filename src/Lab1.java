import java.util.Arrays;

public class Lab1 {
    public static void main(String[] args) {
        long[] c = new long[10];
    for(int i =0; i<11; i++) {
        for(int j=4,b=0;j<23;j+=2) {
        c[b]=j;
        b++;
    }}
        System.out.println(Arrays.toString(c));
       double[] x = new double[20];
       for (int i = 0; i<20; i++) {
           double num = (Math.random()*19-5);
           x[i] = num;
       }System.out.println(Arrays.toString(x));
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
        }}}


