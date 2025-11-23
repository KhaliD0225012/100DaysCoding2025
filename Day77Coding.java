package day77coding;

public class Day77Coding {

    public static void main(String[] args) {
        
        String nama = "  Marsya Amalia  ";
        
        System.out.println("\n==========");
        System.out.println("Substring");
        for (int i = 0; i < nama.length(); i++) {
            System.out.printf("%2d. %s\n", i, nama.substring(i));
        }
        
        System.out.println("\n==========");
        System.out.println("Replace");
        System.out.println(nama.replace("a", "i"));
        
        System.out.println("\n==========");
        System.out.println("Trim");
        System.out.println(nama.trim());
        
    }
    
}
