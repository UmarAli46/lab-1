import java.util.*;
 class cpn program {
    public static void main(String[] args) throws Exception {
        double a;
        double b;
        int c;
        cpn;
        System.out.println("enter matric percentage ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("enter intermediate percentage ");
        Scanner obj=new Scanner(System.in);
        b=obj.nextInt();
        System.out.println("enter test marks ");
        Scanner obj=new Scanner(System.in);
        c=obj.nextInt();
        cpn=(a/100)*10+(b/100)*30+(c\100)*60;
        System.out.print("the cpn is"+cpn);
    }
}
