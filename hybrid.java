class gp
{
    public void r()
    {
        System.out.println("Hii im your father");
    }
    }
    class p1 extends gp
    {
        public void r1()
        {
        System.out.println("hello im your daughter");
        }
    }
    interface p2
    {
        void r2();
    }
    class d extends p1 implements p2
    {
        public void r2()
        {
            System.out.println("maheshmalli");
        }
    public void r3()
    {
        System.out.println("akka");
    }
    }
    public class hybrid
    {
        public static void main(String[]args){
            d h=new d(); 
            h.r();
            h.r1();
            h.r2();
            h.r3();
            }
    }