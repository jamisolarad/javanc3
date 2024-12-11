package chapter2;

public class LoopsLesson {
    public static void main(String[] args) {
         byte a = 1;
        while(a<=10)
        System.out.println("a = " +a--);
        System.out.println("End of Program");

        ROW_TABLE: for(int p = 1; p<=10; p++)
        COL_TABLE:    for(int l = 1;l<=10; l++){
                            if(l==5)
                            break COL_TABLE;
                            System.out.println(1*p+"\t");
        }
                         System.out.println();     
      
    
    }
    
}
