package chapter2;

// public class CompareValues {
//     public static void main(String[] args) {
            //  int x = 0;
            //  while(x++ < 10) {}
            //  String message = x > 10 ? "Greater than" : false;
            //  System.out.println(message+","+x);
             

            public class ArithmeticSample {
                  public static void main(String[] args) {
                         final char a = 'A', d = 'D';
                         char grade = 'B';
                         switch(grade) {
                         case a:
                         case 'B': System.out.print("great");
                         case 'C': System.out.print("good"); break;
                         case d:
                         case 'F': System.out.print("not good");
                         }
                  }
                  
}
