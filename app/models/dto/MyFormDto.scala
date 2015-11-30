package models.dto

  import play.api.data.Form
  import play.api.data.Forms._

case class MyFormDto(monday:String, tuesday:String, wednesday: String, thursday: String, friday: String)

object MyFormDto {

  val form = Form(
    mapping(
//      "monday" -> text.verifying("Monday must be a full day", e => e.equals("Full")),
      "monday" -> text.verifying("Please select an option!", i => !i.equals("-- select --")),
      "tuesday" -> text.verifying("Please select an option", i => !i.equals("-- select --")),
      "wednesday" -> text,
      "thursday" -> text,
      "friday" -> text
    )(MyFormDto.apply)(MyFormDto.unapply)
  )
}


