//mvn assembly:assembly -DdescriptorId=jar-with-dependencies package

package alexa;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public class SayHelloRequestStreamHandler extends SpeechletRequestStreamHandler {

	private static final Set<String> supportedApplicationIds;

	static {
		/*
		 * This Id can be found on https://developer.amazon.com/edw/home.html#/
		 * "Edit" the relevant Alexa Skill and put the relevant Application Ids
		 * in this Set.
		 */
		supportedApplicationIds = new HashSet<String>();
		supportedApplicationIds.add("amzn1.ask.skill.8971b7fd-3a2e-4393-85c5-12c4e85cf2a6");
		supportedApplicationIds.add("amzn1.ask.skill.53529ff6-4a8e-4282-b047-490c82a15fd5");
		System.out.println("Supported app ids : " + supportedApplicationIds);
	}

	public SayHelloRequestStreamHandler() {
		super(new SayHelloSpeechlet(), supportedApplicationIds);
	}

	public SayHelloRequestStreamHandler(Speechlet speechlet, Set<String> supportedApplicationIds) {
		super(speechlet, supportedApplicationIds);
	}

}
