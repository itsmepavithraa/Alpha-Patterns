public class pattern2 {
    public static void main(String args[]){
        for(int line=1;line<=4;line++){

            //Inverted Star Pattern using Nested for loop
            
            for(int star=4;star>=line;star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
