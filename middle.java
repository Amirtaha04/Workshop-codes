import java.util.Scanner;
public class middle {
    public static void main(String[] args){
        Scanner entry = new Scanner(System.in);
        
        System.out.println("Please enter the number of points: ");


        int size =  entry.nextInt();
        double midx=0; 
        double midy=0;
        double points[][] = new double[size][2];

        System.out.println("Enter the points: ");

        for(int i=0; i<size; i++){
            System.out.println("Enter X then click enter and enter Y ");
            points[i][0] = entry.nextDouble();
            midx += points[i][0];
            points[i][1] = entry.nextDouble();
            midy += points[i][1];
        }

        System.out.println("The middle point is " + midx/size +" , " +midy/size);

        

    }
}
