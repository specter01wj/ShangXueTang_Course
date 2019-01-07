package com.xdcs.client;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import com.xdcs.swing.consumer.ConsumerMain;
import com.xdcs.swing.merchant.MerchantMain;
import com.xdcs.util.SocketUtil;
import com.xdcs.vo.Goods;
import com.xdcs.vo.User;

/**
 * 登录页面
 * 
 * @author Administrator
 *
 */
public class Login extends JFrame {
	private static Login frame;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField userField;
	private JTextField jtf_code;
	private ValidCode vcode;
	private JLabel userIcon;
	// private static PrintWriter pw;
	// private static BufferedReader br;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private Socket socket;

	/**
	 * 开启登录页面
	 * 
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws Exception {
		frame = new Login();
		frame.setVisible(true);
	}

	/**
	 * 验证码的校验
	 * 
	 * @return
	 */
	public boolean isValidCodeRight() {

		if (jtf_code == null) {
			return false;
		}
		if (vcode == null) {
			return true;
		}
		if (vcode.getCode().equalsIgnoreCase(jtf_code.getText())) {
			return true;
		}
		return false;
	}

	/**
	 * 创建登录页面 初始化控件
	 */
	public Login(){

		setTitle("登陆窗口");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(200, 200, 500, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton Loginbutton = new JButton("登录");
		// 进行登录验证
		Loginbutton.addActionListener(new ActionListener() {
			/**
			 * 按钮点击事件 将输入框中的信息封装到实体类中 传到后台进行登录校验 返回验证结果，正确登录到主页面，失败，提示登录失败信息
			 */
			public void actionPerformed(ActionEvent e) {
				// 校验验证码
				if (!frame.isValidCodeRight()) {
					JOptionPane.showMessageDialog(null, "验证码错误!");
				}
				if (frame.isValidCodeRight()) {

					// pw = SocketUtil.getPrintWriter();
					// 创建用户实体类
					User user = new User();
					// 封装用户名
					user.setUsername(userField.getText());
					// 封装密码
					user.setPassword(new String(passwordField.getPassword()));
					List<Object> list = new ArrayList<>();
					list.add("login");
					list.add(user);
					// 获取对象输出流
					oos = SocketUtil.getObjectOutputStream();
					try {
						// 将对象传到后台
						oos.writeObject(list);
						oos.flush();
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					try {
						// 读取后台传回来的验证结果
						ois = SocketUtil.getObjectInputStream();
						list = (List<Object>) ois.readObject();
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					User u = (User) list.get(1);
					// //System.out.println("UUUUUUU" + u);
					String str = list.get(0).toString();
					List<Goods> goods = (List<Goods>) list.get(2);
					if (goods == null) {
						JOptionPane.showMessageDialog(null, "商品已经买完了,请下次再来吧");
					}
					// //System.out.println("这是返回来的goods信息" + goods);
					// //System.out.println(str);
					boolean bool = Boolean.parseBoolean(str);
					if (bool) {
						frame.setVisible(false);
						if (u.getType().equals("普通用户")) {
							// 2参数 用户 商品
							ConsumerMain cm = new ConsumerMain(u, goods);
							cm.getList().setListData(goods.toArray());
							cm.setVisible(true);
						} else if (u.getType().equals("商家")) {
							new MerchantMain(u, goods).setVisible(true);
						}
					} else {
						JOptionPane.showMessageDialog(null, "想登陆没门");
						// System.out.println("想登陆没门");
					}

				}
			}
		});
		Loginbutton.setForeground(Color.BLACK);
		Loginbutton.setFont(new Font("华文楷体", Font.BOLD, 16));
		Loginbutton.setContentAreaFilled(false);
		Loginbutton.setBounds(300, 240, 120, 30);
		contentPane.add(Loginbutton);

		JLabel segisterLable = new JLabel("注册");
		segisterLable.setHorizontalAlignment(SwingConstants.RIGHT);
		segisterLable.setForeground(Color.BLACK);
		segisterLable.setFont(new Font("华文宋体", Font.BOLD, 13));
		segisterLable.setBounds(170, 240, 79, 29);
		// 跳转注册页面 鼠标点击事件
		segisterLable.addMouseListener(new MouseAdapter() {
			/**
			 * 跳转注册页面
			 */
			public void mouseClicked(MouseEvent e) {
				JFrame jf = new Regist();
				jf.setVisible(true);
			}
		});
		contentPane.add(segisterLable);

		passwordField = new JPasswordField();
		passwordField.setBounds(273, 143, 141, 21);
		contentPane.add(passwordField);

		jtf_code = new JTextField();
		jtf_code.setBounds(273, 190, 70, 25);
		contentPane.add(jtf_code);

		JLabel l = new JLabel("验证码");
		l.setFont(new Font("华文楷体", Font.BOLD, 18));
		l.setBounds(195, 188, 88, 30);
		contentPane.add(l);

		vcode = new ValidCode();
		vcode.setBounds(360, 184, 80, 40);
		contentPane.add(vcode);

		JLabel label_1 = new JLabel("密   码");
		label_1.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_1.setBounds(195, 140, 88, 24);
		contentPane.add(label_1);

		JLabel label_3 = new JLabel("用户名");
		label_3.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_3.setBounds(195, 80, 88, 24);
		contentPane.add(label_3);

		userIcon = new JLabel("");
		userIcon.setBounds(50, 80, 130, 130);
		contentPane.add(userIcon);
		userIcon.setIcon(new ImageIcon("src/com/xdcs/swing/image/defaultIcon.jpg"));

		userField = new JTextField();
		userField.setColumns(10);
		userField.setBounds(273, 83, 141, 21);
		contentPane.add(userField);
		userField.addFocusListener(new FocusAdapter() {

			/**
			 * 增加焦点离开事件 焦点离开触发头像更换事件
			 */
			@Override
			public void focusLost(FocusEvent e) {
				if (!"".equals(userField.getText())) {
					oos = SocketUtil.getObjectOutputStream();
					ois = SocketUtil.getObjectInputStream();
					List<Object> mesList = new ArrayList<>();
					mesList.add("getIcon");
					mesList.add(new User(null, userField.getText(), null, null, 0, null, null, null, null));

					try {
						oos.writeObject(mesList);
						oos.flush();

						List<Object> targetList = (List<Object>) ois.readObject();
						// JOptionPane.showMessageDialog(null,"
						// "+targetList.get(0));
						if ("true".equals(targetList.get(0))) {
							String url = (String) targetList.get(1);
							userIcon.setIcon(new ImageIcon(url));
						} else {
							userIcon.setIcon(new ImageIcon("src/com/xdcs/swing/image/defaultIcon.jpg"));
						}

					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		});
		userField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				// if (!"".equals(userField.getText())) {
				// oos = SocketUtil.getObjectOutputStream();
				// ois = SocketUtil.getObjectInputStream();
				// List<Object> mesList = new ArrayList<>();
				// mesList.add("getIcon");
				// mesList.add(new User(null, userField.getText(), null, null,
				// 0, null, null, null, null));
				//
				// try {
				// oos.writeObject(mesList);
				// oos.flush();
				//
				// List<Object> targetList = (List<Object>) ois.readObject();
				// // JOptionPane.showMessageDialog(null,"
				// // "+targetList.get(0));
				// if ("true".equals(targetList.get(0))) {
				// String url = (String) targetList.get(1);
				// userIcon.setIcon(new ImageIcon(url));
				// } else {
				// userIcon.setIcon(new
				// ImageIcon("src/com/xdcs/swing/image/defaultIcon.jpg"));
				// }
				//
				// } catch (IOException e1) {
				// e1.printStackTrace();
				// } catch (ClassNotFoundException e1) {
				// // TODO Auto-generated catch block
				// e1.printStackTrace();
				// }
				// }
			}
		});

		// userField.addMouseListener(new MouseListener() {
		//
		// @Override
		// public void mouseReleased(MouseEvent e) {
		//
		// }
		//
		// @Override
		// public void mousePressed(MouseEvent e) {
		//
		// }
		//
		// @Override
		// public void mouseExited(MouseEvent e) {
		// if(!"".equals(userField.getText())){
		// oos = SocketUtil.getObjectOutputStream();
		// ois = SocketUtil.getObjectInputStream();
		// List<Object> mesList = new ArrayList<>();
		// mesList.add("getIcon");
		// mesList.add(new User(null, userField.getText(), null, null, 0, null,
		// null, null, null));
		//
		// try {
		// oos.writeObject(mesList);
		// oos.flush();
		//
		// List<Object> targetList = (List<Object>) ois.readObject();
		// //JOptionPane.showMessageDialog(null," "+targetList.get(0));
		// if("true".equals(targetList.get(0))){
		// String url =(String) targetList.get(1);
		// userIcon.setIcon(new ImageIcon(url));
		// }else{
		// userIcon.setIcon(new
		// ImageIcon("src/com/xdcs/swing/image/defaultIcon.jpg"));
		// }
		//
		// } catch (IOException e1) {
		// e1.printStackTrace();
		// } catch (ClassNotFoundException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		// }
		// }

		JLabel label_4 = new JLabel("Welcome LILY Market");
		label_4.setFont(new Font("Algerian", Font.BOLD, 27));
		label_4.setBounds(80, 20, 326, 51);
		contentPane.add(label_4);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("../swing/image/imagebig.png")));
		lblNewLabel.setBounds(0, 0, 500, 333);
		contentPane.add(lblNewLabel);
		// 添加关闭窗体关闭socket事件
		this.addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				super.windowClosed(e);
				if (!SocketUtil.socketEmpty()) {
					List<Object> list = new ArrayList<>();
					list.add("closeSocket");
					ObjectOutputStream oos = SocketUtil.getObjectOutputStream();
					try {
						oos.writeObject(list);
						oos.flush();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				System.exit(0);
			}
		});
	}
}
