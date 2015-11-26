package models.dto

import play.api.data.Form
import play.api.data.Forms._

case class MyFormDto(line1:String, line2:String)

object MyFormDto {

  val form = Form(
    mapping(
      "username" -> text,
      "password" -> text
    )(MyFormDto.apply)(MyFormDto.unapply)
  )
}