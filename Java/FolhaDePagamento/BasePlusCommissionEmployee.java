// Fig. 10.8: BasePlusCommissionEmployee.java

public class BasePlusCommissionEmployee extends CommissionEmployee 
{
   private double baseSalary; 

   // construtor com seis argumentos
   public BasePlusCommissionEmployee( String first, String last, 
      String ssn, double sales, double rate, double salary )
   {
      super( first, last, ssn, sales, rate );
      setBaseSalary( salary ); 
   } 

   // m�todos sets e gets
   public void setBaseSalary( double salary )
   {
      baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
   } 

   public double getBaseSalary()
   {
      return baseSalary;
   } 

// calcula os rendimentos; sobrescreve o metodo abstrato em CommissionEmployee
   @Override
   public double earnings()
   {
      return getBaseSalary() + super.earnings();
   } 

   // return a representa��o de String para o objeto BasePlusCommissionEmployee 
   @Override
   public String toString()
   {
      return String.format( "%s %s; %s: $%,.2f", 
         "base-salaried", super.toString(), 
         "base salary", getBaseSalary() );
   }   
} 
