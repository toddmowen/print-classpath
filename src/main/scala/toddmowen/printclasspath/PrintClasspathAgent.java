package toddmowen.printclasspath;

import java.lang.instrument.Instrumentation;
import java.net.URL;
import java.net.URLClassLoader;

public class PrintClasspathAgent {
    public static void premain(String agentArgs, Instrumentation inst) {
	URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();

	System.out.println("[print-classpath]");
	for (URL url: classLoader.getURLs()) {
	    System.out.println("    " + url.getFile());
	}
    }
}