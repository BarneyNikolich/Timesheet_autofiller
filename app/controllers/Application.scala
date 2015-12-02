package controllers

import models.dto.MyFormDto
import play.api.mvc._
import play.api.mvc.Controller
import play.api.Play.current
import play.api.i18n.Messages.Implicits._

class Application extends Controller {

  val Days = List("monday", "tuesday", "wednesday", "thursday", "friday").map(d => (d.capitalize, d))
  val SelectOptions = List("-- select --", "Full", "Half", "Off").map( x => (x,x) ).toMap

  /**
   * This method displays the form the user
   */
  def index = Action {
    val myForm = MyFormDto.form //Bring the form into scope!
    Ok(views.html.index(SelectOptions, Days, myForm))
  }

  def processForm = Action {   implicit request =>
    MyFormDto.form.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.index(SelectOptions, Days, formWithErrors))
      },
      myFormDto => {
        val formAsList = List (
          s"Monday: ${myFormDto.monday}",
          s"Tuesday: ${myFormDto.tuesday}",
          s"Wednesday: ${myFormDto.wednesday}",
          s"Thursday: ${myFormDto.thursday}",
          s"Friday: ${myFormDto.friday}"
        )
//        println()
        // WRITE TO TXT FILE

        Ok(formAsList.toString)
      }
    )
  }

}