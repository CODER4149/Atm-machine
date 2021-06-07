import java.util.Scanner;


public class cmdarg {
   
    
    public static void main( String arg[]) {
        double a[]={123456789,147258369};
        double b[]={4149,4141};
        why cally= new why();
        Scanner read = new Scanner(System.in);
       
        System.out.println("inter a account no.");
        int ls = read.nextInt();
       
             for(int i=0;i<(a.length);i++){
             if(ls==a[i]){
                Scanner read1 = new Scanner(System.in);
                 System.out.println("ENTER PASSWORD");
                 double run = read1.nextDouble();
                 boolean cal=((ls==a[0]&&run==b[0])||(ls==a[1]&&run==b[1]));
                
                 for(int j=0;j<b.length;j++){
                     
                      if(run==b[j] && ls==a[i]){
                          
                             cally.menu(cal,a[0],a[1],ls,b[0],b[1]); 
                           
                              
                 } 
                 
                
                }  
            }

     }
        
    
}
}
