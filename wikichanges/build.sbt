name := "wikichanges"

initialCommands += """
  import org.apache.spark.SparkContext
  import org.apache.spark.SparkContext._
  val sc = new SparkContext("local", "Intro")
  """

cleanupCommands += """
  println("Closing the SparkContext:")
  sc.stop()
  """

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.3.0",
  "org.apache.spark"  %% "spark-core" % "1.4.0",
  "org.apache.spark"  %% "spark-streaming" % "1.4.0"
)

unmanagedResourceDirectories in Compile += baseDirectory.value / "conf"

