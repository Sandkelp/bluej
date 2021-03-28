import java.util.ArrayList;

import java.lang.Math;


public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount;
   }
   
   public double avgLoan()
   {
     double total = totalAmount(); 
     double average = total / data.size();   
     return average; 
   }
   public double largestLoan()
   {
    double largest = data.get(0).getLoanAmount(); 
    for(int i = 0; i < data.size(); i++)
    {
      if(largest < data.get(i).getLoanAmount())   
     {
        largest = data.get(i).getLoanAmount();
     }
    }
    return largest; 
   }
   public double smallestLoan() 
   {
    double smallest = data.get(0).getLoanAmount(); 
    for(int i = 0; i < data.size(); i++)
    {
      if(smallest > data.get(i).getLoanAmount())   
     {
        smallest = data.get(i).getLoanAmount();
     }
    }
    return smallest; 
   }
   
   public String largestLoanCountry(){
       double max = data.get(0).getLoanAmount(); 
       String country = "";       
    for(int i = 0; i < data.size(); i++)
    {
      if(max < data.get(i).getLoanAmount())   
     {
        max = data.get(i).getLoanAmount();
        country = data.get(i).getCountry();
     }
    }
    return country;
   }
   
   public String smallestLoanCountry(){
       double min = data.get(0).getLoanAmount(); 
       String country = "";       
    for(int i = 0; i < data.size(); i++)
    {
      if(min > data.get(i).getLoanAmount())   
     {
        min = data.get(i).getLoanAmount();
        country = data.get(i).getCountry();
     }
    }
    return country;
    }
   
   
   
   
   public double avgDaysToFund(){
       int sum = 0;
       for(int i = 0; i < data.size(); i++) {
         sum = sum + data.get(i).getDaysToFund();
      }
       double avg = sum / data.size();
       return avg;
    }
    public double largestLoanKenya(){
        double max = Double.MIN_VALUE;
        for(int i = 0; i < data.size(); i++) {
        if (data.get(i).getCountry().equals("Kenya") && data.get(i).getLoanAmount() > max){
           max = data.get(i).getLoanAmount();
        }
        }
        return max;
    }
   
   public double avgLoanPhilippines(){
       double sum = 0.0;
       int count = 0;
       for(int i = 0; i < data.size(); i++) {
        if (data.get(i).getCountry().equals("Philippines")){
           sum = sum + data.get(i).getLoanAmount();
           count++;
        }
        }
       double avg = sum / count;
       return avg;
    }
    
    public String longestToFundCountry(){
        double max = Double.MIN_VALUE; 
       String country = "";       
    for(int i = 0; i < data.size(); i++)
    {
      if(max < data.get(i).getDaysToFund())   
     {
        max = data.get(i).getDaysToFund();
        country = data.get(i).getCountry();
     }
    }
    return country;
   }
   public String mostLoansFunded(){
       int kenyaCount = 0;
       int salvCount = 0;
       String country = "";       
    for(int i = 0; i < data.size(); i++)
    {
      if(data.get(i).getCountry().equals("Kenya"))   
     {
        kenyaCount++;
     }
     else if(data.get(i).getCountry().equals("El Salvador")){
         salvCount++;
      }
     
    }
    if (kenyaCount > salvCount){
       country = "Kenya";
     }
    else if (kenyaCount < salvCount){
       country =  "El Salvador";
     }
     return country;
    }
    
    public double variance(){
        double sum = 0.0;
        double var = 0.0;
       int count = 0;
       for(int i = 0; i < data.size(); i++) {
           sum = sum + data.get(i).getLoanAmount();
           count++;
        }
       double avg = sum / count;
       for(int i = 0; i < data.size(); i++) {
           var = var + Math.pow((data.get(i).getLoanAmount() - avg), 2);
        }
       return (double)(var / count);
    }
    
    public double standardDeviation(){
        double sum = 0.0;
        double var = 0.0;
        double dev = 0.0;
       int count = 0;
       for(int i = 0; i < data.size(); i++) {
           sum = sum + data.get(i).getLoanAmount();
           count++;
        }
       double avg = sum / count;
       for(int i = 0; i < data.size(); i++) {
           var = var + Math.pow((data.get(i).getLoanAmount() - avg), 2);
        }
        
        dev = Math.sqrt((double)(var / count));
        return dev;
        
    }
    public boolean empiricalRule(){
        return true;
    }
    

}






