package student_managerment.ui.frame;

import student_managerment.dto.Department;
import student_managerment.ui.panel.AbsItemPanel;
import student_managerment.ui.panel.DepartmentPanel;

@SuppressWarnings("serial")
public class DepartmentManagementFrame extends AbsManagementFrame<Department> {
	private DepartmentPanel deptPanel;
	
	public DepartmentManagementFrame() {
	
	}

	@Override
	protected AbsItemPanel<Department> createItemPanel() {
		deptPanel = new DepartmentPanel();
		return deptPanel;
	}

	@Override
	protected Department getItem() {
		return deptPanel.getItem();
	}
	
}
