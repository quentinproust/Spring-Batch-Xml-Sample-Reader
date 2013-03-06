package helloworld;

import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.ExitStatus;

/**
 * 
 * @author tareq.abedrabbo
 */
public class PrintTasklet implements Tasklet {

	private String message;

	public void setMessage(final String message) {
		this.message = message;
	}

	public ExitStatus execute() throws Exception {
		System.out.println(message);
		return ExitStatus.FINISHED;
	}
}
