public class RailRoad extends Property{
   
   private static int[] rents = {25, 50, 100, 200};
   private int rent;
   
   public RailRoad(int p, int pr, String n){
      super(p, pr, n);
      rent = 25;
   }
   
   public int getRent(){
      this.setRent();//updates rent if needed
      return rent;
   }
   public void setRent(){
      rent = rents[this.getOwner().getRails() -1];//Picks rent acording to number of railroads owned, to be run when getting rent
   }
}
