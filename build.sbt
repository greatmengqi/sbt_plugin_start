ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.github"
ThisBuild / scalaVersion := "2.12.16"

sbtPlugin := true

lazy val root = (project in file("."))
  .settings(
    name := "sbt_plugin_start"
  )
  .enablePlugins(MyMainPluginFile)

publishMavenStyle := true
publishTo := Some(
  "name of my artifactory" at "https://artifactory.myorg.com/artifactory/"
)
publishArtifact in Test := false
pomIncludeRepository := { _ => false }
