package tablefactory;

import factory.Link;;

public class TableLink extends Link {

	public TableLink(String caption, String url) {
		super(caption, url);
	}
	@Override
	public String makeHTML() {
		return "<td><a href = '" + this.url + "'>" + this.caption + "</a></td>";
	}

}
