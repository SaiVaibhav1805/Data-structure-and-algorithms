package recursions;

class test{
    int c=0;
    void prin(){
        
        if(c>=5) return;
        System.out.println("Bhavesh");
        c++;
        prin();
    }
}

public class printn {
    
    public static void main(String args[]){

    test t=new test();
    t.prin();

    }
}
