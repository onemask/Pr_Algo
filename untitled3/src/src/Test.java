public class Test {
 public static void main (String args[]){

    int n=1,b=1;
    double s =1;
    double h;
    while (true){
        n = n*b;
        h = (double)1/n;
        if(b%2==1) s= s+h; else s=s-h;
        b=b+1;
        if(b>10)break;

    }
    System.out.println(s);

}
}