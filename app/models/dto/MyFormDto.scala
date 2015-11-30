package models.dto

import play.api.data.Form
import play.api.data.Forms._

case class MyFormDto(monday:String, tuesday:String, wednesday: String, thursday: String, friday: String)

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


