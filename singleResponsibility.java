package objectorienteddesign;

public class singleResponsibility {
 public static void main(String[] args){

  double ratio1 = calRatio(52,11);
  double ratio2 = calRatio(30,27);

  System.out.printf("Ratio for 52 chainring and 11 cog is %1.2f \n",ratio1);
  System.out.printf("Ratio for 30 chainring and 27 cog is %1.2f \n",ratio2);

  gear sGear = new gear(52,11);
  gear bGear = new gear(30,27);

  System.out.printf("Small gear Ratio %1.2f \n",sGear.ratio());
  System.out.printf("Big gear Ratio %1.2f \n",bGear.ratio());

 }

 public static double calRatio(int chainring,int cog){
  return (double)chainring/(double)cog;
 }
}

class gear{
 private int chainring;
 private int cog;
 public gear(int chainring,int cog){
  this.chainring = chainring;
  this.cog = cog;
 }
 double ratio(){
  return 1.0*chainring/cog;
 }
}

