package models.dto

import play.api.data.Form
import play.api.data.Forms._

case class MyFormDto(mon:String, tues:String, wed: String, thur: String, fri: String)

object MyFormDto {

  val form = Form(
    mapping(
      "monday" -> text,
      "tuesday" -> text,
      "wednesday" -> text,
      "thursday" -> text,
      "friday" -> text
    )(MyFormDto.apply)(MyFormDto.unapply)
  )
}


