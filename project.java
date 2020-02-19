import java.nio.ByteBuffer;
class Simple{
public static void main(String[] args) {
//    Создали массив типа Byte с K эллементами 
    int K=20;
    byte[] ArrByte = new byte[K];
    Byte[] ArrByteBig = new Byte[K];
    Integer[] ArrInt = new Integer[ArrByte.length];
    int[] ArrIntMin = new int[ArrByte.length];
    String[] ArrString = new String[K];
   
    //
      for (int i = 0; i < ArrInt.length; i++) {
    ArrByteBig[i] = (Byte)ArrByte[i];         
    }


    // проверка теории
      for (int i = 0; i < ArrInt.length; i++) {
        ArrIntMin[i] = (int)ArrByteBig[i];         
    }
    //test test



      for (int i = 0; i < ArrInt.length; i++) {
    ArrInt[i] = (Integer)ArrIntMin[i];         
    }

    for (int i = 0; i < ArrInt.length; i++) {
       // ArrString[i] = (String)ArrInt[i];         
    }
      


}
}