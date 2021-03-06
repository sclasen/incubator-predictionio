import AssemblyKeys._

assemblySettings

name := "template-scala-parallel-vanilla"

organization := "org.apache.predictionio"

libraryDependencies ++= Seq(
  //"org.apache.predictionio"    %% "core"          % "0.8.6" % "provided",
  "org.apache.predictionio"    %% "core"          % "0.9.1" % "provided",
  "org.apache.spark" %% "spark-core"    % "1.2.0" % "provided",
  "org.apache.spark" %% "spark-mllib"   % "1.2.0" % "provided")
