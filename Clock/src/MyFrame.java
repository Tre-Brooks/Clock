import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	
	Calendar calendar;
	SimpleDateFormat tFormat;
	JLabel tLabel;
	String time;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setResizable(false);
		
		
		tFormat = new SimpleDateFormat("hh:mm:ss a");
		
		tLabel = new JLabel();
		tLabel.setFont(new Font("Verdana" , Font.PLAIN, 50));
		tLabel.setForeground(Color.GREEN);
		tLabel.setBackground(Color.BLACK);
		tLabel.setOpaque(true);
		
		
		this.add(tLabel);
		this.setVisible(true);
		
		setTime();
	}
	
	public void setTime() {
		
		while(true) {
		time = tFormat.format(Calendar.getInstance().getTime());
		tLabel.setText(time);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	}
}

}
