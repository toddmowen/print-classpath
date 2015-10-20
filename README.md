To compile (assuming sbt runner is installed):

    sbt package

This should build a jar. To use it, add the following to the java command line:

    -javaagent:path/to/print-classpath.jar
