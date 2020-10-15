package hu.kalix.quize.input;

public class RangeValidator implements Validator {
	private int number;
	private int lowerBound;
	private int upperBound;

	public RangeValidator(int number, int lowerBound, int upperBound) {
		this.number = number;
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}

	@Override
	public boolean isValid() {
		return number >= lowerBound && number <= upperBound;
	}
}
