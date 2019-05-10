package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import JDBC.JDBC;
import net.proteanit.sql.DbUtils;

public class KhachHang extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -106450264968318044L;
	
	private JPanel contentPane;
	private JTextField txtCMND;
	private JTextField txtTenKH;
	private JTextField txtDT;
	private static JTable tblKhachHang;

	/**
	 * Launch the application.
	 */
	
	public static void LoadData() {
		// TODO Auto-generated method stub
		try {
          Connection conn= (Connection) JDBC.getJDBCConnection();
          String qry="select * from tblKhachHang";
          Statement st= conn.createStatement();
          ResultSet rs= st.executeQuery(qry);
          
          tblKhachHang.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KhachHang frame = new KhachHang();
					/*Load Data*/
					LoadData();
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
	public KhachHang() {
		setTitle("KHÁCH HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(5, 5, 424, 35);
		contentPane.add(panel);
		
		JLabel lblKhchHng = new JLabel("KHÁCH HÀNG");
		lblKhchHng.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblKhchHng);
		
		JLabel lblCmnd = new JLabel("CMND");
		lblCmnd.setBounds(42, 60, 69, 14);
		contentPane.add(lblCmnd);
		
		JLabel lblTnKhchHng = new JLabel("TÊN KHÁCH HÀNG");
		lblTnKhchHng.setBounds(42, 85, 94, 14);
		contentPane.add(lblTnKhchHng);
		
		JLabel lblinThoi = new JLabel("SỐ ĐIỆN THOẠI");
		lblinThoi.setBounds(42, 110, 94, 14);
		contentPane.add(lblinThoi);
		
		txtCMND = new JTextField();
		txtCMND.setBounds(146, 60, 146, 20);
		contentPane.add(txtCMND);
		txtCMND.setColumns(10);
		
		txtTenKH = new JTextField();
		txtTenKH.setColumns(10);
		txtTenKH.setBounds(146, 85, 146, 20);
		contentPane.add(txtTenKH);
		
		txtDT = new JTextField();
		txtDT.setColumns(10);
		txtDT.setBounds(146, 110, 146, 20);
		contentPane.add(txtDT);
		
		JButton btnAdd = new JButton("THÊM");
		btnAdd.addActionListener(new ActionListener() {
			/*Insert Data*/
			public void actionPerformed(ActionEvent arg0) {
				if(txtTenKH.getText()!=null || txtCMND!=null
		                || txtDT!=null){
		               try {

		            } catch (Exception e) {
		                
		            }
		        }else{
		              
		        }
			}
		});
		btnAdd.setBounds(323, 56, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("CẬP NHẬT");
		btnUpdate.setBounds(323, 81, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("XÓA");
		btnDelete.setBounds(323, 106, 89, 23);
		contentPane.add(btnDelete);
		
		tblKhachHang = new JTable();
		tblKhachHang.setBounds(5, 144, 419, 106);
		contentPane.add(tblKhachHang);
	}
}
