package SGP_HybridCalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    void Program() throws IOException {
        int[] skip = {1, 2, 3, 4};
        int c = 1;
        String bin = "", hex = "", oct = "", dec = "";
        String[] heads = {"Decimal", "Binary", "Octal", "Hexa-Decimal"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the corresponding number of your choice whenever asked for.\n1.Decimal (10)\n2.Binary (2)\n3.Octal (8)\n4.Hexa-Decimal (16)");
        System.out.println("********************");
        while (c == 1) {
            System.out.print("You want to convert : ");
            int from = Integer.parseInt(br.readLine());
            System.out.print(heads[from - 1] + " : ");
            String no = br.readLine();

            if (from == 1) {
                if (Integer.parseInt(no) < 0) {
                    System.out.println("INVALID INPUT...!");
                    continue;
                }
            }
            if (from == 2) {
                for (int i = 0; i < no.length(); i++) {
                    if (no.charAt(i) != '0' | no.charAt(i) != '1') {
                        continue;
                    } else {
                        System.out.println("INVALID INPUT...!");
                        return;
                    }
                }
            }
            if (from == 3) {
                if (Integer.parseInt(no) < 0) {
                    System.out.println("INVALID INPUT...!");
                    continue;
                }
            }
            if (from == 4) {
                for (int i = 0; i < no.length(); i++) {
                    if (Character.isDigit(no.charAt(i)) | (no.charAt(i) >= 97 & no.charAt(i) <= 102)) {
                        continue;
                    } else {
                        System.out.println("INVALID INPUT...!");
                        return;
                    }
                }
            }


            switch (from) {
                case 1: {
                    dec = no;
                    bin = Integer.toBinaryString(Integer.parseInt(no));
                    oct = Integer.toOctalString(Integer.parseInt(no));
                    hex = Integer.toHexString(Integer.parseInt(no));
                    break;
                }
                case 2: {
                    dec = String.valueOf(Integer.parseInt(no, 2));
                    bin = no;
                    oct = Integer.toOctalString(Integer.parseInt(dec));
                    hex = Integer.toHexString(Integer.parseInt(dec));
                    break;
                }
                case 3: {
                    dec = String.valueOf(Integer.parseInt(no, 8));
                    bin = Integer.toBinaryString(Integer.parseInt(dec));
                    oct = no;
                    hex = Integer.toHexString(Integer.parseInt(dec));
                    break;
                }
                case 4: {
                    dec = String.valueOf(Integer.parseInt(no, 16));
                    bin = Integer.toBinaryString(Integer.parseInt(dec));
                    oct = Integer.toOctalString(Integer.parseInt(dec));
                    hex = no;
                    break;
                }
            }

            System.out.println("DECIMAL      : " + dec);
            System.out.println("BINARY       : " + bin);
            System.out.println("OCTAL        : " + oct);
            System.out.println("HEXA-DECIMAL : " + hex);
            System.out.println("********************");
            System.out.println("Press 1 : USE IT AGAIN");
            System.out.print("Press 0 : EXIT --> ");
            c = Integer.parseInt(br.readLine());
        }
    }
}
