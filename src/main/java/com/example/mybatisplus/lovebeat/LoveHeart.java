package com.example.mybatisplus.lovebeat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

class Heart extends JFrame {
    //定义窗口大小
    private static final int WIDTH = 1200;
    private static final int HEIGHT = 800;
    //获取屏幕大小
    private static final int WINDOW_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static final int WINDOW_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;

    //构造函数
    public Heart() {
        //设置窗口标题
        super("刘蓉蓉♥");
        //设置背景色
        this.setBackground(Color.BLACK);
        //设置窗口位置
        this.setLocation((WINDOW_WIDTH - WIDTH) / 2, (WINDOW_HEIGHT - HEIGHT) / 2);
        //设置窗口大小
        this.setSize(WIDTH, HEIGHT);
        //设置窗口布局
        this.setLayout(getLayout());
        //设置窗口可见
        this.setVisible(true);
        //设置窗口的默认关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //图形函数
    public void paint(Graphics g) {
        //横纵坐标及半径
        double x, y, r;
        //绘制图形
        double z = 0.0;
        double size = 10;
        int jj = 0;
        while (true) {
            Image image = this.createImage(WIDTH, HEIGHT);
            Graphics pic = image.getGraphics();
            if (jj % 2 == 0) {
                size = 14.5;
            } else {
                size = 15;
            }
            for (int ii = 30; ii > 0; ii--) {
                Color color = new Color(255, 175, (int) (20 * Math.random()) + 220);
                for (int i = 1; i < 1000; i++) {
                    int px = (int) (Math.random() * 10);
                    int py = (int) (Math.random() * 10);
                    x = 16 * (Math.sin(z) * Math.sin(z) * Math.sin(z)) * (size) +
                            Math.pow((-1), px) * Math.random() * ii * Math.sqrt(ii) + WIDTH / 2;
                    y = -(13 * Math.cos(z) - 5 * Math.cos(2 * z) - 2 * Math.cos(3 * z) - Math.cos(4 * z)) * (size) +
                            Math.pow((-1), py) * Math.random() * ii * Math.sqrt(ii) + HEIGHT / 3;
                    z += (Math.PI / 2.0) / 80;
                    pic.setColor(color);
                    pic.setColor(new Color(233, 163, 190));
                    pic.fillOval((int) x, (int) y, 2, 2);
                }
                if (ii < 3) {
                    pic.setFont(new Font("楷体", Font.BOLD, 40));//设置字体
                    pic.setColor(Color.pink);
                    pic.drawString("刘蓉蓉", WIDTH / 2 -60, 240);//绘制字符串
//                    pic.drawString("HGQ", WIDTH / 2, 280);//绘制字符串
                    g.drawImage(image, 0, 0, this);
                }
            }
            jj++;
            if (jj > 100) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class LoveHeart {
    public static void main(String[] args) {
        new Heart();
    }
}
