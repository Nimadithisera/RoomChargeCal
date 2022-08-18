//IT21190216
import java.util.Scanner;
class Main {
   public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);

     RoomChargeCalculator  myobj= new RoomChargeCalculator();

     String yesNo;
    

    System.out.println("1.Deulax-Double  ");
    System.out.println("2.Standerd-family  ");
    System.out.println("3.Standard-Single  ");
    System.out.println("4.Quit  ");

    System.out.print("Enter your Choice : ");
    int choise = ob.nextInt();

    switch (choise){
      case 1 : System.out.println("You choose Delux-Double");
               System.out.println("**************************");
               System.out.println("Your fixd fee is " + myobj.FixedDulexRoom);
        System.out.println("========================================");
               System.out.println("Our Additional services ");
               System.out.println("Balcony : Rs ."+myobj.balconeyprice);
        
        System.out.println("Parking : Rs ."+myobj.parkingprice);
        System.out.println("Tv : Rs ."+myobj.tvprice);
        System.out.println("Kitchen : Rs ."+myobj.kitchenprice);
        System.out.println("Wifi : Rs ."+myobj.wifiprice);
      System.out.println("");
      System.out.println("");  
        System.out.println("Do you want an additional ? yes/no");
         yesNo = ob.next();
        
         if (yesNo.toLowerCase().equals("yes")) {
     System.out.println("");
            System.out.println("Do you want add balconey ? yes/no");
           String balconey = ob.next();
           
           boolean addBalconey = myobj.confirmAdditional(balconey);
      System.out.println("");
           
           //parking

           System.out.println("Do you want add parking ? yes/no");
           String parking = ob.next();
           
           boolean addParking = myobj.confirmAdditional(parking);
      System.out.println("");
           
           //Tv
           System.out.println("Do you want add TV ? yes/no");
           String tv = ob.next();
           
           boolean addTv = myobj.confirmAdditional(tv);
      System.out.println("");
           
           //kitchen
           System.out.println("Do you want add Kitchen ? yes/no");
           String kitchen = ob.next();
           
           boolean addKitchen = myobj.confirmAdditional(kitchen);
      System.out.println("");
           
           //Wifi
           System.out.println("Do you want add wifi ? yes/no");
           String wifi = ob.next();
           
           boolean addWifi = myobj.confirmAdditional(wifi);
           
      System.out.println("");
           
        myobj.getchargeDeluxDouble(addBalconey,addParking, addTv,addKitchen ,addWifi );
           
         }
        
         
        
        break;
        
      case 2 : System.out.println("You choose Standerd-family");
               System.out.println("**************************");
                System.out.println("Your fixd fee is " + myobj.FixedstanderdfamilyRoom);
      System.out.println("========================================");
        
        System.out.println("Parking : Rs ."+myobj.parkingprice);
        System.out.println("Kitchen : Rs ."+myobj.kitchenprice1);
        System.out.println("Garden : Rs ."+myobj.gardenprice);

           System.out.println("");
      System.out.println("");  
        System.out.println("Do you want an additional ? yes/no");
         yesNo = ob.next();
        
         if (yesNo.toLowerCase().equals("yes")) {
     System.out.println("");

            //parking

           System.out.println("Do you want add parking ? yes/no");
           String parking = ob.next();
           
           boolean addParking = myobj.confirmAdditional(parking);
      System.out.println("");

           //kitchen
           System.out.println("Do you want add Kitchen ? yes/no");
           String kitchen = ob.next();
           
           boolean addKitchen = myobj.confirmAdditional(kitchen);
      System.out.println("");

           //garden
           System.out.println("Do you want add Kitchen ? yes/no");
           String garden = ob.next();
           
           boolean addGarden = myobj.confirmAdditional(garden);
      System.out.println("");

                myobj.getChargeStandardFamily(addGarden,addParking,addKitchen);
           
           
         }
        
        break;
        
      case 3 : System.out.println("You choose Standard-Single");
               System.out.println("**************************");
         System.out.println("Your fixd fee is " + myobj.FixedStanderdSingleRoom);
        
        System.out.println("Parking : Rs ."+myobj.parkingprice);
        System.out.println("AC : Rs ."+myobj.acprice);
        System.out.println("Wifi : Rs ."+myobj.wifiprice);

             System.out.println("");
      System.out.println("");  
        System.out.println("Do you want an additional ? yes/no");
         yesNo = ob.next();
        
         if (yesNo.toLowerCase().equals("yes")) {
     System.out.println("");

            //parking

           System.out.println("Do you want add parking ? yes/no");
           String parking = ob.next();
           
           boolean addParking = myobj.confirmAdditional(parking);
      System.out.println("");

            //Ac

           System.out.println("Do you want add parking ? yes/no");
           String ac = ob.next();
           
           boolean addAc = myobj.confirmAdditional(ac);
      System.out.println("");

            //Wifi
           System.out.println("Do you want add wifi ? yes/no");
           String wifi = ob.next();
           
           boolean addWifi = myobj.confirmAdditional(wifi);
           
      System.out.println("");

           myobj.getChargeStandardFamily(addParking,addAc,addWifi);
           
         }
        
        break;
        
      case 4 : System.out.println("Have a nice day.Bye");
        break;
      default : System.out.println("Erorr you enter number is outside of the range ");
        break;
      
    }
  }
}