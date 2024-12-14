class a{
    public void p1()
    {
        System.out.println("Hii malli");
    }
    }
    class b extends a
    {
        public void r()
        {
        System.out.println("hello anu");
        }
    }
    class c extends a
    {
        public void r1()
        {
            System.out.println("hii akka");
        }
    }
   public class multiple
    {
        public static void main(String[]args){
            c h=new c(); 
            h.p1(); 
            h.r1();
            }
    }