public class CallBy_ {

 int value;

    CallBy_(int value){
     this.value = value;
    }

    private static void swap(CallBy_ a,CallBy_ b){
        int temp = a.value;
        a.value = b.value;
        b.value =temp;

    }

    public static void main(String args[]){
        CallBy_ a = new CallBy_(1);
        CallBy_ b = new CallBy_(2);

        System.out.println("a=>" + a.value);
        System.out.println("b=>" + b.value);

        swap(a,b);

        System.out.println("a=> " + a.value);
        System.out.println("b=>" +  b.value);




    }


}
