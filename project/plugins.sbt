// unmanagedSourceDirectories in Compile += baseDirectory.value / "../src/main/scala"

          addSbtPlugin("com.dwijnand"      % "sbt-dynver"      % "4.1.1")
          addSbtPlugin("io.get-coursier"   % "sbt-coursier"    % "2.0.0")
// libraryDependencies += "org.scala-sbt"     % "scripted-plugin" % sbtVersion.value
          addSbtPlugin("com.typesafe"      % "sbt-mima-plugin" % "0.8.0")
          addSbtPlugin("org.foundweekends" % "sbt-bintray"     % "0.5.6")
