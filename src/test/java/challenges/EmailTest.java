package challenges;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import flow.Engine;
import flow.IAdapter;

@RunWith(JUnit4.class)
public class EmailTest {

	@Test
	public void testRun_AdapterIsCompliantWithProtocol_AppHasHelloMessage() throws Exception {
		Map<String, IAdapter> adapters = new HashMap<String, IAdapter>();
		adapters.put("EMAIL", new EmailAdapter());

		Engine engine = new Engine(new UserAgent("hello"), adapters, new EmailApp());
		engine.run();

		EmailApp app = (EmailApp) engine.getApp();
		Assert.assertEquals("hello", app.popMessage());
	}
}
