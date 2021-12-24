// Fig. 10.4: Employee.java

public abstract class Employee 
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;

   // construtor com 3 argumentos
   public Employee( String first, String last, String ssn )
   {
	   setFirstName( first );
	   setLastName(  last );
	   setSocialSecurityNumber( ssn );
	   /*
	  firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;*/
   } 

   // m�todos sets e gets
   public void setFirstName( String first )
   {
      firstName = first; 
   } 

   public String getFirstName()
   {
      return firstName;
   } 

   public void setLastName( String last )
   {
      lastName = last; 
   } 

   public String getLastName()
   {
      return lastName;
   }

   public void setSocialSecurityNumber( String ssn )
   {
      socialSecurityNumber = ssn; 
   }

   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   }

   // m�todo sobrescrito
   @Override
   public String toString()
   {
      return String.format( "%s %s\nsocial security number: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber() );
   } 

   // m�todo abstratic que deve ser sobrescrito pela subclasse para ser concreto
   public abstract double earnings(); 
}
