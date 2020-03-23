
public class App1 {
public static void main(String[] args) {
   short byteValue = 20;
   short shortVAlue = 55;
     int intValue = 888;
     long longVAlue = 23355;
     
     float floatValue = 8843.3f;
     float floatValue2 =(float)99.3;
     double doubleValue= 32.4;
     System.out.println(Byte.MAX_VALUE);
     
     intValue = (int)longVAlue;
   System.out.println(intValue);
   
   doubleValue= intValue;
   System.out.println(intValue);
   
   doubleValue = intValue;
   System.out.println(doubleValue);
   
   intValue = (int)floatValue;
   System.out.println(intValue);
   
   // The following won't work
   // As we expect it to!!
   
   byteValue = (byte)128;
   System.out.println(byteValue);
}
}
