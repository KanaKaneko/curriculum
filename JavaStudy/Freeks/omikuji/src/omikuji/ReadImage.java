package omikuji;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ReadImage extends JPanel {
    static final int WIDTH = 2800;  // 画面の幅
    static final int HEIGHT = 1800; // 画面の高さ
    Image img; // 画像オブジェクト
 
    // コンストラクタ（初期化処理）
    public ReadImage() {
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        // 画像ファイルの読み込み
        try {
            img = ImageIO.read(new File("大吉.JPG"));
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }
 
    // 画面描画
    public void paintComponent(Graphics g) {
        // 背景
        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        // 画像の表示
        g.drawImage(img, 0, 0,2800,1800, null);
    }
 
    // 起動時
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.getContentPane().setLayout(new FlowLayout());
        f.getContentPane().add(new ReadImage());
        f.pack();
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}