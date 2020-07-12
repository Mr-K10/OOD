package objectorienteddesign;

public class singleResponsibility {
 public static void main(String[] args){

  double ratio1 = calRatio(52,11);
  double ratio2 = calRatio(30,27);

  System.out.printf("Ratio for 52 chainring and 11 cog is %1.2f \n",ratio1);
  System.out.printf("Ratio for 30 chainring and 27 cog is %1.2f \n",ratio2);

  gear bGear = new gear(52,11,26,1.5);
  gear sGear = new gear(30,27,24,1.25);

  System.out.printf("Big gear Ratio %1.2f \n",bGear.ratio());
  System.out.printf("Small gear Ratio %1.2f \n",sGear.ratio());

  System.out.printf("Big gear gear inches %1.2f \n",bGear.gear_inches());
  System.out.printf("Small gear gear inches %1.2f \n",sGear.gear_inches());

 }

 public static double calRatio(double chainring,double cog){
  return chainring/cog;
 }
}

class gear{
 private double chainring;
 private double cog;
 private double rim;
 private double tire;

 public gear(double chainring,double cog){
  this.chainring = chainring;
  this.cog = cog;
 }

 public gear(double chainring,double cog,double rim,double tire){
  this(chainring,cog);
  this.rim = rim;
  this.tire = tire;
 }

 double ratio(){
  return 1.0*chainring/cog;
 }

 double gear_inches(){
  return ratio()*(rim + (tire*2.0));
 }
}

