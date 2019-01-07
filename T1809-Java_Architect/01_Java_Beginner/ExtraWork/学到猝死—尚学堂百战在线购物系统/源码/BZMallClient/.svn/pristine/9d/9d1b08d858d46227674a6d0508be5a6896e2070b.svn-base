package com.xdcs.util;

import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import com.xdcs.vo.Goods;

/**
 * 创建JList每一项的模型
 * 
 * @author Administrator
 *
 */
public class CellRenderer extends JLabel implements ListCellRenderer {

	/*
	 * 类CellRenderer继承JLabel并实作ListCellRenderer.由于我们利用JLabel易于插图的特性，
	 * 因此CellRenderer继承了JLabel 可让JList中的每个项目都视为是一个JLabel.
	 */
	public CellRenderer() {
		setOpaque(true);
	}

	/* 从这里到结束：实作getListCellRendererComponent()方法 */
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		/*
		 * 我们判断list.getModel().getElementAt(index)所返回的值是否为null
		 */
		// if (value != null) {
		setText(value.toString());
		setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));// 加入宽度为5的空白边框
		// setFont(new Font("黑体", Font.BOLD, 12));
		if (list.getModel().getElementAt(index) instanceof Goods) {
			setIcon(new ImageIcon(((Goods) list.getModel().getElementAt(index)).getUrl()));
		}
		// }
		if (isSelected) {
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionForeground());
		} else {
			// 设置选取与取消选取的前景与背景颜色.
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}
		return this;
	}
}
