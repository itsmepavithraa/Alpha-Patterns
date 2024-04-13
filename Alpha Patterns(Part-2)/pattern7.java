public class pattern7 {
    public static void solid_rhombus(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for starts
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        solid_rhombus(5);
    }
}
