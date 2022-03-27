import java.util.Scanner;
import method.method_return;
/*  Kelompok    : 7
    Shift       : 1
    Nama/NIM    :
        -Shodiqul Faris / 21120121130052
        -Rafly an nindra / 21120121120002
        -Mulyadi Saprianto / 21120121140098
        -Ferdinand Rockwell Sebastian Sinaga / 21120121140111
 */

public class pasar_games {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String username , password;
        int s = 2000000;
        System.out.println("selamat datang di pasar games");
        System.out.println("silahkan login terlebih dahulu");
        boolean cekKondisi = false;
        while (!cekKondisi){
            System.out.print("username : ");                                // usernamenya jhony_ceria
            username = x.nextLine();
            System.out.print("password : ");                                // passwordnya 123456
            password = x.nextLine();
            if (username.equals("jhony_ceria") && password.equals("123456")){
                System.out.println("halo selamat datang jhony_ceria");
                System.out.println("saldo anda saat ini : " + s);
                System.out.println("silahkan pilih game");
                System.out.println("1. genshin impact");
                System.out.println("2. apex legend mobile");
                scase1(x);
                cekKondisi = true;
            }
            else {
                System.out.println("username atau password salah");
                System.out.println("mohon ulangi");
            }
        }
    }
}
