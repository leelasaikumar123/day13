public class MinAndMax{
    public static void main(String[] args) {
       Integer a=20;
       Integer b=90;
       Integer c=100; 
       findMax(a, b, c);
    }
    public static void findMax(Integer num1,Integer num2,Integer num3){
        Integer greatest=num1;
        if(num2.compareTo(greatest)>0){
           greatest=num2;
        }
                if(num3.compareTo(greatest)>0){
           greatest=num3;
        }
        System.out.println(greatest);
    }
}