name := """Timesheet_autofiller"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "org.seleniumhq.selenium" % "selenium-java" % "2.45.0",
  "org.seleniumhq.selenium" % "selenium-firefox-driver" % "2.45.0",
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
)



resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator