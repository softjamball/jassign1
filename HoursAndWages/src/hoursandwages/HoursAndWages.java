
package hoursandwages;


public class HoursAndWages {
    
    public static void main(String[] args) {
     
      
        int hoursWorked = 50;
        int hourlyRate = 10;
        int totalPay;
        float overtimePay;
        
        System.out.println( "Enter hours worked: " );
        
        
        if (hoursWorked > 40) {
            overtimePay = (float) ((hoursWorked - 40) * (hourlyRate * 1.5));
        }
        else {
            //totalPay = hoursWorked * hourlyRate;
            overtimePay = 0;
        }                
        
        totalPay = hourlyRate * hoursWorked;
        
        //overtimePay = totalPay + overtimePay;


        System.out.println( "Gross Pay: " + (totalPay) );
        System.out.println( "Overtime Pay: " + overtimePay);
        
        
        
        
    }

    
    }
    

