import java.nio.ByteBuffer;
class Simple{
public static void main(String[] args) {
//    Создали массив типа Byte с K эллементами 
    int K=20;
    byte[] ArrByte = new byte[K];
    Integer[] ArrInt = new Integer[ArrByte.length];
    Byte[] ArrByteBig = new Byte[K];
    //
    for (int i = 0; i < ArrInt.length; i++) {
    ArrByteBig[i] = (Byte)ArrByte[i];         
    }

}
}