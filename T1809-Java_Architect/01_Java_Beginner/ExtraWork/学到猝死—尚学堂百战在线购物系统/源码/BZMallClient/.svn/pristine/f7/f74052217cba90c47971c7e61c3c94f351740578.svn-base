package com.xdcs.swing.merchant;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.TextArea;
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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.xdcs.util.SocketUtil;
import com.xdcs.vo.Goods;

/**
 * 商品详细信息
 * 
 * @author Administrator
 *
 */
public class GoodMsg extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private TextArea textArea;

	private JList list;
	private List<Goods> goods;
	private Goods good;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GoodMsg frame = new GoodMsg();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 创建商品信息 初始化控件以及添加事件
	 */
	public GoodMsg() {
		setTitle("查看商品信息");
		setBounds(100, 100, 390, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 383, 457);
		contentPane.add(panel);

		JLabel label = new JLabel("查看商品信息");
		label.setToolTipText("");
		label.setFont(new Font("华文楷体", Font.BOLD, 25));
		label.setBounds(115, 10, 180, 33);
		panel.add(label);

		JLabel label_1 = new JLabel("商品编号");
		label_1.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_1.setBounds(37, 61, 80, 15);
		panel.add(label_1);

		JLabel label_2 = new JLabel("商品名称");
		label_2.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_2.setBounds(37, 99, 80, 15);
		panel.add(label_2);

		JLabel label_3 = new JLabel("商品价格");
		label_3.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_3.setBounds(37, 139, 80, 15);
		panel.add(label_3);

		JLabel label_4 = new JLabel("商品类型");
		label_4.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_4.setBounds(37, 187, 80, 15);
		panel.add(label_4);

		JLabel label_5 = new JLabel("商品品牌");
		label_5.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_5.setBounds(37, 230, 80, 15);
		panel.add(label_5);

		JLabel label_6 = new JLabel("剩余数量");
		label_6.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_6.setBounds(37, 386, 80, 15);
		panel.add(label_6);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(135, 58, 195, 24);
		panel.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 96, 195, 24);
		panel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(135, 136, 195, 21);
		panel.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(135, 184, 195, 24);
		panel.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(135, 227, 195, 24);
		panel.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(135, 383, 195, 24);
		panel.add(textField_5);

		JLabel label_7 = new JLabel("商品描述");
		label_7.setFont(new Font("华文楷体", Font.BOLD, 18));
		label_7.setBounds(37, 270, 80, 15);
		panel.add(label_7);

		textArea = new TextArea();
		textArea.setBounds(135, 263, 195, 100);
		panel.add(textArea);

		JButton button = new JButton("修改");
		// 为修改按钮添加事件
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 先将要修改的商品在商品列表移除
				goods.remove(good);
				// 重新为商品信息赋值
				good.setGoodName(textField_1.getText());
				good.setGoodPrice(Double.parseDouble(textField_2.getText()));
				good.setGoodType(textField_3.getText());
				good.setGoodBrand(textField_4.getText());
				good.setGoodRepertory(Integer.parseInt(textField_5.getText()));
				good.setGoodDesception(textArea.getText());
				// 新的商品传输到后台
				ObjectOutputStream oos = SocketUtil.getObjectOutputStream();
				ObjectInputStream ois = SocketUtil.getObjectInputStream();

				List<Object> ll = new ArrayList<>();
				ll.add("modifyGoods");
				ll.add(good);

				try {
					// 将信息传到后台
					oos.writeObject(ll);
					oos.flush();
					// 获取后台返回的信息
					ll = (List<Object>) ois.readObject();
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
				boolean bool = Boolean.parseBoolean(ll.get(0).toString());
				if (bool) {
					goods.add(good);
					list.setListData(goods.toArray());
					JOptionPane.showMessageDialog(null, "商品修改成功");
					GoodMsg.this.setVisible(false);
				}
			}
		});
		button.setBounds(50, 424, 100, 23);
		button.setFont(new Font("华文楷体", Font.BOLD, 18));
		panel.add(button);

		JButton update = new JButton("关闭");
		update.setFont(new Font("华文楷体", Font.BOLD, 18));
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GoodMsg.this.setVisible(false);
			}
		});
		update.setBounds(200, 424, 100, 23);
		panel.add(update);

		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(GoodMsg.class.getResource("/com/xdcs/swing/image/imagebig.png")));
		label_8.setBounds(0, 0, 383, 457);
		panel.add(label_8);
	}

	/**
	 * 重写构造方法，接受更多参数
	 * 
	 * @param good
	 * @param list
	 * @param goods
	 * @throws HeadlessException
	 */
	public GoodMsg(Goods good, JList list, List<Goods> goods) throws HeadlessException {
		this();
		this.good = good;
		this.list = list;
		this.goods = goods;
		textField.setText(good.getID());
		textField_1.setText(good.getGoodName());
		textField_2.setText(Double.toString(good.getGoodPrice()));
		textField_3.setText(good.getGoodType());
		textField_4.setText(good.getGoodBrand());
		textField_5.setText(Integer.toString(good.getGoodRepertory()));
		textArea.setText(good.getGoodDesception());
	}

}
