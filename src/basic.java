import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class basic extends base {

    public static void main(String[] args) throws MalformedURLException {
        // Inisialisasi driver dengan capabilities dari base.java
        AndroidDriver<AndroidElement> driver = base.capabilities();

        // Menunggu aplikasi untuk loading
        try {
            Thread.sleep(5000); // Menunggu 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Memasukkan angka 3 pada input pertama
        driver.findElement(By.id("com.example.simplecalculator:id/num1")).sendKeys("3");

        // Memasukkan angka 3 pada input kedua
        driver.findElement(By.id("com.example.simplecalculator:id/num2")).sendKeys("3");

        // Mengklik tombol add
        driver.findElement(By.id("com.example.simplecalculator:id/add")).click();

        // Mendapatkan hasil dari TextView
        String addResult = driver.findElement(By.id("com.example.simplecalculator:id/result")).getText();

        // Mencetak hasil
        System.out.println("Addition Result: " + addResult);

        // Menunggu beberapa detik sebelum melakukan tugas baru
        try {
            Thread.sleep(3000); // Menunggu 3 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Menghapus teks dari input sebelumnya
        driver.findElement(By.id("com.example.simplecalculator:id/num1")).clear();
        driver.findElement(By.id("com.example.simplecalculator:id/num2")).clear();

        // Memasukkan angka 15 pada input pertama
        driver.findElement(By.id("com.example.simplecalculator:id/num1")).sendKeys("15");

        // Memasukkan angka 5 pada input kedua
        driver.findElement(By.id("com.example.simplecalculator:id/num2")).sendKeys("5");

        // Mengklik tombol divide
        driver.findElement(By.id("com.example.simplecalculator:id/divide")).click();

        // Mendapatkan hasil dari TextView
        String divideResult = driver.findElement(By.id("com.example.simplecalculator:id/result")).getText();

        // Mencetak hasil
        System.out.println("Division Result: " + divideResult);

        // Menunda penutupan aplikasi untuk memastikan hasil bisa dilihat
//        try {
//            Thread.sleep(60000); // Menunggu 60 detik
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // Menutup driver (opsional, bisa dihapus jika ingin tetap terbuka)
        // driver.quit();
    }
}