package view;

import view.browser.BrowserView;
import view.console.ConsoleView;

public class ViewFactory {

    public View createView(ViewOption viewOption) {
        switch (viewOption) {
            case CONSOLE:
                return new ConsoleView();
            case BROWSER:
                return new BrowserView();
            default:
                return new ConsoleView();
        }
    }
}
