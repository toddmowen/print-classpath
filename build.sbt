// disable using the Scala version in output paths and artifacts
crossPaths := false

packageOptions in (Compile, packageBin) +=
    Package.ManifestAttributes("Premain-Class" -> "toddmowen.printclasspath.PrintClasspathAgent")