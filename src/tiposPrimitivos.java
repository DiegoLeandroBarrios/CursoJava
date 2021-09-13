public class tiposPrimitivos {
    public static void main(String[] args) {
        //byte, long, int , short
        byte bytevar = 127;
        System.out.println("bytevar = " + bytevar);
        System.out.println("bits tipo byte:"+ Byte.SIZE);
        System.out.println("bytes tipo byte:"+ Byte.BYTES);
        System.out.println("valor minimo del tipo byte:"+ Byte.MIN_VALUE);
        System.out.println("valor maximo del tipo byte:"+Byte.MAX_VALUE);

        short shortvar = 1000;
        System.out.println("shortbar = " + shortvar);
        System.out.println("bits tipo short:"+ Short.SIZE);
        System.out.println("bytes tipo short:"+ Short.BYTES);
        System.out.println("valor minimo del tipo short:"+ Short.MIN_VALUE);
        System.out.println("valor maximo del tipo short:"+Short.MAX_VALUE);

        int intvar= 5000;
        System.out.println("intvar = " + intvar);
        System.out.println("bits tipo int:"+ Integer.SIZE);
        System.out.println("bytes tipo int:"+ Integer.BYTES);
        System.out.println("valor minimo del tipo int:"+ Integer.MIN_VALUE);
        System.out.println("valor maximo del tipo int:"+Integer.MAX_VALUE);

        long longvar = 100;
        System.out.println("longvar = " + longvar);
        System.out.println("bits tipo long:"+ Long.SIZE);
        System.out.println("bytes tipo long:"+ Long.BYTES);
        System.out.println("valor minimo del tipo long:"+ Long.MIN_VALUE);
        System.out.println("valor maximo del tipo long:"+Long.MAX_VALUE);

        var numeroMaxInt = 2147483647;
        System.out.println("numeroMaxint = " + numeroMaxInt);
        var numeroMaxLong = 2147483648L;
        System.out.println("numeroMaxLong = " + numeroMaxLong);
    }
}
