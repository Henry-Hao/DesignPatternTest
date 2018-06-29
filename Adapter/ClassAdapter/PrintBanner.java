package ClassAdapter;

public class PrintBanner extends Banner implements Print {

	public PrintBanner(String banner) {
		super(banner);
	}
	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}
