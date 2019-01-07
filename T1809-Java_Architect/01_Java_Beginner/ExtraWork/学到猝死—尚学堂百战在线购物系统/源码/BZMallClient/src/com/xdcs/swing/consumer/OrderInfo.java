package com.xdcs.swing.consumer;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import com.xdcs.vo.Goods;
import com.xdcs.vo.Order;
import com.xdcs.vo.User;

public class OrderInfo extends JFrame {

	private JPanel contentPane;
	private JList list;
	private User user;
	private List<Goods> goods;

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

		OrderInfo frame = new OrderInfo();
		frame.setVisible(true);
	}

	/**
	 * 创建订单信息页面并添加控件以及事件
	 */
	public OrderInfo() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 396, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/*
		 * JButton buyButton = new JButton("购买");
		 * buyButton.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { JOptionPane.showMessageDialog(null,
		 * "购买成功!"); } }); buyButton.setForeground(Color.GRAY);
		 * buyButton.setFont(new Font("微软雅黑", Font.BOLD, 22));
		 * buyButton.setBounds(254, 315, 105, 39);
		 * buyButton.setContentAreaFilled(false); contentPane.add(buyButton);
		 */
		list = new JList<String>();
		list.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		// list.setBackground(new Color(0, 0, 0, 0));
		list.setFont(new Font("华文楷体", Font.BOLD, 18));

		// list.setModel(new AbstractListModel<String>() {
		// String[] values = new String[] { "商品名称\t\t商品描述\t\t商品价格\t\t库存\t\t月销售量"
		// };
		//
		// public int getSize() {
		// return values.length;
		// }
		//
		// public String getElementAt(int index) {
		// return values[index];
		// }
		// });
		list.setBounds(10, 27, 360, 320);
		list.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Order order = (Order) list.getSelectedValue();
				if (order == null) {
					JOptionPane.showMessageDialog(null, "请选择要查看的订单！！");
					return;
				}
				new OrderMsg(order, user, goods).setVisible(true);
				;
			}
		});
		contentPane.add(list);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(OrderInfo.class.getResource("../image/client.png")));
		lblNewLabel.setBounds(0, 0, 380, 364);
		contentPane.add(lblNewLabel);
	}

	public OrderInfo(User user, List<Goods> goods) {
		this();
		this.user = user;
		this.goods = goods;
	}
}
