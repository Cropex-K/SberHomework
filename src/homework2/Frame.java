package homework2;

import java.util.Scanner;

    public class Frame {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int length = Integer.parseInt(in.nextLine());
            int width = Integer.parseInt(in.nextLine());
            String line = in.nextLine();
            getFrame(length, width, line);
        }

        public static void getFrame(int length, int width, String line) {
            if (line.length() > width - 2) {
                System.out.println("Ошибка");
            } else {
                int halfL = (int)Math.round((double)length / 2.0D);
                int halfW = (width - 2 - line.length()) / 2;

                StringBuilder inter = new StringBuilder();
                inter.append("*");

                inter.append(" ".repeat(width - 2));

                inter.append("*");
                StringBuilder withLine = new StringBuilder();
                withLine.append("*");
                int i;
                if (halfW == 0) {
                    withLine.append(line);
                    if (width - line.length() == 2) {
                        withLine.append("*");
                    } else {
                        withLine.append(" *");
                    }
                } else {
                    for(i = 0; i <= halfW * 2; ++i) {
                        if (i == halfW) {
                            withLine.append(line);
                        } else {
                            withLine.append(" ");
                        }
                    }

                    if ((width - 2 - line.length()) % 2 != 0) {
                        withLine.append(" ");
                    }

                    withLine.append("*");
                }

                System.out.println("*".repeat(width));

                for(i = 1; i < length - 1; ++i) {
                    if (i != halfL - 1 && halfL != 1) {
                        System.out.println(inter.toString());
                    } else {
                        System.out.println(withLine.toString());
                    }
                }

                System.out.println("*".repeat(width));
            }

        }
    }


