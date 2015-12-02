package selenium

import java.net.ConnectException

import org.openqa.selenium.firefox.FirefoxDriver
import org.scalatest._
import selenium._
import org.openqa.selenium._


/**
 * Created by barn on 02/12/15.
 */
class OpenBrowser extends FlatSpec with Matchers with WebBrowser {

  val Days = List("monday", "tuesday", "wednesday", "thursday", "friday")

  implicit val webDriver: WebDriver = new FirefoxDriver
  val host = "http://localhost:9000/"

  try {
    webDriver.get(host)
    //Fill the form in
    for(day <- Days) {
      webDriver.findElement(By.id(day)).findElements(By.tagName("option")).get(1).click()
    }
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