package student_managerment.ui.frame;

import student_managerment.dto.Student;
import student_managerment.ui.panel.AbsItemPanel;
import student_managerment.ui.panel.StudentPanel;

@SuppressWarnings("serial")
public class StudentManagementFrame extends AbsManagementFrame<Student>{
	private StudentPanel studentPanel;
	
	
	
	public StudentManagementFrame() {
		super();
	}

	@Override
	protected AbsItemPanel<Student> createItemPanel() {
		studentPanel = new StudentPanel();
		return studentPanel;
	}

	@Override
	protected Student getItem() {
		return studentPanel.getItem();
	}

	
}
