package Controller.Sample1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.implMember;
import Model.member;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class memberUI extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField address;
	private JTextField mobile;
	private JTextField phone;
	private JTextField nameUpdate;
	private JTextField addressUpdate;
	private JTextField idDelete;
	private JTextField idUpdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberUI frame = new memberUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public memberUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(200, 255, 214));
		panel.setBounds(25, 26, 260, 465);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("姓名");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel.setBounds(25, 30, 46, 28);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("帳號");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_1.setBounds(25, 82, 46, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("密碼");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(25, 132, 46, 28);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("地址");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(25, 187, 46, 28);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("手機");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(25, 292, 46, 28);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("電話");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1.setBounds(25, 342, 46, 28);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		name = new JTextField();
		name.setBounds(81, 32, 150, 25);
		panel.add(name);
		name.setColumns(10);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(83, 84, 150, 25);
		panel.add(username);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(83, 135, 150, 25);
		panel.add(password);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(83, 187, 150, 80);
		panel.add(address);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(83, 295, 150, 25);
		panel.add(mobile);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(83, 344, 150, 25);
		panel.add(phone);
		
		JButton add = new JButton("新增會員");
		add.setFont(new Font("微軟正黑體", Font.BOLD, 24));
		add.setBounds(61, 406, 150, 36);
		panel.add(add);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(155, 222, 133));
		panel_1.setBounds(295, 28, 567, 463);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JTextArea show = new JTextArea();
		show.setText("");
		show.setBounds(15, 195, 540, 258);
		panel_1.add(show);
		
		JLabel lblNewLabel_2 = new JLabel("姓名");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_2.setBounds(161, 107, 46, 28);
		panel_1.add(lblNewLabel_2);
		
		nameUpdate = new JTextField();
		nameUpdate.setColumns(10);
		nameUpdate.setBounds(207, 110, 80, 25);
		panel_1.add(nameUpdate);
		
		JLabel lblNewLabel_2_1 = new JLabel("地址");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(309, 103, 46, 28);
		panel_1.add(lblNewLabel_2_1);
		
		addressUpdate = new JTextField();
		addressUpdate.setColumns(10);
		addressUpdate.setBounds(354, 106, 80, 25);
		panel_1.add(addressUpdate);
		
		idDelete = new JTextField();
		idDelete.setColumns(10);
		idDelete.setBounds(207, 155, 80, 25);
		panel_1.add(idDelete);
		
		JLabel lblNewLabel_2_2 = new JLabel("ID");
		lblNewLabel_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_2.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(161, 153, 34, 28);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("會員管理系統");
		lblNewLabel_3.setFont(new Font("微軟正黑體", Font.BOLD, 28));
		lblNewLabel_3.setBounds(175, 10, 168, 43);
		panel_1.add(lblNewLabel_3);
		
		JLabel total = new JLabel(" ");
		total.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		total.setBounds(207, 63, 65, 25);
		panel_1.add(total);
		
		//新增會員
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.UI接收 getText
				 * 2.new member()
				 * 3.add(m)
				 */
				String Name=name.getText();
				String Username=username.getText();
				String Password=password.getText();
				String Address=address.getText();
				String Mobile=mobile.getText();
				String Phone=phone.getText();
				member m= new member(Name,Username,Password,Address,Mobile,Phone);
				
				new implMember().add(m);
			}
		});
		
		//查詢全部會員
		JButton queryAll = new JButton("查詢全部會員");
		queryAll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.show.setText-->queryAll1():String
				 */
				
				show.setText(new implMember().queryAll1());
				
				//共有幾筆資料
				List<member> l=new implMember().queryAll2();//查詢全部資料
				total.setText("共"+l.size()+"筆");//size()取得有幾筆資料
			}
		});
		queryAll.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		queryAll.setBounds(31, 57, 149, 36);
		panel_1.add(queryAll);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("ID");
		lblNewLabel_2_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_2_2_1.setBounds(444, 107, 34, 28);
		panel_1.add(lblNewLabel_2_2_1);
		
		idUpdate = new JTextField();
		idUpdate.setColumns(10);
		idUpdate.setBounds(477, 110, 80, 25);
		panel_1.add(idUpdate);
		
		
		//修改會員資料
		JButton fix = new JButton("修改資料");
		fix.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.nameUpdate,addressUpdate ,updateId-->getText
				 * 2.updateId-->轉成int--->queryId(id)-->member m
				 * 3.m.setName(),m.setAddress()
				 * 4.update(m)
				 */
				
				String Name=nameUpdate.getText();
				String Address=addressUpdate.getText();
				
				int ID=Integer.parseInt(idUpdate.getText());
				member m= new implMember().queryId(ID);
				m.setName(Name);
				m.setAddress(Address);
				
				new implMember().update(m);
			}
		});
		fix.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		fix.setBounds(31, 103, 120, 36);
		panel_1.add(fix);
		
		JButton delete = new JButton("刪除會員");
		delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.deleteId-->getText-->轉型-->int
				 * 2.執行 delete(id)
				 */
				
				int Id=Integer.parseInt(idDelete.getText());
				
				new implMember().delete(Id);
			}
		});
		delete.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		delete.setBounds(31, 149, 120, 36);
		panel_1.add(delete);
	}
}
