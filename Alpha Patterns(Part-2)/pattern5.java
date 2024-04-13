public class pattern5 {
    public static void triange01(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){ // even - completely divides
                    System.out.print("1");
                }
                else{ // odd
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triange01(10);
    }
}
