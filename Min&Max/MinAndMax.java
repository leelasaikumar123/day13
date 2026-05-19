public class MinAndMax{
    public static void main(String[] args) {
       Integer a=20;
       Integer b=90;
       Integer c=100; 
       findMax(a, b, c);
       findMax(10.0f,11.0f,12.0f);
       findMax("Leela","Sai","Kumar");
    }
    public static <T extends Comparable<T>> void findMax(T num1,T num2,T num3){
        T greatest=num1;
        if(num2.compareTo(greatest)>0){
           greatest=num2;
        }
                if(num3.compareTo(greatest)>0){
           greatest=num3;
        }
        System.out.println(greatest);
    }


    }
