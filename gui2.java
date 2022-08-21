import java.awt.*;
import java.awt.event.*;
class frame extends Frame{
 	protected Label l;
 	frame(){
           l=new Label();
           l.setBounds(10,10,100,150);
           add(l);
           addMouseMotionListener(new gui2(this));
           setSize(400,400);
           setLayout(null);
           setVisible(true);
 	}
 	
 	public class gui2 extends MouseMotionAdapter{
 	  frame fr;
 	  gui2(frame f){
 	  	fr=f;
 	  }
 	  public void mouseDragged(MouseEvent me){
 	  	fr.l.setText("Mouse Dragged");
 	  }
 	  public  void main(String[] args){
 	  	new frame();
 	  }
 	
 	}

}
