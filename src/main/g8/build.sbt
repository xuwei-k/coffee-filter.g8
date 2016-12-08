organization := "com.example"

scalacOptions += "-deprecation"

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
