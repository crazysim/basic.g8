name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.9.2"

resolvers := Seq(
  "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.8" % "test"
)

initialCommands := "import $organization$.$name;format="Camel"$._"
