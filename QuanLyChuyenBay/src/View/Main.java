package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

import net.bytebuddy.implementation.bytecode.Addition;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Main {

	private JFrame frmMnHnhChnh;
	private JMenu menuHeThong;
	private JMenu menuQuanLy;
	private JMenu menuChucNang;
	private JMenu menuBaoCao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main(0);
					
					window.frmMnHnhChnh.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main(int type) {
		initialize();
		if(type == 2)
		{
			menuQuanLy.setVisible(false);
			menuBaoCao.setVisible(false);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
		frmMnHnhChnh = new JFrame();
		frmMnHnhChnh.setTitle("Màn hình chính");
		frmMnHnhChnh.setBounds(100, 100, 537, 368);
		frmMnHnhChnh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMnHnhChnh.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JMenuBar menuBar = new JMenuBar();
		frmMnHnhChnh.setJMenuBar(menuBar);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		GroupLayout groupLayout = new GroupLayout(frmMnHnhChnh.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(200)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
					.addGap(250))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(tabbedPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
		);
		frmMnHnhChnh.getContentPane().setLayout(groupLayout);
		frmMnHnhChnh.setVisible(true);
		
	    menuHeThong = new JMenu("Hệ thống");
		menuHeThong.setIcon(new ImageIcon(Main.class.getResource("/com/sun/java/swing/plaf/windows/icons/HardDrive.gif")));
		menuBar.add(menuHeThong);
		
		JMenuItem itemQuyDinh = new JMenuItem("Quy định");
		itemQuyDinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuyDinh qd = new QuyDinh();
				tabbedPane.addTab("Quy định", qd.getContentPane());
				if (tabbedPane.getComponentCount() > 1)
				{
					tabbedPane.remove(0);
				}
			}
		});
		menuHeThong.add(itemQuyDinh);
		
		JMenuItem itemLogout = new JMenuItem("Đăng xuất");
		menuHeThong.add(itemLogout);
		
		JMenuItem itemExit = new JMenuItem("Thoát");
		itemExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		menuHeThong.add(itemExit);
		
		menuQuanLy = new JMenu("Quản Lý");
		menuQuanLy.setIcon(new ImageIcon(Main.class.getResource("/com/sun/javafx/scene/web/skin/Paste_16x16_JFX.png")));
		menuBar.add(menuQuanLy);
		
		JMenuItem itemQLSanBay = new JMenuItem("Sân bay");
		itemQLSanBay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SanBay dn = new SanBay();
				tabbedPane.addTab("Sân bay", dn.getContentPane());
				if (tabbedPane.getComponentCount() > 1)
				{
					tabbedPane.remove(0);
				}
			}
		});
		menuQuanLy.add(itemQLSanBay);
		
		
		JMenuItem itemQuanLyChuyenBay = new JMenuItem("Chuyến bay");
		itemQuanLyChuyenBay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLyChuyenBay qlcb = new QuanLyChuyenBay();
				tabbedPane.addTab("Quản lý chuyến bay", qlcb.getContentPane());
				if (tabbedPane.getComponentCount() > 1)
				{
					tabbedPane.remove(0);
				}
			}
		});
		menuQuanLy.add(itemQuanLyChuyenBay);
		
//		JMenuItem itemQLTuyenBay = new JMenuItem("Quản lý tuyến bay");
//		itemQLTuyenBay.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				TuyenBay tb = new TuyenBay();
//				tabbedPane.addTab("Tuyến bay", tb.getContentPane());
//				if (tabbedPane.getComponentCount() > 1)
//				{
//					tabbedPane.remove(0);
//				}
//			}
//		});
//		menuQuanLy.add(itemQLTuyenBay);
//		
//		JMenuItem itemQLMayBay = new JMenuItem("Quản lý máy bay");
//		itemQLMayBay.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		menuQuanLy.add(itemQLMayBay);
//		
//		JMenuItem itemQLLichBay = new JMenuItem("Quản lý lịch bay");
//		itemQLLichBay.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		menuQuanLy.add(itemQLLichBay);
		
//		JMenuItem itemQLHangVe = new JMenuItem("Quản lý hạng vé");
//		itemQLHangVe.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		menuQuanLy.add(itemQLHangVe);
		
		JMenuItem itemQLGiaVe = new JMenuItem("Cập nhật giá vé");
		itemQLGiaVe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gia g = new Gia();
				tabbedPane.addTab("Giá Vé", g.getContentPane());
				if (tabbedPane.getComponentCount() > 1)
				{
					tabbedPane.remove(0);
				}
			}
		});
		menuQuanLy.add(itemQLGiaVe);
		
		menuChucNang = new JMenu("Chức năng");
		menuChucNang.setIcon(new ImageIcon(Main.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		menuBar.add(menuChucNang);
		
		JMenuItem itemDanhSachChuyenBay = new JMenuItem("Danh sách chuyến bay");
		itemDanhSachChuyenBay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DanhSachChuyenBay ds = new DanhSachChuyenBay();
				tabbedPane.addTab("Danh Sách Chuyến Bay", ds.getContentPane());
				if (tabbedPane.getComponentCount() > 1)
				{
					tabbedPane.remove(0);
				}
			}
		});
		menuChucNang.add(itemDanhSachChuyenBay);
		
		JMenuItem itemKhachHang = new JMenuItem("Khách Hàng");
		itemKhachHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KhachHang kh = new KhachHang();
				tabbedPane.addTab("Danh Sách Chuyến Bay", kh.getContentPane());
				if (tabbedPane.getComponentCount() > 1)
				{
					tabbedPane.remove(0);
				}
			}
		});
		menuChucNang.add(itemKhachHang);
		
		menuBaoCao = new JMenu("Báo cáo");
		menuBaoCao.setIcon(new ImageIcon(Main.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		menuBar.add(menuBaoCao);
		
		JMenuItem itemDTBVThang = new JMenuItem("Doanh thu bán vé tháng");
		itemDTBVThang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BaoCaoDoanhThuThang dtt = new BaoCaoDoanhThuThang();
				tabbedPane.addTab("Doanh Thu Tháng", dtt.getContentPane());
				if (tabbedPane.getComponentCount() > 1)
				{
					tabbedPane.remove(0);
				}
			}
		});
		menuBaoCao.add(itemDTBVThang);
		
		JMenuItem itemDTBVNam = new JMenuItem("Doanh thu bán vé năm");
		itemDTBVNam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BaoCaoDoanhThuNam bcn = new BaoCaoDoanhThuNam();
				tabbedPane.addTab("Doanh Thu Năm", bcn.getContentPane());
				if (tabbedPane.getComponentCount() > 1)
				{
					tabbedPane.remove(0);
				}
			}
		});
		menuBaoCao.add(itemDTBVNam);
	}

}
