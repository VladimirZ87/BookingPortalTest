
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.booking.com/");

        WebElement placeField = driver.findElement(By.id("ss"));
        placeField.sendKeys("Belgrade");

        WebElement dataField = driver.findElement(By.className("xp__dates__checkin"));
        dataField.click();
        
        List<WebElement> dates = driver.findElements(By.tagName("td"));
        int total_node = dates.size();
        
        for(int i=0; i < total_node; i++){
        String date = dates.get(i).getText();
        
        if(date.equals("15")){
            dates.get(i).click();
            break;
        }
        
    }
        
//        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div[3]/div/div/div[1]/table/tbody/tr[4]/td[2]/span")).click();
        
//         WebElement dataField1 = driver.findElement(By.className("xp__dates__checkout"));
//        dataField1.click();
//        
//        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div/div[3]/div/div/div/div[2]/div[2]/div[3]/div/div/div[1]/table/tbody/tr[5]/td[6]/span")).click();

//        WebElement calendareField = driver.findElement(By.className("c2-month-table"));
//        List<WebElement> columns1 = calendareField.findElements(By.tagName("td"));
//
//        for (WebElement cell : columns1) {
//
//            if (cell.getText().equals("18")) {
//                cell.click();
//                break;
//            }
//        }
//        WebElement dataField1 = driver.findElement(By.className("xp__dates__checkout"));
//        dataField1.click();
//
//        WebElement calendareCheckOutField = driver.findElement(By.className("c2-month-table"));
//        List<WebElement> columns2 = calendareCheckOutField.findElements(By.tagName("td"));
//
//        for (WebElement cell : columns2) {
//
//            if (cell.getText().equals("30")) {
//                cell.click();
//                break;
//            }
//        }
        
        
//        WebElement personsField = driver.findElement(By.className("xp__guests"));
//        personsField.click();
//        
//        
//        Select dropdown = new Select(driver.findElement(By.id("no_rooms")));
//        dropdown.selectByIndex(3);
//        
//        Select dropdownAdultsField = new Select(driver.findElement(By.id("group_adults")));
//        dropdownAdultsField.selectByIndex(7);
//        
//        Select dropdownChildrenField = new Select(driver.findElement(By.id("group_children")));
//        dropdownChildrenField.selectByIndex(2);
//        
//        Select dropdownChildernAge1Field = new Select(driver.findElement(By.cssSelector("[aria-label=\"Child 1 age\"]")));
//        dropdownChildernAge1Field.selectByIndex(13);
//        
//        Select dropdownChildernAge2Field = new Select(driver.findElement(By.cssSelector("[aria-label=\"Child 2 age\"]")));
//        dropdownChildernAge2Field.selectByIndex(13);
//
//        WebElement searchButton = driver.findElement(By.className("xp__button"));
//        searchButton.click();
    }

}
