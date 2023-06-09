import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class lab02 {

    public static void main(String[] args) throws FileNotFoundException {

        URL url = lab02.class.getResource("input_lab02.txt");
        File f = new File(url.getPath());
        Scanner sc = new Scanner(f);
        String s;

        int pCount = 0;  // for counting and printing the line number

        while (sc.hasNext()) {
            s = sc.next().toLowerCase();
            char c = s.charAt(0);
            int n = (int) c;
            int p = 0;

            String s2 = s.substring(4);

            // Conditions for checking valid web address
            if (s.length() > 8 && s.startsWith("www.") && s2.contains(".")) {
                for (int i = 4; i < s.length(); i++) {
                    int t = (int) (s.charAt(i));

                    if (s.length() > i + 1) {
                        p = (int) (s.charAt(i + 1));
                    }

                    // 46 means dot
                    if ((int) (s.charAt(4)) == 46) {
                        pCount++;
                        System.out.println("Invalid web address_a, " + pCount);
                        break;
                    } else if ((t > 96 && t < 123) || (t > 47 && t < 58)) {
                        // lowercase a to z 97 to 122
                        continue;
                    } else if (t == 46) {
                        if (p == 46) {
                            pCount++;
                            System.out.println("Invalid web address_b, " + pCount);
                            break;
                        } else {
                            int lastin = s.lastIndexOf(".");
                            String g = s.substring(i + 1);
                            if (s.length() > lastin && g.length() >= 2) {
                                pCount++;
                                System.out.println("Valid web address_x, " + pCount);
                                break;
                            } else {
                                pCount++;
                                System.out.println("Invalid web address_c, " + pCount);
                                break;
                            }
                        }
                    } else if (t == 64) {
                        pCount++;
                        System.out.println("Invalid web address or email id_x, " + pCount);
                        // if there is any unsupported character in the middle of the domain name. ex: www.something@somewhere.com
                        break;
                    }
                }
            } else if (s.contains("@") && s.contains(".")) {
                //Conditions for checking valid email id
                if ((n > 96 && n < 123)) {
                    for (int i = 0; i < s.length(); i++) {
                        int t = (int) (s.charAt(i));

                        if (s.length() > i + 1) {
                            p = (int) (s.charAt(i + 1));
                        }

                        if ((t > 96 && t < 123) || (t > 47 && t < 58) || (t == 46)) {
                            // Letter, number and dot
                            continue;
                        } else if (t == 64) {
                            // for checking '@' at the middle
                            if (p == 46 || p == 64) {
                                pCount++;
                                System.out.println("Invalid email id_a, " + pCount);
                                break;
                            } else {
                                String g = s.substring(i + 1);
                                if (g.contains(".")) {
                                    pCount++;
                                    System.out.println("Valid email id, " + pCount);
                                } else {
                                    pCount++;
                                    System.out.println("Invalid email id_b, "+ pCount);
                                }
                            }
                        }
                    }
                } else {
                    pCount++;
                    System.out.println("Invalid email id_c, " + pCount);
                    // if starts with number
                }
            } else if (s.endsWith(".com") || s.endsWith(".org") || s.endsWith(".bd") || s.endsWith(".com.bd")) {
                //Conditions for checking of domain of valid web address
                int count = 0;
                for (int i = 0; i < s.length(); i++) {
                    int t = (int) (s.charAt(i));
                    if (t == 64) {
                        count++;
                    }
                }

                if (count == 0) {
                    pCount++;
                    System.out.println("Invalid web address_d, " + pCount);
                    // if missing www. for web address
                }
            } else {
                pCount++;
                System.out.println("Invalid web address or email id_y, " + pCount);
                // if there is no .com after domain name
                // and without www. and .com
            }
        }
    }
}
