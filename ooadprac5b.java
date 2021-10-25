import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ooadprac5b extends JFrame implements ItemListener
{
    int r=0,g=0,b=0;
    JCheckBox red,green,blue;
    JPanel P = new JPanel();
    JPanel P1 = new JPanel();
    JPanel cpanel = new JPanel();
    Container pane = getContentPane();


    ooadprac5b(String cd){
        super(cd);
        red = new JCheckBox("red");
        red.addItemListener(this);

        green = new JCheckBox("green");
        green.addItemListener(this);

        blue = new JCheckBox("blue");
        
        blue.addItemListener(this);        

        cpanel.add(red);
        cpanel.add(green);
        cpanel.add(blue);

        getContentPane().add(cpanel,"North");
       // cpanel.setAlignmentX(JComponent.CENTER_ALIGNMENT );
        setSize(400,400);
        setVisible(true);    

        getContentPane().add(P1);
        P1.setAlignmentX(JComponent.CENTER_ALIGNMENT );
        P1.setSize(400,400);
        P1.setVisible(true);       

        getContentPane().add(P);
        P.setAlignmentX(JComponent.CENTER_ALIGNMENT );
        setSize(400,400);
        setVisible(true);

    }

    public static void main(String[] args)
    {
        ooadprac5b cd = new ooadprac5b("Color Check Box");
        cd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void itemStateChanged(ItemEvent ie)
{

        if(ie.getItem() == red)
        if(red.isSelected()) r=255; else r=0;
            if(ie.getItem() == green)
        if(green.isSelected()) g=255; else g=0;
            if(ie.getItem() == blue)
        if(blue.isSelected()) b=255; else b=0;
	if(ie.getItem() == blue && ie.getItem() == red)
  {
        if(blue.isSelected() && red.isSelected()  ) 
        {
         b=255; 
         r=255; 
	}
        else
	{ b=0;
  	  r=0;
	}
}
	if(ie.getItem() == blue && ie.getItem() == green)
   {    if(blue.isSelected() && green.isSelected()  )
        {
         
          b=255; 
         r=255;
        
	}
      else
	{ b=0;
  	  r=0;
	}
}
	if(ie.getItem() == red && ie.getItem() == green)
   {      if(red.isSelected() && green.isSelected()  )
	{
         g=255; 
        }
        else
	{ g=0;
	}
}
        P1.setBackground(new Color(r,g,b)); 
  
          }
}
