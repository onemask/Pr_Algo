public class Vingle {


    static class Plus{
        int a,b;
        public  Plus(int a,int b){
            this.a = a;
            this.b = b;
        }
        public int get_Plus(){
            return a+b;
        }
    }

    public static void main(String []args){
        Plus a = new Plus(3,5);
        Plus b = new Plus(3,5);
        Plus c = a;

        System.out.println(a.hashCode());
        System.out.println(c.hashCode());
        System.out.println(b.hashCode());

        if(a.equals(c))
            System.out.println("true");
        else
            System.out.println("false");

    }

}
