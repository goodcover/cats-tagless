addSbtPlugin("org.typelevel" % "sbt-typelevel" % "0.4.22")
addSbtPlugin("org.typelevel" % "sbt-typelevel-mergify" % "0.4.22")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.13.2")
addSbtPlugin("com.github.tkawachi" % "sbt-doctest" % "0.10.0")
addSbtPlugin("com.47deg" % "sbt-microsites" % "1.3.4")
addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.3.7")

ThisBuild / libraryDependencySchemes ++= List(
  "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always,
  "io.circe" %% "circe-core" % VersionScheme.Always
)
