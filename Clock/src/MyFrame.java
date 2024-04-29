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
	SimpleDateFormat dFormat;
	SimpleDateFormat dateFormat;
	JLabel tLabel;
	JLabel dLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setResizable(false);
		
		
		tFormat = new SimpleDateFormat("hh:mm:ss a");
		dFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
		
		tLabel = new JLabel();
		tLabel.setFont(new Font("Verdana" , Font.PLAIN, 50));
		tLabel.setForeground(Color.GREEN);
		tLabel.setBackground(Color.BLACK);
		tLabel.setOpaque(true);
		
		dLabel = new JLabel();
		dLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));
		
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));
		
		
		this.add(tLabel);
		this.add(dLabel);
		this.add(dateLabel);
		this.setVisible(true);
		
		setTime();
	}
	
	public void setTime() {
		
		while(true) {
		time = tFormat.format(Calendar.getInstance().getTime());
		tLabel.setText(time);
		
		day = dFormat.format(Calendar.getInstance().getTime());
		dLabel.setText(day);
		
		date = dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);

		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	}
}

}
