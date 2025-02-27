package app.gui.panel;

import app.gui.MainButton;
import app.gui.MainFrame;
import app.gui.handler.ChartHandler;
import app.settings.HandlerCode;
import app.settings.TextConstants;

public final class StatisticsTypePanel extends AbstractPanel{

    private final String title;

    public StatisticsTypePanel(MainFrame frame, String title) {
        super(frame);
        this.title = TextConstants.getConstant(title);
        init();
    }

    @Override
    protected void init() {
        MainButton type = new MainButton(title, new ChartHandler(frame), HandlerCode.TYPE);
        add(type);
    }
}
