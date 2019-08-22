public class LatihanSoal7 {
    public static void main(String[] args){
        int x = 12;
        int y = 20;
        
        int z;
        z = x | y;
        System.out.println("Hasil Operasi Bitwise OR: " + z);
        
        z = x & y;
        System.out.println("Hasil Operasi Bitwise AND: " + z);
        
        z = x ^ y;
        System.out.println("Hasil Operasi Bitwise XOR: " + z);
        
        z = ~x;
        System.out.println("Hasil Operasi Bitwise NOT: " + z);
        
        z = x << 3;
        System.out.println("Hasil Operasi Bitwise Shift Left: " + z);
        
        z = y >> 2;
        System.out.println("Hasil Operasi Bitwise Shift Right: " + z);
    }
}
