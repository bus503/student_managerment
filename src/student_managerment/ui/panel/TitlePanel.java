package student_managerment.ui.panel;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import student_managerment.dto.Title;

@SuppressWarnings("serial")
public class TitlePanel extends AbsItemPanel<Title> {
	private JLabel lblTitleNo;
	private JTextField tfTitleNo;
	private JLabel lblTitleName;
	private JTextField tfTitleName;

	public TitlePanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uC9C1\uCC45 \uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		lblTitleNo = new JLabel("직책번호");
		lblTitleNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTitleNo);
		
		tfTitleNo = new JTextField();
		tfTitleNo.setHorizontalAlignment(SwingConstants.LEFT);
		add(tfTitleNo);
		tfTitleNo.setColumns(10);
		
		lblTitleName = new JLabel("직책명");
		lblTitleName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTitleName);
		
		tfTitleName = new JTextField();
		tfTitleName.setHorizontalAlignment(SwingConstants.LEFT);
		add(tfTitleName);
		tfTitleName.setColumns(10);
	}
	
	@Override
	public void clearTf() {
		tfTitleNo.setText("");
		tfTitleName.setText("");
	}

	@Override
	public Title getItem() {
		String titleName= tfTitleName.getText().trim();
		int titleNo= Integer.parseInt(tfTitleNo.getText().trim());
		return new Title(titleNo,titleName);
	}
	@Override
	public void setItem(Title item) {
		tfTitleNo.setText(item.getTitleNo()+"");
		tfTitleName.setText((item.getTitleName()+""));	
	}
}
