name := "spigot-login-alert"

version := "0.1"

scalaVersion := "2.13.1"

resolvers += "spigot-repo" at "https://hub.spigotmc.org/nexus/content/repositories/snapshots/"
resolvers += "bungeecord-repo" at "https://oss.sonatype.org/content/repositories/snapshots"
resolvers += Resolver.jcenterRepo
resolvers += Resolver.bintrayIvyRepo("com.eed3si9n", "sbt-plugins")

libraryDependencies ++= Seq(
  "org.spigotmc" % "spigot-api" % "1.14.4-R0.1-SNAPSHOT",
  "org.apache.commons" % "commons-lang3" % "3.1",
  "commons-io" % "commons-io" % "2.4",
  "org.scalaj" % "scalaj-http_2.13" % "2.4.2",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
)
