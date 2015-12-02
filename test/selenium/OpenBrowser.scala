package selenium

import java.net.ConnectException

import org.openqa.selenium.firefox.FirefoxDriver
import org.scalatest._
import selenium._
import org.openqa.selenium._
import htmlunit._

/**
 * Created by barn on 02/12/15.
 */
class OpenBrowser extends FlatSpec with Matchers with WebBrowser {

  implicit val webDriver: WebDriver = new FirefoxDriver
  val host = "http://localhost:9000/"

  try {
    //Fill the form in
    webDriver.findElement(By.id("monday")).findElements(By.tagName("option")).get(1).click()
    webDriver.findElement(By.id("tuesday")).findElements(By.tagName("option")).get(3).click()
    webDriver.findElement(By.id("wednesday")).findElements(By.tagName("option")).get(1).click()
    webDriver.findElement(By.id("thursday")).findElements(By.tagName("option")).get(1).click()
    webDriver.findElement(By.id("friday")).findElements(By.tagName("option")).get(1).click()

    //Submit
    webDriver.findElement(By.className("btn-primary")).click()
  } catch {
    case e: ConnectException => println(e)
  }

















  
//  webDriver.get("https://www.google.co.uk")
//
//  webDriver.findElement(By.id("lst-ib")).sendKeys("run further")
//  webDriver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER)
//  webDriver.findElement(By.name("Runfurther.com")).click()




//  "The blog app home page" should "have the correct title" in {
//    go to (host)
//    println(host + "<<<<<<<<<<<<<<<<<<<<<,")
//    pageTitle should be ("Auto timesheet filler")
//  }

}
