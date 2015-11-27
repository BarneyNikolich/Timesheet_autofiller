package controllers

import models.dto.MyFormDto
import play.api.mvc._
import play.api.mvc.Controller
import play.api.Play.current
import play.api.i18n.Messages.Implicits._

class Application extends Controller {

  val Days: List[String] = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
  val SelectOptions: List[String] = List("Full", "Half", "Off")
  
  def index = Action {

    val myForm = MyFormDto.form

    Ok(views.html.index("Your new application is ready.", SelectOptions, Days, myForm))
  }

  def processForm = Action {
    Ok("Thanks mate")
  }






//  val Hello = Form(
//    "mon" -> text
//  )

//  def Hello = Action { implicit request =>
//    Hello.bindFromRequest.fold(
//      errors => {
//        BadRequest(views.html.index(errors))
//      },
//      name => {
//        OK(views.html.sayHello(name))
//      }
//    )
//  }

//  case class TimeData(mon: String, tues: String, wed: String, thur:String, fri: String)
//
//  val userFormm: Form[TimeData] = Form(
//    mapping(
//      "Mon" -> text,
//      "Tue" -> text,
//      "wed" -> text,
//      "thurs" -> text,
//      "fri" -> text
//
//    )(TimeData.apply)(TimeData.unapply)
//  )
//
//  def form = Action { implicit request =>
//    userForm.bindFromRequest.fold (
//      errors => {
//        BadRequest("fail")
//      },
//      userData => {
//        val input = TimeData()
//
//        OK()
//      }
//    )
//  }
//  userForm.bindFromRequest.fold(
//    formWithErrors => {
//      // binding failure, you retrieve the form containing errors:
//      BadRequest(views.html.sayHello(formWithErrors))
//    },
//    userData => {
//      /* binding success, you get the actual value. */
//      val newUser = models.User(userData.name, userData.age)
//      val id = models.User.create(newUser)
//      Redirect(routes.Application.home(id))
//    }
//  )






}