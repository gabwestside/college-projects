// Fig. 10.6: HourlyEmployee.java

public class HourlyEmployee extends Employee 
{
   private double wage; 
   private double hours; 

   public HourlyEmployee( String first, String last, String ssn, 
      double hourlyWage, double hoursWorked )
   {
      super( first, last, ssn );
      setWage( hourlyWage );
      setHours( hoursWorked ); 
    }

   //m�todos sets e gets
   public void setWage( double hourlyWage )
   {
      wage = ( hourlyWage < 0.0 ) ? 0.0 : hourlyWage;
   } 

   public double getWage()
   {
      return wage;
   }

   public void setHours( double hoursWorked )
   {
      hours = ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) ) ?
         hoursWorked : 0.0;
   }

   public double getHours()
   {
      return hours;
   }

   // calcula os rendimentos; sobrescreve o metodo abstrato em Empregados (Employee)
   @Override
   public double earnings()
   {
      if ( getHours() <= 40 ) 
         return getWage() * getHours();
      else
         return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
   }

   // return a representa��o de String para o objeto HourlyEmployee
   @Override
   public String toString()
   {
      return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f", 
         super.toString(), "hourly wage", getWage(), 
         "hours worked", getHours() );
   } 
} 
