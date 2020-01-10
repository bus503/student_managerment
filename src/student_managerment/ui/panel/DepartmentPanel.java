package student_managerment.ui.panel;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import student_managerment.dto.Department;
import student_managerment.dto.Student;

import java.awt.GridLayout;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class DepartmentPanel extends JPanel {
	private JLabel lblDeptNo;
	private JTextField tfDeptNo;
	private JLabel lblDeptName;
	private JTextField tfDeptName;
	private JLabel lblFloor;
	private JTextField tfFloor;

	public DepartmentPanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uD559\uACFC \uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		lblDeptNo = new JLabel("학과번호");
		lblDeptNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptNo);
		
		tfDeptNo = new JTextField();
		tfDeptNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(tfDeptNo);
		tfDeptNo.setColumns(10);
		
		lblDeptName = new JLabel("학과명");
		lblDeptName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptName);
		
		tfDeptName = new JTextField();
		tfDeptName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(tfDeptName);
		tfDeptName.setColumns(10);
		
		lblFloor = new JLabel("위치");
		lblFloor.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblFloor);
		
		tfFloor = new JTextField();
		tfFloor.setHorizontalAlignment(SwingConstants.RIGHT);
		add(tfFloor);
		tfFloor.setColumns(10);
	}
	

	public Department getDepartment() {
		String deptName= tfDeptName.getText().trim();
		int deptNo= Integer.parseInt(tfDeptNo.getText().trim());
		int floor= Integer.parseInt(tfFloor.getText().trim());
		Department department = new Department(deptName,deptNo,floor);
		return department;
	}
	public void clearTf() {
		tfDeptNo.setText("");
		tfDeptName.setText("");
		tfFloor.setText("");
	}
	
	private void setDepartment(Department dept) {
		tfDeptNo.setText(dept.getDeptNo()+"");
		tfDeptName.setText((dept.getDeptName()+""));
		tfFloor.setText(dept.getFloor()+"");
	}
}
