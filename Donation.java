class Donation
 {
  public static void main(String[]args)
  {
    int hemoglobin = 12;
    int age =38;
    char diseases = 'N';
    char drugsANDalcohol ='N';
   
    if(age>=18&&age<=60)
      {
       if(hemoglobin>=13)
         {
          if(diseases=='N')
            {
             if(drugsANDalcohol=='N')
               {
                System.out.println("you are not allow because you are drunk.");
               }
             else
               {
                 System.out.println("OK, you are allow.");
               }
            }
         else 
            {
               System.out.println("you are not allow beacause you have disease");
            }
         }
      else
         {
         System.out.println("your hemoglobin is less than 13");
         }
     }
    else
     {
      System.out.println("your age is not allowed");
     }
  }
     //your hemoglobin is less than 12
}
   
            
         