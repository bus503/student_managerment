package student_managerment.ui.frame;

import student_managerment.dto.Title;
import student_managerment.ui.panel.AbsItemPanel;
import student_managerment.ui.panel.TitlePanel;

@SuppressWarnings("serial")
public class TitleManagementFrame extends AbsManagementFrame<Title> {
	private TitlePanel titlePanel;
	
	@Override
	protected AbsItemPanel<Title> createItemPanel() {
		titlePanel = new TitlePanel();
		return titlePanel;
	}

	@Override
	protected Title getItem() {
		return titlePanel.getItem();
	}
	
}
