package attividade;

public class Screen implements PhoneObserver{
	private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
    }

	@Override
	public void printRecentNumber() {
		System.out.println(model.getLastNumber());
	}

	@Override
	public void printAllNumbersCall() {
		System.out.println(model.toString());
	}
}
