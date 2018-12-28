public class Utility extends Property{
   
   private int currentMultiplier;
   private Dice di;
   
   public Utility(int p, int pr, Dice d, String n){//uses dice object from game to get total of last role
      super(p, pr, n);
      currentMultiplier = 4;
      di = d;
   }
   
   public int getRent(){
      if(this.getOwner().getUtility() == 1)//runs method which checks if owner has both
         return di.getTotal()*4;
      else
         return di.getTotal()*10;
   }
}
      
