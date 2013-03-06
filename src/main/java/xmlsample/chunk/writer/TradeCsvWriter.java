package xmlsample.chunk.writer;

import java.util.Arrays;
import java.util.List;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.file.FlatFileItemWriter;

import xmlsample.data.Trade;

public class TradeCsvWriter extends FlatFileItemWriter<Trade> {

	private FlatFileItemWriter orderItemWriter;

	@Override
	public void open(final ExecutionContext executionContext) throws ItemStreamException {
		super.open(executionContext);

		orderItemWriter.open(executionContext);
	}

	@Override
	public void close() {
		super.close();

		orderItemWriter.close();
	}

	@Override
	public void write(final List<? extends Trade> items) throws Exception {
		super.write(items);

		for (Trade trade : items) {
			orderItemWriter.write(Arrays.asList(trade.getOrder()));
		}

	}

	/**
	 * @return the orderItemWriter
	 */
	public FlatFileItemWriter getOrderItemWriter() {
		return orderItemWriter;
	}

	/**
	 * @param orderItemWriter the orderItemWriter to set
	 */
	public void setOrderItemWriter(final FlatFileItemWriter orderItemWriter) {
		this.orderItemWriter = orderItemWriter;
	}

}
