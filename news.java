
 class news{
    public static int count_com;
    public static String st ="";
    public static stack_ip liker;

    public static int plaser = 10;
    public static java.util.Scanner in;
    public static gen maney;
    public static java.util.ArrayList<String> Command ;
      
  public static void comm(){
    Command = new java.util.ArrayList<String>();
    int c_sum = 0;

    eee:
    while(true){
      System.out.println("Put :");
      st = in.nextLine();
      
      switch (st) {
        case "end":
        System.out.println("comand entry"+ c_sum);
        break eee;
      
        default:
        ++c_sum;
        Command.add(st);
          break;
      }
    }
    run();
  }

  public static void run(){
    maney = new gen(0);

    for( String coma : Command ){
      System.out.println(coma);
      
      switch (coma){
 case "1":
        maney.add(1);
        maney.add(2);
        maney.add(3);
        maney.add(4);
        maney.add(5);
        maney.print();
    break;

 case "up":
        maney.up();
        maney.print();
    break;

 case "down":
        maney.down();
        maney.print();
    break;

 case "add":
       ++plaser;    
       maney.add(plaser);
       maney.print();
    break;

 case "P61":
      
      while(maney.beck != null){
        maney.down();
        maney.print();
 }
    break;

 case "P62":
      while(maney.next != null){
      maney.up();
      maney.print();
      }
    break;

 case "P6":
      maney.to_down();
      maney.print();
    break;

  case "P":
      maney.to_upp();
      maney.print();
    break;

  case "del":
      maney.del();
    break;

  default:
        System.out.println("Bad comand");
        break;
      }

    }
    
  }
    public static void main(String[] args ) // not throws IoException
    {
       added cans = new added();  //interface and lambda
       liker = new stack_ip();    //like select and more;
      in = new java.util.Scanner(System.in);
        
      end:
        while ( true ){
          System.out.println("Wariant runing: ");
          st = in.nextLine();

          if(st != "end"){
           ++count_com;
          }

          switch (st) {

          case "end":
            System.out.println(" END \n comand :" + count_com);
              break end;
          case "3":
               cans.operater(cans.day);
              break;
          case "5":
                System.out.println("Run =)");
                comm();
              break;
          case "28":
                System.out.println( cans.operater(12 , 3 , cans.op ) );
              break;

          case "300":
            liker.appcors("some texts maybe nothing bad but text","texts");
          break;
               
          default:
            System.out.println("ERROR");
              break;
          }


        }


    }

}

      
      /*
        gen<Integer> can = new gen<Integer>();  //template 
        can.set(12);
        can.print();
        */
            // list<Integer> cun = new list<Integer>();