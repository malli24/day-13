
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
    class c extends b
    {
        public void r()
        {
            System.out.println("hii akka");
        }
    }
   public class multilevel
    {
        public static void main(String[]args){
            c f=new c(); 
            f.p1(); 
            f.r();
            }
    }