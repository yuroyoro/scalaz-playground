name := "scalaz playground"

version := "1.0"

scalaVersion := "2.9.1"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "6.0.3"

initialCommands in console := """
import scalaz._
import Scalaz._
"""

seq(lsSettings :_*)
