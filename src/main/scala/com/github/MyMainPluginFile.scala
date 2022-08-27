package com.github

import sbt._

object MyMainPluginFile extends sbt.AutoPlugin {
  import autoImport._
  object autoImport {
    lazy val helloTask = taskKey[Unit]("Prints Hello world.")
  }

  override def trigger = allRequirements

  override def projectSettings = Seq(
    helloTask := println("Hello world")
  )

}
