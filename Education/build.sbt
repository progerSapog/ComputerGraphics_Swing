ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "Education"
  )

val swingVersion = "3.0.0"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-swing" % swingVersion
)