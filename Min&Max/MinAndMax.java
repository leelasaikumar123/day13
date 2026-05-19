public class MinAndMax{
    public static void main(String[] args) {
       Integer a=20;
       Integer b=90;
       Integer c=100; 
       findMax(a, b, c);
       findMax(10.0f,11.0f,12.0f);
       findMax("Leela","Sai","Kumar");
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
        public static void findMax( Float num1,Float num2,Float num3){
        Float greatest=num1;
        if(num2.compareTo(greatest)>0){
           greatest=num2;
        }
                if(num3.compareTo(greatest)>0){
           greatest=num3;
        }
        System.out.println(greatest);
    }
                public static void findMax(String name1,String name2,String name3){
        String greatest=name1;
        if(name2.compareTo(greatest)>0){
           greatest=name2;
        }
                if(name3.compareTo(greatest)>0){
           greatest=name3;
        }
        System.out.println(greatest);
    }
}