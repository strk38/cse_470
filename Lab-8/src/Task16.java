class FinalT6A{
    public static int temp = 4;
    private int sum;
    private int y = 1;
    public FinalT6A(int x, int p){
        temp+=1;
        y = temp - p;
        sum = temp + x;
        System.out.println(x + " " + y+ " " + sum);
    }
    public void methodA(){
        int x=0, y =0;
        y = y + this.y;
        x = this.y + 2 + temp;
        sum = x + y + methodB(temp, y);
        System.out.println(x + " " + y+ " " + sum);
    }
    public int methodB(int temp, int n){
        int x = 0;
        y = y + (++temp);
        x = x + 3 +  n;
        sum = sum + x + y;
        System.out.println(x + " " + y+ " " + sum);
        return sum;
    }
}

public class Task16 {
    public static void main(String[] args) {
        FinalT6A q1 = new FinalT6A(2,1);
        q1.methodA();
        q1.methodA();

    }
}
