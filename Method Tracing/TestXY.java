public class TestXY{
     public static void main(String args[]){
        X x= new X();
       Y y = new  Y();
       y.m2();
       x.m1();
       y.m1();
     x = y;// parent pointing to object of child
     x.m1() ;
     y.a=10;
   }

}
