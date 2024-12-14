class a{
    public void r()
    {
        System.out.println("Hii malli");
    }
    }
    class b extends a
    {
        public void r1()
        {
        super.r();
        System.out.println("hello anu");
        }
    }
    public class superkey
    {
        public static void main(String[]args){
            b n=new b(); 
            n.r1();
            }
    }