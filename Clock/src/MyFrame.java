import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setVisible(true);
	}

}
