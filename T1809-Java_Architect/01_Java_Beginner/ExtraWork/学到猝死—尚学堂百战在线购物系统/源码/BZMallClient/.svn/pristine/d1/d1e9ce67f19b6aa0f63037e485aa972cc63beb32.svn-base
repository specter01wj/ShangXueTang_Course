package com.xdcs.swing.merchant;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.xdcs.util.SocketUtil;
import com.xdcs.vo.Goods;
import com.xdcs.vo.Order;
import com.xdcs.vo.User;

/**
 * 卖家查看订单的frame
 * 
 * @author Administrator
 */
public class MerchantOrderFrm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel label_2;
	private JLabel label_3;
	private JList list;
	private JButton button;
	private JLabel label_4;
	private JList list_1;
	private JLabel label_5;
	private JList list_2;
	private JButton button_1;
	private JButton btnNewButton;
	private JLabel label_6;

	private List<Goods> goods;
	private List<Order> orders;
	private List<Order> recvOrders = new ArrayList<>();
	private List<Order> deliverOrders = new ArrayList<>();
	private List<Order> oldOrders = new ArrayList<>();
	private User user;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MerchantOrderFrm frame = new MerchantOrderFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 创建订单信息的页面 初始化控件并添加事件
	 */
	public MerchantOrderFrm() {
		setTitle("商家订单信息界面");
		setBounds(100, 100, 548, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("头像");
		label.setFont(new Font("华文楷体", Font.BOLD, 18));
		label.setBounds(32, 35, 54, 15);
		contentPane.add(label);

		JLabel label_1 = new JLabel("店铺名称");
		label_1.setFont(new Font("华文楷体", Font.BOLD, 20));
		label_1.setBounds(117, 32, 86, 18);
		contentPane.add(label_1);

		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(213, 32, 201, 24);
		contentPane.add(textField);
		textField.setColumns(10);

		label_2 = new JLabel("订单信息");
		label_2.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_2.setBounds(32, 82, 86, 21);
		contentPane.add(label_2);

		label_3 = new JLabel("----------------------点击订单可以查看订单信息哟！亲！----------------------------");
		label_3.setFont(new Font("华文楷体", Font.PLAIN, 15));
		label_3.setBounds(10, 63, 496, 15);
		contentPane.add(label_3);

		list = new JList();
		list.setFont(new Font("华文楷体", Font.BOLD, 18));
		// list.setBounds(32, 113, 194, 268);
		// contentPane.add(list);
		JScrollPane jsp = new JScrollPane();
		jsp.setBounds(32, 113, 194, 268);
		contentPane.add(jsp);
		jsp.setViewportView(list);

		button = new JButton("接受订单");
		button.setContentAreaFilled(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order order = (Order) list.getSelectedValue();
				// System.out.println("这里是接受订单的的得到额 按钮实际事件获取的值" + order);
				if (order == null) {
					JOptionPane.showMessageDialog(null, "接单失败,请选择接单的订单");
					return;
				}
				List<Object> ll = new ArrayList<>();
				ll.add("recvOrder");
				ll.add(order);

				ObjectInputStream ois = SocketUtil.getObjectInputStream();
				ObjectOutputStream oos = SocketUtil.getObjectOutputStream();
				boolean bool = false;
				try {
					oos.writeObject(ll);
					oos.flush();
					ll = (List<Object>) ois.readObject();

					recvOrders.remove(order);
					// MerchantMain.orders.remove(order);
					list.setListData(recvOrders.toArray());
					deliverOrders.add(order);
					list_1.setListData(deliverOrders.toArray());
					// order.setRecvOrder(true);
					// MerchantMain.orders.add(order);
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
				bool = Boolean.parseBoolean(ll.get(0).toString());
				if (bool) {
					JOptionPane.showMessageDialog(null, "成功接单");
				} else {
					JOptionPane.showMessageDialog(null, "接单失败");
				}
			}
		});
		button.setBounds(104, 391, 120, 30);
		button.setFont(new Font("华文楷体", Font.BOLD, 18));
		contentPane.add(button);

		label_4 = new JLabel("未派送");
		label_4.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_4.setBounds(275, 85, 70, 18);
		contentPane.add(label_4);

		list_1 = new JList();
		list_1.setFont(new Font("华文楷体", Font.BOLD, 18));
		// list_1.setBounds(275, 113, 236, 100);
		// contentPane.add(list_1);
		JScrollPane jsp1 = new JScrollPane();
		jsp1.setBounds(275, 113, 231, 100);
		contentPane.add(jsp1);
		jsp1.setViewportView(list_1);

		label_5 = new JLabel("已派送");
		label_5.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_5.setBounds(275, 237, 70, 15);
		contentPane.add(label_5);

		list_2 = new JList();
		list_2.setFont(new Font("华文楷体", Font.PLAIN, 15));
		// list_2.setBounds(275, 266, 231, 112);
		// contentPane.add(list_2);
		JScrollPane jsp2 = new JScrollPane();
		jsp2.setBounds(275, 266, 231, 112);
		contentPane.add(jsp2);
		jsp2.setViewportView(list_2);

		button_1 = new JButton("派送订单");
		button_1.setContentAreaFilled(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order order = (Order) list_1.getSelectedValue();
				if (order == null) {
					JOptionPane.showMessageDialog(null, "派送失败,请选择派单的订单");
					return;
				}
				List<Object> ll = new ArrayList<>();
				ll.add("deliveryOrder");
				ll.add(order);

				ObjectInputStream ois = SocketUtil.getObjectInputStream();
				ObjectOutputStream oos = SocketUtil.getObjectOutputStream();
				boolean bool = false;
				try {
					oos.writeObject(ll);
					oos.flush();
					ll = (List<Object>) ois.readObject();
					deliverOrders.remove(order);
					// MerchantMain.orders.remove(order);
					list_1.setListData(deliverOrders.toArray());
					oldOrders.add(order);
					list_2.setListData(oldOrders.toArray());
					// order.setDeliver(true);
					// MerchantMain.orders.add(order);
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
				bool = Boolean.parseBoolean(ll.get(0).toString());
				// //System.out.println("派送订单");
				if (bool) {
					JOptionPane.showMessageDialog(null, "成功派送");
				} else {
					JOptionPane.showMessageDialog(null, "派送失败");
				}
			}
		});
		button_1.setBounds(386, 223, 120, 30);
		button_1.setFont(new Font("华文楷体", Font.BOLD, 18));
		contentPane.add(button_1);

		btnNewButton = new JButton("删除订单");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBounds(384, 391, 120, 30);
		btnNewButton.setFont(new Font("华文楷体", Font.BOLD, 18));
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order order = (Order) list_2.getSelectedValue();
				if (order == null) {
					JOptionPane.showMessageDialog(null, "删除失败,请选择要删除的订单");
					return;
				}
				List<Object> ll = new ArrayList<>();
				ll.add("deleteOrder");
				ll.add(order);

				ObjectInputStream ois = SocketUtil.getObjectInputStream();
				ObjectOutputStream oos = SocketUtil.getObjectOutputStream();
				boolean bool = false;
				try {
					oos.writeObject(ll);
					oos.flush();
					ll = (List<Object>) ois.readObject();
					oldOrders.remove(order);
					list_2.setListData(oldOrders.toArray());
					// MerchantMain.orders.remove(order);

				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
				bool = Boolean.parseBoolean(ll.get(0).toString());
				if (bool) {
					JOptionPane.showMessageDialog(null, "成功删除订单");
				} else {
					JOptionPane.showMessageDialog(null, "删除订单失败");
				}
			}
		});

		list.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Order o = (Order) list.getSelectedValue();
				if (o == null) {
					JOptionPane.showMessageDialog(null, "可以选择一个在点吗~！~！");
					return;
				}
				ObjectOutputStream oos = SocketUtil.getObjectOutputStream();
				ObjectInputStream ois = SocketUtil.getObjectInputStream();
				List<Object> ll = new ArrayList<>();
				ll.add("findAllUser");
				List<User> uu = new ArrayList<>();
				try {
					oos.writeObject(ll);
					oos.flush();
					uu = (List<User>) ois.readObject();
					// //System.out.println("merchantOrder---List----只是撒大声地啊" +
					// uu.toString());
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				new OrderMsg(o, user, uu, goods).setVisible(true);
			}
		});
		list_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Order o = (Order) list_2.getSelectedValue();
				if (o == null) {
					JOptionPane.showMessageDialog(null, "可以选择一个在点吗~！~！");
					return;
				}
				ObjectOutputStream oos = SocketUtil.getObjectOutputStream();
				ObjectInputStream ois = SocketUtil.getObjectInputStream();
				List<Object> ll = new ArrayList<>();
				ll.add("findAllUser");
				List<User> uu = new ArrayList<>();
				try {
					oos.writeObject(ll);
					oos.flush();
					uu = (List<User>) ois.readObject();
					// //System.out.println("merchantOrder---List_1----只是撒大声地啊"
					// +
					// uu.toString());
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				new OrderMsg(o, user, uu, goods).setVisible(true);
			}
		});
		list_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Order o = (Order) list_1.getSelectedValue();
				if (o == null) {
					JOptionPane.showMessageDialog(null, "可以选择一个在点吗~！~！");
					return;
				}
				ObjectOutputStream oos = SocketUtil.getObjectOutputStream();
				ObjectInputStream ois = SocketUtil.getObjectInputStream();
				List<Object> ll = new ArrayList<>();
				ll.add("findAllUser");
				List<User> uu = new ArrayList<>();
				try {
					oos.writeObject(ll);
					oos.flush();
					uu = (List<User>) ois.readObject();
					// //System.out.println("merchantOrder---List_2----只是撒大声地啊"
					// +
					// uu.toString());
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				new OrderMsg(o, user, uu, goods).setVisible(true);
			}
		});

		label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(MerchantOrderFrm.class.getResource("/com/xdcs/swing/image/imagebig.png")));
		label_6.setBounds(0, 0, 532, 434);
		contentPane.add(label_6);

	}

	public MerchantOrderFrm(User user, List<Order> orders, List<Goods> goods) {
		this();
		this.orders = orders;
		this.user = user;
		this.goods = goods;
		for (int i = 0; i < orders.size(); i++) {
			// //System.out.println("Ordersssss" + orders.get(i));
			if (!orders.get(i).isCheckPay()) {
				break;
			} else if (!orders.get(i).isRecvOrder()) {
				recvOrders.add(orders.get(i));
			} else if (!orders.get(i).isDeliver()) {
				deliverOrders.add(orders.get(i));
			} else if (orders.get(i).isCheckPay() && orders.get(i).isRecvOrder() && orders.get(i).isDeliver()) {
				oldOrders.add(orders.get(i));
			}
		}
		this.textField.setText(user.getUsername());
		list.setListData(recvOrders.toArray());
		list_1.setListData(deliverOrders.toArray());
		list_2.setListData(oldOrders.toArray());
	}

}
