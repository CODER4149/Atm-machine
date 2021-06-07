import java.util.Scanner;
public class why{
    private double c[]={5000,10000};
void menu(boolean a,double c1,double c2, int ls ,double d,double d2) {
 
   int selection;
   Scanner input = new Scanner(System.in);

   /***************************************************/

   System.out.println("Choose from these choices");
   System.out.println("-------------------------\n");
   System.out.println("1 - withdrow cash");
   System.out.println("2 - check balance");
   System.out.println("3 - Quit");

  
   System.out.println("enter your choice");
   selection = input.nextInt();
   switch(selection){
      case  1:withdraw(a,c1,c2,ls,d,d2);
               break;
      case  2:System.out.println("enter password");
               selection = input.nextInt();
               if(((ls==c1&&selection==d)||(ls==c2&&selection==d2))){
                  if(ls==c1&&selection==d){
                     System.out.println("available balance:"+ c[0]);
                  }
                  if(ls==c2&&selection==d2){
                     System.out.println("available balance:"+ c[1]);
                  }
               }
      case  3:boolean t=true;
               if(t) return ;

               
      }
    
  
   }
   void withdraw(boolean a,double x,double x2,int ls,double d,double d2){
      int selection1;
      Scanner input = new Scanner(System.in);
   
      /***************************************************/
   
      System.out.println("Choose from these choices");
      System.out.println("-------------------------\n");
      System.out.println("1 - current account");
      System.out.println("2 - saving account");
      System.out.println("3 - Quit");
   
     
      System.out.println("enter your choice");
      selection1 = input.nextInt();
    
       switch(selection1){
         case  1:System.out.println("enter your ammount:");
                   double selection2=input.nextInt();
                   if(a && (selection2<(c[0]-500)||selection2<(c[1]-500))){
                     if(x==ls){
                      c[0]=c[0]-selection2;
                      if(c[0]>500){
                      System.out.println("your account balance:"+c[0]);
                     }else  if(c[0]<500){
                        System.out.println("balance ecceed");
                     }
                     }else if(x2==ls){
                        c[1]=c[1]-selection2;
                        if(c[1]>500){
                           System.out.println("your account balance:"+c[1]);
                          
                          }else  if(c[1]<500){
                             System.out.println("balance ecceed");
                             break;
                          }
                       
                     }
                   }
                   break;

         case 2:  System.out.println("enter your ammount:");
                double selection3=input.nextInt();
                if(a && (selection3<c[0]||selection3<c[1])){
                   if(x==ls){
                     c[0]=c[0]-selection3;
                     if(c[0]>0){
                        System.out.println("your account balance:"+c[0]);
                       }else if(c[0]<0){
                          System.out.println("balance ecceed");
                       }
                   }else if(x2==ls){
                      c[1]=c[1]-selection3;
                      if(c[1]>0){
                        System.out.println("your account balance:"+c[1]);
                        break;
                       }else if(c[1]<0){
                          System.out.println("balance ecceed");
                          break;

                       }
                      
           }
         }
         break;
         case  3:boolean t=true;
                   if(t) return ;

                
                  
       }

   }
}