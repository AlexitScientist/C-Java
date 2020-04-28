
public class atom {

    public int value;          // data          (data)
    public atom beck;          // ( -> )
    public atom next;          // ( <- )

    public static int count;   // sum pointer;

    public atom app;           // (up)
    public atom dow;           // (down)

    public atom s1;            //
    public atom s0;            //

    public atom(){
        ++count;
    value = 0;
    beck = null;
    next = null;
    app = null;
    s1 = null;
    dow = null;
    s0 = null;
    }
    public atom(int i){
      this();
    value = i;

    }

}
