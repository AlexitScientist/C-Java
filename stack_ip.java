

public class stack_ip {

   private String folder ;
   private int count = 0;

   //set new text
   public void set_arg( String value ){
   this.folder = value;
   this.count = folder.length();
   }

   // finded eqwals character in text
   public Boolean compare(char value){
   int i = this.count ;
   while (i != 0){
      i--;
     if ( folder.charAt(i) == value){
        return true;
     }
     
   }
   return false;

   }

   // print stat operand
   public void stats(){
      System.out.println("Values : " + this.folder );
      System.out.println("Lenght : " + this.count);
   }
 
   //find size and eqwals
   public void appcor( String arg1 , String arg2 ){
      int state1 = arg1.length() - 1;
      int state2 = arg2.length() - 1;
   if ( corelates(  arg1 , state1 , arg2 , state2 ) ){
      System.out.println("yap");
   }else{
      System.out.println("noop");
   }

   }

   ////find eqwals
   public Boolean corelates( String arg1 ,int state1 ,String arg2 ,int state2 ){
      
      int status1 = state1 ;
      
      while (true){
         
         Boolean status2 = status(status1, state2) ;

         if (status2){
   
         int position = liked( arg1 , status1 , arg2 ,state2 );

         System.out.println(position);

            if ( position == 0){
            status1 = status1- state2;
            
            return true; 

            }else{
            status1--; 
            }
         }else{

         return false;
         }
       }
   }


   public Boolean status (int state1,int state2){  
      System.out.println("range1 : " + (state1 + 1) );
    
         if( (state2 != 0 ) && (state1 >= state2) ){
            return true;
         }else{
            return false;
            
         }
   }
   // How long eqwals this dates 
   public int liked (String arg1 ,int state1 ,String arg2 ,int state2 ){
    
      System.out.println("character : " + arg1.charAt(state1) +" and "+ arg2.charAt(state2) );

      if ( arg1.charAt(state1) == arg2.charAt(state2) ){
            
         if(state2 == 0){
         return 0;
               
         }else {
         return liked(arg1 , state1-1 , arg2 ,state2-1);
         }

         }else{
   
      return state2 + 1 ;
      }  
   }

   // Overrade 
   public int Sub_liked (String arg1 ,int state1 ,String arg2 ,int state2 ){
      int i = 0;
      int index = 0; 

      int iter = state2 ;
      int n ;

      Boolean trust = true;

      while (trust){

         if ( iter == 0){
             trust = false;
             }

         n = iter - liked ( arg1 , state1 , arg2 , iter );

         if (n > i){

         i =  n;
         index = iter + 1; 

         }

         iter--; 
      }
      if(i==0){
         System.out.println("index " + index + " Eqwals " + i);
      }else{
         System.out.println("index " + index + " Eqwals " + (i+1));
      }
      return i;
   }

   // find eqwals and lvl eqwals
   public Boolean corelatest( String arg1 ,int state1 ,String arg2 ,int state2 ){
    
      int status1 = state1 ;
    
      while (true){
         
         Boolean status2 = status(status1, state2) ;

         if (status2){

         int position = state2 - Sub_liked( arg1 , status1 , arg2 ,state2 );

            System.out.println (position);

            if ( position == 0){
            status1 = status1- state2;
            System.out.println("Find obsalut eqwals" );
            return true; 

            }else{
               if (position < 4){
                  
                  System.out.println("Find " + position + " eqwals" );
               }
            status1--; 
            }
         }else{

         return false;
         }
       }
   }
   // size and find any eqwals line
   public void appcors( String arg1 , String arg2 ){
      int state1 = arg1.length() - 1;
      int state2 = arg2.length() - 1;
      System.out.println ("im find " + arg2);
      System.out.println ("From " + arg1);
   if ( corelatest(  arg1 , state1 , arg2 , state2 ) ){

      System.out.println("yap");
   }else{
      System.out.println("noop");
   }

}


}