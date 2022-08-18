//IT21190216

class RoomChargeCalculator {

  public static int parkingprice = 200;
  public static int tvprice = 200;
  public static int kitchenprice = 1000;
  public static int wifiprice = 100;
  public static int balconeyprice = 500; 
  public static int acprice = 100;
  public static int kitchenprice1 = 500;
  public static int gardenprice = 200;

  public static int FixedDulexRoom = 5000;
  public static int FixedstanderdfamilyRoom = 3000;
  public static int  FixedStanderdSingleRoom = 2000;
  
  public static int getcost(boolean action, int price){
    if(action == true){
      return price;
    }
    else{
      price = 0;
      return price;
    }
  }
  
  public static boolean confirmAdditional(String add){
    boolean confirm;
    if(add.toLowerCase().equals("yes")){
      confirm = true;
    }else {
      confirm = false;
    }
    return confirm;
  }
  
  public static void getchargeDeluxDouble(boolean balconey, boolean parking, boolean tv, boolean kitchen , boolean wifi ){

   double getbalconeyprice = getcost(balconey,balconeyprice);
   double getparkingprice = getcost(parking,parkingprice);
   double gettvprice = getcost(tv,tvprice);
   double getkitchenPrice = getcost(kitchen,kitchenprice);
   double getwifiprice = getcost(wifi,wifiprice); 

    double totalPrice = FixedDulexRoom + getbalconeyprice + getparkingprice + gettvprice + getkitchenPrice + getwifiprice;

  System.out.println("Total balance is : "+totalPrice);
  }

  static void getChargeStandardFamily(boolean kitchen,boolean parking, boolean garden){

     double getparkingprice = getcost(parking,parkingprice);
     double getgardenprice = getcost(garden,gardenprice);
     double getKitchenprice = getcost(kitchen,kitchenprice1);

    double totalPrice = FixedstanderdfamilyRoom +  getparkingprice + getgardenprice + getKitchenprice ;
    System.out.println("Total balance is : "+totalPrice);
    
  }

   static void getChargeStandardsingle(boolean wifi,boolean ac,boolean parking){

     double getparkingprice = getcost(parking,parkingprice);
     double getacprice = getcost(ac,acprice);
     double getwifiprice = getcost(wifi,wifiprice);

     double totalPrice = FixedStanderdSingleRoom +  getparkingprice + getacprice + getwifiprice ;
     System.out.println("Total balance is : "+totalPrice);
  }
}