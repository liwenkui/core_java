package timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by liwenkui on 2017/3/31.
 */
public class TimerTest {
    public static void main(String [] args)
    {
        ActionListener listener = new TimePrinter();

        Timer t = new Timer(10_000,listener);
        t.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("At the tone, the time is "+new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
