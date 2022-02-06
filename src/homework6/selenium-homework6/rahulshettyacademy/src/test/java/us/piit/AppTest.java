package us.piit;


import base.CommonAPI;
import com.sun.org.apache.xalan.internal.xsltc.dom.StepIterator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AppTest extends CommonAPI {


    @Test
    public void RadioButton() {

        List<WebElement> radioButtonclick = driver.findElements(By.xpath("//input[@name='radioButton']"));
        for (WebElement element : radioButtonclick) {
            if (!element.isSelected()) ;
            element.click();
        }


    }

    @Test
    public void SuggestionClass() throws InterruptedException {
        type("//input[@id='autocomplete']", "can");
        List<WebElement> suggessionList = driver.findElements(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']"));
        for (WebElement element : suggessionList) {
            if (element.equals("Central African Republic")) ;
            element.click();

            Thread.sleep(2000);

        }


    }

    @Test
    public void getDropdownOptions() throws InterruptedException {
        selectDropdownOption("//select[@name='dropdown-class-example']", "Option1");
        selectDropdownOption("//select[@name='dropdown-class-example']", "Option2");
        selectDropdownOption("//select[@name='dropdown-class-example']", "Option3");
        Thread.sleep(3000);
    }

    @Test
    public void checkBox() throws InterruptedException {
        List<WebElement> checkList = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement element : checkList) {
            element.click();
        }
        waitfor(2);

        uncheckbox("//input[@id='checkBoxOption2']");

    }

    @Test
    public void switchWindow() {
        click("//button[@id='openwindow']");
        switchHandle();
        click("//a[text()='Contact']");
    }

    @Test
    public void switchToAlert() throws InterruptedException {
        type("//input[@id='name']", "djamel");
        click("//input[@id='alertbtn']");
        driver.switchTo().alert().accept();

        type("//input[@id='name']", "allou");
        click("//input[@id='confirmbtn']");
         driver.switchTo().alert().accept();

        type("//input[@id='name']", "nait");
        click("//input[@id='confirmbtn']");
        driver.switchTo().alert().dismiss();
    }

    @Test
    public void WebTable() {
        String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
        System.out.println(text);
        String text2 = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText();
        System.out.println(text2);
        String text3 = driver.findElement(By.xpath("//table/tbody/tr[11]/td[3]")).getText();
        System.out.println(text3);
    }

    @Test
    public void ElementDisplayed() throws InterruptedException {
        //test of the element os present without hiding it
        if (driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed()) {
            System.out.println("Text is present");
        }
        else
        {
            System.out.println("Text is absent");
        }
        //test if the element is present with clicking hiding
        click("//input[@id='hide-textbox']");
        if (driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed()) {

            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
        //test if element present with clicking show button
        click("//input[@id='show-textbox']");
        if (driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed()) {

            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
    }

    @Test
    public void webtablescrolldown(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)", "");
        driver.findElement(By.xpath("//div[@class='tableFixHead']"));
        js.executeScript("(0,600)", "");

    }
}
