package objectorienteddesign;

public class singleResponsibility {
 public static void main(String[] args){

  double ratio1 = calRatio(52,11);
  double ratio2 = calRatio(30,27);

  System.out.printf("Ratio for 52 chainring and 11 cog is %1.2f \n",ratio1);
  System.out.printf("Ratio for 30 chainring and 27 cog is %1.2f \n",ratio2);

 }

 public static double calRatio(int chainring,int cog){
  return (double)chainring/(double)cog;
 }

}