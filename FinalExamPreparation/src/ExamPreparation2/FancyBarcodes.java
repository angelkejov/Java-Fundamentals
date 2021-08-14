package ExamPreparation2;

import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "^@#+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+$";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String barcodes = sc.nextLine();
            Matcher matcher = pattern.matcher(barcodes);
            if (matcher.find()) {
                    char[] c = barcodes.toCharArray();
                StringBuffer sb = new StringBuffer();
                boolean flag = false;
                for (char ch : c) {
                    if (Character.isDigit(ch)) {
                        sb.append(ch);
                        flag = true;
                    }
                }
                if (flag) {
                    System.out.print("Product group: " + sb + "\n");
                } else {
                    System.out.print("Product group: 00" + "\n");
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
