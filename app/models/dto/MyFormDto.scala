package models.dto

import org.joda.time.LocalDate
import play.api.data.Form
  import play.api.data.Forms._

case class MyFormDto(date: LocalDate,
                     monday:String,
                     tuesday:String,
                     wednesday: String,
                     thursday: String,
                     friday: String)

object MyFormDto {

  val form = Form(
    mapping(
//      "monday" -> text.verifying("Monday must be a full day", e => e.equals("Full")),
//      "date" -> jodaLocalDate.verifying("Date must be in the past!", d => d.isBefore(LocalDate.now.plusDays(1))),
      "date" -> jodaLocalDate.verifying(  "Date must be in the past!", d => d.isBefore(LocalDate.now.plusDays(1))),
      "monday" -> text.verifying("Please select an option!", i => !i.equals("-- select --")),
      "tuesday" -> text.verifying("Please select an option", i => !i.equals("-- select --")),
      "wednesday" -> text.verifying("Please select an option", i => !i.equals("-- select --")),
      "thursday" -> text.verifying("Please select an option", i => !i.equals("-- select --")),
      "friday" -> text.verifying("Please select an option", i => !i.equals("-- select --"))
    )(MyFormDto.apply)(MyFormDto.unapply)
  )
}


