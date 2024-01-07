package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

    public class BrokenImagesExample {

        public static void main(String[] args) {

            // Initialize WebDriver
            WebDriver driver = new ChromeDriver();

            // Open a webpage
            driver.get("https://practice.expandtesting.com/broken-images");

            // Get all the images on the page
            List<WebElement> images = driver.findElements(By.tagName("img")); //link or a

            for (WebElement image : images) {
                // Get the image source URL
                String imageURL = image.getAttribute("src"); //href

                try {
                    // Open a connection to the image URL
                    HttpURLConnection connection = (HttpURLConnection) new URL(imageURL).openConnection();
                    connection.setRequestMethod("HEAD");
                    int responseCode = connection.getResponseCode();

                    // Check if the response code is not 200 (OK)
                    if (responseCode != 200) {
                        System.out.println("Broken image found: " + imageURL);
                    }

                } catch (Exception e) {
                    System.out.println("Exception while checking image: " + e.getMessage());
                }
            }

            // Close the WebDriver
            driver.quit();
        }
    }

