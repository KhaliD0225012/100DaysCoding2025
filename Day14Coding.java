package day14coding;

public class Day14Coding {

    public static void main(String[] args) {
       
        String data1 = "100";
        int dataInt = Integer.parseInt(data1)*2;
        byte dataByte = Byte.parseByte(data1);
        short dataShort = Short.parseShort(data1);
        long dataLong = Long.parseLong(data1)*3;
        
        float dataFloat = Float.parseFloat(data1)/3;
        double dataDouble = Double.parseDouble(data1)/6;
        
        char dataChar = data1.charAt(0);
        
        String data2 = "true";
        boolean dataBoolean = Boolean.parseBoolean(data2);
        
        System.out.println("String\t\t: " + data1);
        System.out.println("Byte\t\t: " + dataByte);
        System.out.println("Short\t\t: " + dataShort);
        System.out.println("Integer\t\t: " + dataInt);
        System.out.println("Long\t\t: " + dataLong);
        System.out.printf("Float\t\t: %.3f\n", dataFloat);
        System.out.printf("Double\t\t: %.3f\n", dataDouble);
        System.out.println("Character\t: " + dataChar);
        System.out.println("Boolean\t\t: " + dataBoolean);
        
        
        
    }
    
}
