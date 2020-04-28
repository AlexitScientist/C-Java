public class gen {

    public atom beck;       //beck position     ( -> )
    public atom next;       //next position     ( <- )

    public atom it;         //this position     (values contain)

    public atom app;        //lvl up position    ( A )
    public atom dow;        //lvl down position  ( V )

    public atom s1;         // line pointer        ()
    public atom s0;         // line pointer        ()

   // ----- constract data
    public gen(){
        // 1-elem;
        System.out.println( "born spider");
        it = new atom();
        this.next = null;
        this.beck = null;
        it.beck = null ;
        it.next = null ;
    }

    public gen(int i){
        // 
        System.out.println( "born spider");
        it = new atom(i);
        this.next = null;
        this.beck = null;
        it.beck = null ;
        it.next = null ;
    }
//----------------construct datas pointer ------------

    //input or append element from this position  (1-next . 2- beck . 3 - into)
    public void add(int i){
        if (this.next == null ){

        this.next = new atom();     
        next.beck = it;
        next.next = null;
        next.value = i;
        it.next = this.next;
        up();

        }else{
            if (this.beck == null){

                this.beck = new atom();
                beck.next = it;
                beck.beck = null;
                beck.value = i;
                it.beck =this.beck;
                down();

            }else{

                atom over = new atom();
                // create struct (upper )-next


                over.beck = it.beck;
                over.next = it;

                next.beck = it;
                  it.beck = over;
                beck.next = over;

                over.value = i;
                
                next = it;
                it = over;
                beck = over.beck;
                
            }
        }
    }
  //----------------Destract datas pointer ------------
    public void del(){
        if (next == null && beck ==null ){
            it.value = 0 ;
            return;
        }

        if (next == null){
            beck.next = null;
            it = beck;
            beck = it.beck;
            return;
        }
        if(beck == null){
            next.beck = null;
            it = next;
            next =it.beck;
            return;
        }
        next.beck = beck;
        it = next;
        beck.next = next;
        next = next.next;
        return;
    }

    public void lv_dow(){
        if (it.app == null){

        }else{

        }

    }

    // lvls lift
    public void lv_ups(){
        if (app != null){
        dow = it;
        app = it.app;
        it  = app;

        beck = it.beck;
        next = it.next;
        }
        }

    public void lv_downs(){
            if (dow != null){

            app = it; 
            it  = dow;
            dow = it.dow;
            beck = it.beck;
            next = it.next;
            }
        }

    //lvl data update; 
    public void lv_up(){
        if (app != null){
            go_up(); 
        }
            app = new atom();

            app.value = it.value; 

            app.dow = it;
            it.app = app;
            it = app;
            dow = it;
            app = null;
            // area
            beck = app.beck;
            next = app.next;

    }
    //go to upper element
    public void go_up(){
     while (app != null){
        dow = it;
        app = it.app;
        it  = app;
        
        beck = it.beck;
        next = it.next;
        }
        

    }


    public void soc(atom a , atom c){
        if(it.beck == null && it.next == null){
            //up areas it
            it.beck = a;
            it.next = c;

            // chenged neibor)
            if(c.beck == null){
            c.beck = it;
            }else{

            }

            if (a.beck == null){
            a.next = it;
            }else{

            }

        }






    }
    //--------------------position chenger-----------------
// up to list pozition.
    public void up(){
        if(next !=null){
        beck = it; //
        it = next;
        next = it.next;
        }else{
            System.out.println( "it head");   
        }

    }
//down to list pozition.
    public void down(){
        if(beck!=null){
        next = it;
        it = beck;
        beck = it.beck;
        }else{
            System.out.println( "it beck");  
        }
    }

    // Output list pos.
    public void print(){
        System.out.println( "\n");
        if( next != null ){
        System.out.println( "next      " + next.value);
        }

        if( it != null ){
            System.out.println( "   ____it_____   " + it.value);
        }

        if( beck != null ){
        System.out.println( "beck      " + beck.value);
        }

        if( app != null ){
            System.out.println( "app_____   " + app.value);
        }



    }

    // GO TO next OR prew date
    public void to_down(){
        while(beck!=null){
            next = it;
            it = beck;
            beck = it.beck;
        }
    }
    public void to_upp(){
        while (next !=null){
            beck = it; 
            it = next;
            next = it.next;
            }

    }



}
