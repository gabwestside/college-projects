// Fig. 10.5: SalariedEmployee.java

public class SalariedEmployee extends Employee 
{
   private double weeklySalary;

   public SalariedEmployee( String first, String last, String ssn, 
      double salary )
   {
      super( first, last, ssn ); 
      setWeeklySalary( salary ); 
   } 

   // m�todos sets e gets
   public void setWeeklySalary( double salary )
   {
      weeklySalary = salary < 0.0 ? 0.0 : salary;
   } 

   public double getWeeklySalary()
   {
      return weeklySalary;
   } 

   // calcula os rendimentos; sobrescreve o metodo abstrato em Empregados (Employee)
   @Override
   public double earnings()
   {
      return getWeeklySalary();
   } 
   // return a representa��o de String para o objeto SalariedEmployee
   @Override
   public String toString()
   {
      return String.format( "salaried employee: %s\n%s: $%,.2f", 
         super.toString(), "weekly salary", getWeeklySalary() );
   } 
} 
