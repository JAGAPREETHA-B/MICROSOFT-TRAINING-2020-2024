
class Main {
  public static void triangleArea(int[] x,int[] y){
  int mul= Math.abs(x[0]*(y[1]-y[2]) + x[1]*(y[2]-y[0])+ x[2]*(y[0]-y[1]));
    float area = mul/2;
  System.out.println("Area of a triangle: " +area);
  }
  public static void main(String[] args) {
    //Scanner sc=new Scanner(System.in);
    int[] x={5,6,8};
    int[] y={3,9,10};
    triangleArea(x,y);
  }
}
