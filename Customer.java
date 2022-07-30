import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

class Customer{
  
   public static void main (String args[]){
   Customer saurabh=new Customer();
   
   
   
    int choice;
Scanner sc = new Scanner(System.in);
System.out.println("Choose from follwing....");
System.out.println("1.Place order");
System.out.println("2.Payment");
System.out.println("3.Recipt");
choice=sc.nextInt();
if(choice==1){
    System.out.println("Our products... select from here....");
    System.out.println("Our food list");
    System.out.println("1.Pizza");
 System.out.println("Price is: 100");
 
 System.out.println("2.Burger");
 System.out.println("Price is: 150");
 
 System.out.println("3.Hotdog");
 System.out.println("Price is: 75");
 

 System.out.println("4.Chicken");
 System.out.println("Price is: 200");
 
 System.out.println("5.Biryani");
 System.out.println("Price is: 70");
 
 System.out.println("6.Kaju kadi");
 System.out.println("Price is: 50");

 System.out.println("7.Pawbhaji");
 System.out.println("Price is: 40");
 System.out.print("Please select food for ordering");

choice= sc.nextInt();
 if(choice==1){
    System.out.println("Your pizza will be ready in few minute please wait....");
 }
else if(choice==2){
    System.out.println("Your burger will be ready in few minute please wait....");
 }
 else if(choice==3){
    System.out.println("Your hotdog will be ready in few minute please wait....");
 }
 else if(choice==4){
    System.out.println("Your chicken will be ready in few minute please wait....");
 }
 else if(choice==5){
    System.out.println("Your biryani will be ready in few minute please wait....");
 }
 else if(choice==6){
    System.out.println("Your kaju kadi will be ready in few minute please wait....");
 }
 else if(choice==7){
    System.out.println("Your pawbhaji will be ready in few minute please wait....");
 }

if(choice==2){
  System.out.println("Please select your payment mode");
  System.out.println("1.Offline");
  System.out.println("2.Online");
  choice=sc.nextInt();
  if(choice==1)
  {
      System.out.println("1.Pizza");
  System.out.println("Price is: 100");
  
  System.out.println("2.Burger");
  System.out.println("Price is: 150");
  
  System.out.println("3.Hotdog");
  System.out.println("Price is: 75");
  
 
  System.out.println("4.Chicken");
  System.out.println("Price is: 200");
  
  System.out.println("5.Biryani");
  System.out.println("Price is: 70");
  
  System.out.println("6.Kaju kadi");
  System.out.println("Price is: 50");
 
  System.out.println("7.Pawbhaji");
  System.out.println("Price is: 40");

 choice= sc.nextInt();
 if(choice==1){
     System.out.println("Please give 100 INR in cash");
   
 else if(choice==2){
    System.out.println("Please give 150 INR in cash");
 }
 else if(choice==3){
    System.out.println("Please give 75 INR in cash");
 }
 else if(choice==4){
    System.out.println("Please give 200 INR in cash");
 }
 else if(choice==5){
    System.out.println("Please give 70 INR in cash");
 }
 else if(choice==6){
    System.out.println("Please give 50 INR in cash");
 }
 else if(choice==7){
    System.out.println("Please give 40 INR in cash");
 }
  }
 
  if (choice==2){
      System.out.println("Please payment on following upi id");
      System.out.println("xyz123@okaxis");
  }
}
}





  if(choice==3){
      System.out.println("Your reciept is soon ready wait......");
      System.out.println("1.Pizza");
 System.out.println("Price is: 100");
 
 System.out.println("2.Burger");
 System.out.println("Price is: 150");
 
 System.out.println("3.Hotdog");
 System.out.println("Price is: 75");
 

 System.out.println("4.Chicken");
 System.out.println("Price is: 200");
 
 System.out.println("5.Biryani");
 System.out.println("Price is: 70");
 
 System.out.println("6.Kaju kadi");
 System.out.println("Price is: 50");

 System.out.println("7.Pawbhaji");
 System.out.println("Price is: 40");
 System.out.println("Choose which food you ordered");
choice= sc.nextInt();

 
   
       
 
      
String strPath = "", strName = "";
try{
   strName = "Saurabh_Restarunt";
           
 
   // Reading File Path
   strPath ="D:/Food_ordering_program" ;

   // Creating File Object
   File Saurabh_Restarunt
       = new File(strPath + "" + strName + ".txt");

   // Method createNewFile() method creates blank
   // file.
   Saurabh_Restarunt.createNewFile();
   System.out.println(Saurabh_Restarunt.canWrite());
   System.out.println(Saurabh_Restarunt.canRead());
   System.out.println(Saurabh_Restarunt.canExecute());
   


FileWriter sa=new FileWriter("D:/Food ordering program/Saurabh_Restarunt.txt",true);
if (choice==1){
    sa.write("SAURABH RESTARUANT"+"\n"+"NAME"+"            PRICE  "+"\n"+"Pizza"+"           100 ");
     
    sa.close();
    
    System.out.println("SAURABH RESTARUANT"+"\n"+"NAME"+"            PRICE  "+"\n"+"Pizza"+"           100 ");
}
else if(choice==2){
    sa.write("SAURABH RESTARUANT"+"\n"+"NAME"+"            PRICE  "+"\n"+"Burger"+"           150 ");
    
    sa.close();
    
    System.out.println("SAURABH RESTARUANT"+"\n"+"NAME"+"            PRICE  "+"\n"+"Burger"+"           150 ");
}
else if(choice==3){
    sa.write("SAURABH RESTARUANT"+"\n"+"NAME"+"            PRICE  "+"\n"+"Hotdog"+"           75 ");
    sa.close();
    System.out.println("SAURABH RESTARUANT"+"\n"+"NAME"+"            PRICE  "+"\n"+"Hotdog"+"           75 ");
}
else if(choice==4){
    sa.write("SAURABH RESTARUANT"+"\n"+"NAME"+"            PRICE  "+"\n"+"Chickenr"+"           200 ");
    sa.close();
    System.out.println("SAURABH RESTARUANT"+"\n"+"NAME"+"            PRICE  "+"\n"+"Chickenr"+"           200 ");
}
else if(choice==5){
    FileWriter aa=new FileWriter("D:/Food ordering program/Atish.pdf");
    aa.write("SAURABH RESTARUANT"+"\n"+"NAME"+"            PRICE  "+"\n"+"Biryani"+"           70 ");
    aa.close();
    System.out.println("SAURABH RESTARUANT"+"\n"+"NAME"+"            PRICE  "+"\n"+"Biryani"+"           70 ");
}
else if(choice==6){
    sa.write("SAURABH RESTARUANT"+"\n"+"NAME"+"            PRICE  "+"\n"+"Kaju kadi"+"           50 ");
    sa.close();
    System.out.println("SAURABH RESTARUANT"+"\n"+"NAME"+"            PRICE  "+"\n"+"Kaju kadi"+"           50 ");
}
else if(choice==7){
    sa.write("SAURABH RESTARUANT"+"\n"+"NAME"+"            PRICE  "+"\n"+"Pawbhaji"+"           40 ");
    sa.close();
    System.out.println("SAURABH RESTARUANT"+"\n"+"NAME"+"            PRICE  "+"\n"+"Pawbhaji"+"           40 ");

}







     }     
    
     catch (Exception e) {
        
        System.out.println(e.getMessage());
    } 
  }
}


}







