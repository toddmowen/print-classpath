package toddmowen.printclasspath;

import java.lang.instrument.Instrumentation;

public class PrintClasspathAgent {
    public static void premain(String agentArgs, Instrumentation inst) {
	System.out.println("premain");
    }
}