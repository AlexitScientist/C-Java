
public class added {
// lambda 
    private int i=12;
      public interface Innernews {
        int chenge(int a, int b);

      }

      public interface Innern{
        void can();
      }

//--------------this overrade
      public int operater(int a, int b, Innernews on) {
        return on.chenge(a, b);
      }

      public void operater( Innern on) {
         on.can();
      }
//--------------this  function
      Innern day = () -> {
        System.out.println("Some text");
        i=i+12;
        System.out.println(i);
      };
//----------------this returned int value

      Innernews op = (x, y)-> {int z = 0;
        while (z<10){
          z++;
          System.out.println(" some operation " + (x+y-z) +" and " +z);
        }
        return z; };

      Innernews ou = (x, y)-> {return x-y ;};
//----------------------










}