import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "/simpleJob.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestJobConfigurationTests {
	@Autowired
	private JobLauncher jobLauncher;
	@Autowired
	private Job jdbc2FileJob;

	@Test
	public void testLaunchJob() throws Exception {
		// JobParameter jp = new JobParameter(new Date());
		// Map<String, JobParameter> map = new HashMap<String, JobParameter>();
		// map.put("param1", jp);
		JobParameters jobparams = new JobParameters();
		jobLauncher.run(jdbc2FileJob, jobparams);
	}
}