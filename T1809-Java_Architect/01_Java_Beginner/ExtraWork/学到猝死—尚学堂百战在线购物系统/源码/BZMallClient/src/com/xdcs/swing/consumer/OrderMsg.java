package com.xdcs.swing.consumer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.xdcs.util.SocketUtil;
import com.xdcs.vo.Goods;
import com.xdcs.vo.Order;
import com.xdcs.vo.Order.GoodsItem;
import com.xdcs.vo.User;

/**
 * 购物车
 * 
 * @author Administrator
 *
 */

public class OrderMsg extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField mer;
	private JTextField rev;
	private JTextField del;
	private JTextField pay;
	private JList list;
	private User user;
	private List<Order> orderList;

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new OrderMsg().setVisible(true);
		;
	}

	/**
	 * Create the frame.
	 */
	public OrderMsg() {
		setTitle("购物车");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 494, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("用户名：");
		label.setFont(new Font("华文楷体", Font.BOLD, 18));
		label.setBounds(10, 20, 76, 35);
		contentPane.add(label);

		JLabel label_1 = new JLabel("联系方式：");
		label_1.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_1.setBounds(225, 25, 100, 25);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("地址：");
		label_2.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_2.setBounds(10, 65, 60, 20);
		contentPane.add(label_2);

		textField = new JTextField();
		textField.setBounds(96, 27, 106, 21);
		textField.setEnabled(false);
		textField.setEditable(false);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setBounds(322, 27, 132, 21);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setBounds(96, 67, 358, 21);
		contentPane.add(textField_2);

		list = new JList();
		list.setFont(new Font("华文楷体", Font.BOLD, 23));
		// list.setBounds(10, 121, 458, 255);
		// contentPane.add(list);

		JScrollPane jsp = new JScrollPane();
		jsp.setBounds(10, 121, 458, 205);
		contentPane.add(jsp);
		jsp.setViewportView(list);

		JLabel payLabel = new JLabel("是否支付");
		JLabel delLabel = new JLabel("是否派送");
		JLabel revLabel = new JLabel("是否接单");

		payLabel.setBounds(10, 335, 80, 21);
		payLabel.setFont(new Font("华文楷体", Font.BOLD, 18));
		contentPane.add(payLabel);
		delLabel.setBounds(145, 335, 80, 21);
		delLabel.setFont(new Font("华文楷体", Font.BOLD, 18));
		contentPane.add(delLabel);
		revLabel.setBounds(275, 335, 80, 21);
		revLabel.setFont(new Font("华文楷体", Font.BOLD, 18));
		contentPane.add(revLabel);

		pay = new JTextField();
		pay.setBounds(95, 330, 40, 31);
		pay.setEditable(false);
		contentPane.add(pay);
		del = new JTextField();
		del.setBounds(225, 330, 40, 31);
		del.setEditable(false);
		contentPane.add(del);
		rev = new JTextField();
		rev.setBounds(355, 330, 40, 31);
		rev.setEditable(false);
		contentPane.add(rev);

		JLabel label_3 = new JLabel("详细订单信息");
		label_3.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_3.setBounds(10, 95, 120, 25);
		contentPane.add(label_3);

		JButton btnNewButton = new JButton("关闭");
		btnNewButton.setFont(new Font("华文楷体", Font.BOLD, 18));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderMsg.this.setVisible(false);
			}
		});
		btnNewButton.setBounds(380, 370, 80, 40);
		contentPane.add(btnNewButton);

		JLabel label_4 = new JLabel("金额：");
		label_4.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_4.setBounds(10, 370, 76, 50);
		contentPane.add(label_4);

		textField_3 = new JTextField();
		textField_3.setBounds(75, 385, 100, 21);
		textField_3.setEditable(false);
		textField_3.setEnabled(false);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(OrderMsg.class.getResource("/com/xdcs/swing/image/imagebig.png")));
		label_5.setBounds(0, 0, 478, 436);
		contentPane.add(label_5);
	}

	/**
	 * 重写构造方法
	 * 
	 * @param order
	 * @param user
	 * @param goods
	 */
	public OrderMsg(Order order, User user, List<Goods> goods) {
		this();
		this.textField.setText(user.getUsername());
		this.textField_1.setText(user.getTel());
		this.textField_2.setText(user.getAddress());
		List<GoodsItem> items = order.getGoodsList();
		List<Goods> gs = new ArrayList<>();
		double money = 0;
		for (Goods g : goods) {
			for (GoodsItem item : items) {
				if (item.getGoodID().equals(g.getID())) {
					money += item.getCount() * g.getGoodPrice();
					gs.add(g);
				}
			}
		}
		list.setListData(gs.toArray());
		textField_3.setText(Double.toString(money));
		if (order.isRecvOrder()) {
			rev.setText("是");
		} else {
			rev.setText("否");
		}
		if (order.isCheckPay()) {
			pay.setText("是");
		} else {
			pay.setText("否");
		}
		if (order.isDeliver()) {
			del.setText("是");
		} else {
			del.setText("否");
		}
	}

}
