package pom.alert.pages;

import wrappers.GenericWrappers;

public class W3SchoolOnline extends GenericWrappers {
	
	
	public W3SchoolOnline switchToOnlineWindow() {
		switchToLastWindow();
		return new W3SchoolOnline();
	}

}
