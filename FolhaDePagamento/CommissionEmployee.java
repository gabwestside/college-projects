// Fig. 10.7: CommissionEmployee.java

public class CommissionEmployee extends Employee 
{
   private double grossSales; 
   private double commissionRate; 

   // construtor 5 arg
   public CommissionEmployee( String first, String last, String ssn, 
      double sales, double rate )
   {
      super( first, last, ssn );
      setGrossSales( sales );
      setCommissionRate( rate );
   } 

   // m�todos sets e gets
   public void setCommissionRate( double rate )
   {
      commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
   }

   public double getCommissionRate()
   {
      return commissionRate;
   } 

   public void setGrossSales( double sales )
   {
      grossSales = ( sales < 0.0 ) ? 0.0 : sales;
   } 

   public double getGrossSales()
   {
      return grossSales;
   } 
   
// calcula os rendimentos; sobrescreve o metodo abstrato em Employee
   @Override
   public double earnings()
   {
      return getCommissionRate() * getGrossSales();
   } // end method earnings

   // return a representa��o de String para o objeto CommissionEmployee
   @Override
   public String toString()
   {
      return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f", 
         "commission employee", super.toString(), 
         "gross sales", getGrossSales(), 
         "commission rate", getCommissionRate() );
   } 
}
