val sbtCoursierVersion = "1.0.0-M15"
val sbtPgpVersion      = "1.0.1"
val sbtReleaseVersion  = "1.0.4"
val sbtSonatypeVersion = "1.1"
val sbtTravisCiVersion = "1.0.0"

lazy val root = project.in(file("."))
  .enablePlugins(BuildInfoPlugin)
  .settings(
    addSbtPlugin("io.get-coursier"   % "sbt-coursier" % sbtCoursierVersion),
    addSbtPlugin("com.jsuereth"      % "sbt-pgp"      % sbtPgpVersion),
    addSbtPlugin("com.github.gseitz" % "sbt-release"  % sbtReleaseVersion),
    addSbtPlugin("org.xerial.sbt"    % "sbt-sonatype" % sbtSonatypeVersion),
    addSbtPlugin("com.dwijnand"      % "sbt-travisci" % sbtTravisCiVersion),
    buildInfoKeys := Seq[BuildInfoKey](
      "sbtCoursierVersion" -> sbtCoursierVersion,
      "sbtPgpVersion"      -> sbtPgpVersion,
      "sbtReleaseVersion"  -> sbtReleaseVersion,
      "sbtSonatypeVersion" -> sbtSonatypeVersion,
      "sbtTravisCiVersion" -> sbtTravisCiVersion),
    buildInfoPackage := "sbtslamdata")
