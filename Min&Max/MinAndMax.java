public class MinAndMax{
    public static void main(String[] args) {
        MaximumTest<Integer> intObj = new MaximumTest<>(10, 20, 30);

        System.out.println("Maximum Integer: " + intObj.testMaximum());

        MaximumTest<Float> floatObj =new MaximumTest<>(11.2f, 54.3f, 8.7f);

        System.out.println("Maximum Float: "  + floatObj.testMaximum());

        MaximumTest<String> stringObj = new MaximumTest<>("Apple", "Peach", "Banana");

        System.out.println("Maximum String: "+ stringObj.testMaximum());
    }
}
 class MaximumTest<T extends Comparable<T>>{
  T x;
   T y;
   T z;
   public MaximumTest(T x, T y, T z) {
    this.x = x;
    this.y = y;
    this.z = z;
   }
   public T testMaximum(){
    return testMaximum(x,y,z);
   } 
   public static <T extends Comparable<T>> T testMaximum(T x, T y, T z){
        T greatest=x;
        if(y.compareTo(greatest)>0){
           greatest=y;
        }
        if(z.compareTo(greatest)>0){
           greatest=z;
        }
        return greatest;
   }
 }   
