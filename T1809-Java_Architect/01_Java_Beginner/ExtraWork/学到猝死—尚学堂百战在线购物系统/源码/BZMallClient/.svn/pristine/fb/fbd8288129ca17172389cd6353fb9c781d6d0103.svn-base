package com.xdcs.swing.consumer;

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
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import com.xdcs.util.CellRenderer;
import com.xdcs.util.SocketUtil;
import com.xdcs.vo.Goods;
import com.xdcs.vo.Order;
import com.xdcs.vo.Order.GoodsItem;
import com.xdcs.vo.User;

/**
 * 买家主页面
 * 
 * @author Administrator
 *
 */
public class ConsumerMain extends JFrame {

	private JPanel contentPane;
	private JTextField lycosField;
	private JList list;
	private JButton orderButton;
	private JButton cartButton;
	private JButton button_1;
	private JLabel lblNewLabel_1;
	private JComboBox<String> type;
	private User user;
	private List<Goods> goods;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;

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
		new ConsumerMain().setVisible(true);
	}

	/**
	 * 创建买家主页面并添加控件以及事件
	 */
	public ConsumerMain() {
		oos = SocketUtil.getObjectOutputStream();
		ois = SocketUtil.getObjectInputStream();
		setTitle("首页窗口");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 553, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lycosField = new JTextField();
		lycosField.setForeground(Color.LIGHT_GRAY);
		lycosField.setText("请输入搜索内容");
		lycosField.setBounds(130, 10, 320, 30);
		contentPane.add(lycosField);
		lycosField.setColumns(10);
		lycosField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lycosField.setText("");
			}
		});
		
		//关闭事件
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				if (!SocketUtil.socketEmpty()) {
					List list = new ArrayList<>();
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

		// 设置combox
		type = new JComboBox<>();
		type.setBounds(10, 10, 100, 30);
		contentPane.add(type);
		type.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (type.getSelectedIndex() != 0) {
					List<Goods> goodList = new ArrayList<>();
					for (Goods good : goods) {
						if (good.getGoodType().equals(type.getSelectedItem())) {
							goodList.add(good);
						}
					}
					list.setListData(goodList.toArray());
				} else {
					list.setListData(goods.toArray());
				}

			}
		});

		JButton lycosButton = new JButton("");
		lycosButton.setIcon(new ImageIcon(ConsumerMain.class.getResource("../image/lycos.png")));
		lycosButton.setBounds(453, 10, 31, 30);
		contentPane.add(lycosButton);
		lycosButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					List findList = new ArrayList<>();
					findList.add("findGoodsByName");
					findList.add(lycosField.getText());

					oos.writeObject(findList);
					oos.flush();

					List<Goods> goodList = (List<Goods>) ois.readObject();
					list.setListData(goodList.toArray());

				} catch (IOException | ClassNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		});

		list = new JList<String>();
		list.setFont(new Font("华文楷体", Font.BOLD, 18));
		list.setCellRenderer(new CellRenderer());
		// list.setBounds(10, 61, 506, 272);
		list.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Goods good = (Goods) list.getSelectedValue();
				GoodsInfo gi = new GoodsInfo(good, user);
				gi.setVisible(true);

			}
		});
		// contentPane.add(list);
		JScrollPane jsp = new JScrollPane();
		jsp.setBounds(10, 61, 506, 272);
		contentPane.add(jsp);
		jsp.setViewportView(list);

		orderButton = new JButton("查看订单信息");
		orderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderInfo jf = new OrderInfo(user, goods);
				List msgList = new ArrayList<>();
				msgList.add("findAllOrder");
				msgList.add(user.getID());

				List<Order> orderList;
				try {
					//System.out.println("oos++++++");
					oos.writeObject(msgList);
					oos.flush();
					//System.out.println("ois+++---");
					orderList = (List<Order>) ois.readObject();

					for (int i = 0; i < orderList.size(); i++) {
						if (!orderList.get(i).isCheckPay()) {
							orderList.remove(i);
							i--;
						}
					}

					jf.getList().setListData(orderList.toArray());
					jf.setVisible(true);
				} catch (ClassNotFoundException | IOException e1) {
					e1.printStackTrace();
				}

			}
		});
		orderButton.setBackground(Color.WHITE);
		orderButton.setFont(new Font("华文楷体", Font.BOLD, 16));
		orderButton.setBounds(10, 362, 153, 36);
		orderButton.setContentAreaFilled(false);
		contentPane.add(orderButton);

		cartButton = new JButton("查看购物车");
		cartButton.setFont(new Font("华文楷体", Font.BOLD, 16));
		cartButton.setBackground(Color.WHITE);
		cartButton.setBounds(183, 362, 159, 36);
		cartButton.setContentAreaFilled(false);
		cartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				List msgList = new ArrayList<>();
				msgList.add("findAllOrder");
				msgList.add(user.getID());

				List<Order> orderList;

				//System.out.println("oos++++++");
				try {
					oos.writeObject(msgList);
					oos.flush();
					//System.out.println("ois+++---");
					orderList = (List<Order>) ois.readObject();

					for (int i = 0; i < orderList.size(); i++) {
						if (orderList.get(i).isCheckPay()) {
							orderList.remove(i);
							i--;
						}
					}
					//System.out.println("=========================" + goods);
					GoodCart gc = new GoodCart(user, orderList, goods, ConsumerMain.this.list);

					StringBuilder sb = new StringBuilder();
					List<GoodsItem> goodList = new ArrayList<>();
					List<GoodMess> mesList = new ArrayList<>();
					// TODO
					for (Order order : orderList) {
						goodList = order.getGoodsList();
						for (GoodsItem goodsItem : goodList) {
							GoodMess gm = new GoodMess();
							for (Goods good : goods) {
								if (goodsItem.getGoodID().equals(good.getID())) {
									gm.setGoodName(good.getGoodName());
									gm.setGoodPrice(good.getGoodPrice());
								}
							}
							gm.setSellCout(goodsItem.getCount());
							mesList.add(gm);
						}
					}
					gc.getList().setListData(mesList.toArray());
					gc.setVisible(true);
				} catch (IOException | ClassNotFoundException e1) {
					e1.printStackTrace();
				}

			}
		});
		contentPane.add(cartButton);

		button_1 = new JButton("修改个人信息");
		button_1.setFont(new Font("华文楷体", Font.BOLD, 16));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(363, 362, 153, 36);
		button_1.setContentAreaFilled(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new UserInfo(user).setVisible(true);
			}
		});
		contentPane.add(button_1);
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ConsumerMain.class.getResource("../image/imagebig.png")));
		lblNewLabel_1.setBounds(0, 0, 587, 420);
		contentPane.add(lblNewLabel_1);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				super.windowClosing(e);
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

	public ConsumerMain(User user) {
		this();
		this.user = user;
	}

	public ConsumerMain(User user, List<Goods> goods) {
		this(user);
		this.goods = goods;
		List<String> typeList = new ArrayList<>();
		type.addItem("---请选择---");
		for (int i = 0; i < goods.size(); i++) {
			if (!typeList.contains(goods.get(i).getGoodType())) {
				typeList.add(goods.get(i).getGoodType());
				type.addItem(goods.get(i).getGoodType());
			}
		}

	}

	/**
	 * 商品信息显示格式化
	 * 
	 * @author Administrator
	 *
	 */
	class GoodMess {
		private String goodName;
		private int sellCout;
		private double goodPrice;

		public GoodMess() {
		}

		public String getGoodName() {
			return goodName;
		}

		public void setGoodName(String goodName) {
			this.goodName = goodName;
		}

		public int getSellCout() {
			return sellCout;
		}

		public void setSellCout(int sellCout) {
			this.sellCout = sellCout;
		}

		public double getGoodPrice() {
			return goodPrice;
		}

		public void setGoodPrice(double goodPrice) {
			this.goodPrice = goodPrice;
		}

		@Override
		public String toString() {
			StringBuilder str = new StringBuilder("商品名:" + goodName);
			for (int i = goodName.length() * 3; i < 24; i++) {
				str.append(" ");
			}
			str.append("单价：" + goodPrice);
			for (int i = Double.toString(goodPrice).length(); i < 16; i++) {
				str.append(" ");
			}
			str.append("购买数量" + sellCout);
			for (int i = Integer.toString(sellCout).length(); i < 16; i++) {
				str.append(" ");
			}

			return str.toString();
		}
	}
}
