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
//  val host = "http://localhost:9000/"
//
//  try {
//    webDriver.get(host)
//    //Fill the form in
//    for(day <- Days)
//      webDriver.findElement(By.id(day)).findElements(By.tagName("option")).get(1).click()
//
//    //Submit
//    webDriver.findElement(By.className("btn-primary")).click()
//
//
//  } catch {
//    case e: ConnectException => println(e)
//  }


  /**
   * Fills nics timetable
   */
  val timetableHost = "https://augustus.iqnavigator.com/security/login?service=https://augustus.iqnavigator.com/FO/CasRedirect"
  "Nic's timetable" should "be filled in with the correct values" in {
    go to (timetableHost)

    webDriver.get("https://augustus.iqnavigator.com/security/login?service=https://augustus.iqnavigator.com/FO/CasRedirect")

    webDriver.findElement(By.id("username")).sendKeys("nfellows3")
      webDriver.findElement(By.id("password")).sendKeys("DiwmMtcrOsV1y3J8X1jL22!")
    webDriver.findElement(By.id("loginButton")).click()
  }



//  "The blog app home page" should "have the correct title" in {
//    go to (host)
//    println(host + "<<<<<<<<<<<<<<<<<<<<<,")
//    pageTitle should be ("Auto timesheet filler")
//  }

}
