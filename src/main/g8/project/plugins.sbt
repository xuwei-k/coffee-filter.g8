addSbtPlugin("me.lessis" % "coffeescripted-sbt" % "$coffeescripted_sbt_version$")

addSbtPlugin("me.lessis" % "less-sbt" % "$less_sbt_version$")

resolvers += "softprops-maven" at "http://dl.bintray.com/content/softprops/maven"

scalacOptions += "-deprecation"
