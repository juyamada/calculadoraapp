    // This sample code supports Appium Java client >=9
    // https://github.com/appium/java-client
    import io.appium.java_client.remote.options.BaseOptions;
    import io.appium.java_client.AppiumBy;
    import io.appium.java_client.android.AndroidDriver;
    import java.net.URL;
    import java.time.Duration;
    import java.util.Arrays;
    import org.junit.jupiter.api.AfterEach;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
    import org.openqa.selenium.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
    
    public class CalculadoraApp {
    
      private AndroidDriver driver;

      private URL getUrl() {
        try {
          return new URL("https://juliana_yamada:9d3a3a77-93f2-45c6-be26-2b40255251a9@ondemand.us-west-1.saucelabs.com:443/wd/hub");
        } catch (MalformedURLException e) {
          e.printStackTrace();
        }
        return null;
      }
    
      @BeforeEach
      public void setUp() {
        var options = new BaseOptions()
          .amend("platformName", "Android")
          .amend("appium:platformVersion", "9.0")
          .amend("appium:deviceName", "Samsung Galaxy S9 FHD GoogleAPI Emulator")
          .amend("appium:deviceOrientation", "portrait")
          .amend("appium:app", "storage:filename=Calculator_8.6.1 (625857114)_APKPure.apk")
          .amend("appium:appPackage", "com.google.android.calculator")
          .amend("appium:appActivity", "com.android.calculator2.Calculator")
          .amend("browserName", "")
          .amend("appium:ensureWebviewsHavePages", true)
          .amend("appium:nativeWebScreenshot", true)
          //.amend("sauce:options", Map.ofEntries(Map.entry("name", "Appium Desktop Session -- Jan 21, 2025 10:51 AM")))
          .amend("appium:newCommandTimeout", 3600)
          .amend("appium:connectHardwareKeyboard", true);
    
       
    
        driver = new AndroidDriver(this.getUrl(), options);
      }
    
      @Test
      public void testeSomar() {
        var num7 = driver.findElement(AppiumBy.accessibilityId("7"));
        num7.click();
        var soma = driver.findElement(AppiumBy.accessibilityId("plus"));
        soma.click();
        var num1 = driver.findElement(AppiumBy.accessibilityId("1"));
        num1.click();
        var num2 = driver.findElement(AppiumBy.accessibilityId("2"));
        num2.click();
        var igual = driver.findElement(AppiumBy.accessibilityId("equals"));
        igual.click();
        var resultado = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
        assertEquals("19", resultado.getText());
        var limpaTela = driver.findElement(AppiumBy.accessibilityId("clear"));
        limpaTela.click();
      }

        @Test
        public void testeSubtrair(){
        
        var num8 = driver.findElement(AppiumBy.accessibilityId("8"));
        num8.click();
        var num3 = driver.findElement(AppiumBy.accessibilityId("3"));
        num3.click();
        var subtrai = driver.findElement(AppiumBy.accessibilityId("minus"));
        subtrai.click();
        var num2 = driver.findElement(AppiumBy.accessibilityId("2"));
        num2.click();
        var num1 = driver.findElement(AppiumBy.accessibilityId("1"));
        num1.click();
        var igual = driver.findElement(AppiumBy.accessibilityId("equals"));
        igual.click();
        var resultado = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
        assertEquals("62", resultado.getText());
        var limpaTela = driver.findElement(AppiumBy.accessibilityId("clear"));
        limpaTela.click();
        }

        @Test
        public void testeMultiplicar(){
        var num7 = driver.findElement(AppiumBy.accessibilityId("7"));
        num7.click();
        var multiplicar = driver.findElement(AppiumBy.accessibilityId("multiply"));
        multiplicar.click();
        var num6 = driver.findElement(AppiumBy.accessibilityId("6"));
        num6.click();
        var igual = driver.findElement(AppiumBy.accessibilityId("equals"));
        igual.click();
        var resultado = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
        assertEquals("42",resultado.getText());
        var limpaTela = driver.findElement(AppiumBy.accessibilityId("clear"));
        limpaTela.click();
        }

        @Test
        public void testeDividir(){
        var num4 = driver.findElement(AppiumBy.accessibilityId("4"));
        num4.click();
        var num5 = driver.findElement(AppiumBy.accessibilityId("5"));
        num5.click();
        var dividir = driver.findElement(AppiumBy.accessibilityId("divide"));
        dividir.click();
        var num9 = driver.findElement(AppiumBy.accessibilityId("9"));
        num9.click();
        var igual = driver.findElement(AppiumBy.accessibilityId("equals"));
        igual.click();
        var resultado = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
        assertEquals("5",resultado.getText());
      }
    
      @AfterEach
      public void tearDown() {
        driver.quit();
      }
    }


