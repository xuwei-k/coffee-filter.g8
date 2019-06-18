organization := "com.example"

val unusedWarnings = (
  "-Ywarn-unused" ::
  Nil
)

scalacOptions ++= unusedWarnings

Seq(Compile, Test).flatMap(c =>
  scalacOptions in (c, console) --= unusedWarnings
)

scalacOptions ++= "-deprecation" :: "unchecked" :: "-feature" :: Nil

scalaVersion := "$scala_version$"

name := "$name$"

version := "0.1.0"

coffeeSettings

lessSettings

(resourceManaged in (Compile, CoffeeKeys.coffee)) := (resourceManaged in Compile)(_ / "www" / "js").value

(resourceManaged in (Compile, LessKeys.less)) := (resourceManaged in Compile)(_ / "www" / "css").value

val unfilteredVersion = "$unfiltered_version$"

libraryDependencies ++= Seq(
  "ws.unfiltered" %% "unfiltered-jetty" % unfilteredVersion,
  "ws.unfiltered" %% "unfiltered-filter" % unfilteredVersion
)
