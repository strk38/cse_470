public class Task12 {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        B b2 = new B(b1);
        b1.methodA(1, 2);
        b2.methodB(3, 2);

    }
}

class A{
    public static int temp = 4;
    public int sum;
    public int y;
    public A(){
        y = temp - 2;
        sum = temp + 1;
        temp-=2;
    }
    public void methodA(int m, int n){
        int x = 0;
        y = y + m + (temp++);
        x = x + 1 +  n;
        sum = sum + x + y;
        System.out.println(x + " " + y+ " " + sum);
    }
}
class B extends A {
    public static int x;
    public int sum;
    public B(){
        y = temp + 3 ;
        sum = 3 + temp + 2;
        temp-=2;
    }
    public B(B b){
        sum = b.sum;
        x = b.x;
        b.methodB(2,3);
    }
    public void methodB(int m, int n){
        int  y = 0;
        y = y + this.y;
        x = this.y + 2 + temp;
        methodA(x, y);
        sum = x + y + sum;
        System.out.println(x + " " + y+ " " + sum);
    }
}

