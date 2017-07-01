package patterns.creational;

import java.util.List;

import com.sun.prism.impl.Disposer.Record;

public class PrototypeExample implements Cloneable {

	private String sql;
	private List<String> parameters;
	private Record record;

	// replace "PrototypeExample" with "Statement" for the real example
	public PrototypeExample(String sql, List<String> parameters, Record record) {
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}

	public PrototypeExample clone() {
		try {
			return (PrototypeExample) super.clone();
		} catch (CloneNotSupportedException cnse) {
		}
		return null;
	}

}
