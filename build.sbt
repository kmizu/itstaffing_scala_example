organization := "com.github.kmizu"
name := "itstaffing_scala_example"
version := "1.0"
scalaVersion := "2.12.8"
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)
scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-language:implicitConversions")
initialCommands in console += {
  Iterator("com.github.kmizu.itstaffing_scala_example._").map("import "+).mkString("\n")
}
