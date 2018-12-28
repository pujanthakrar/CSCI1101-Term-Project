public class Building extends Property{
   
   private int[] rent;
   private int houselevel;
   
   public Building(int p, int pr, String n){
      super(p, pr, n);
      houselevel = 0;
      rent = new int[6];
   }
   
   public void setHouseLevel(int l){houselevel = l;}
   public void setRents(int n, int o, int t, int r, int f, int h){//6 inputs represent the 6 levels of rent
      rent[0] = n;//base rent
      rent[1] = o;//1 house
      rent[2] = t;//2 houses
      rent[3] = r;//3 houses
      rent[4] = f;//4 houses
      rent[5] = h;//hotel
   }
   public int getHouseLevel(){return houselevel;}
   
   //get rent checks if owner has all of set before returning value of rent
   public int getRent(){
      if(houselevel > 0)
         return rent[houselevel];
      else if(this.getOwner().hasAllType(this.getPosition()))
         return rent[0]*2;
      else
         return rent[0];
   }
}
  
   
