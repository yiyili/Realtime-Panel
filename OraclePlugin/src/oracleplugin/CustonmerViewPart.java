/**
 * 
 */
package oracleplugin;


import java.awt.Canvas;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javafx.embed.swing.JFXPanel;
import javafx.embed.swt.FXCanvas;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;


import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import realoracle.Main;

/**
 * @author yili.yi
 *
 * ÏÂÎç2:45:12
 */
public class CustonmerViewPart extends ViewPart {

	public CustonmerViewPart(){
		super();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		
        Composite composite = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
//	        final Frame frame = SWT_AWT.new_Frame(composite);
//	        SwingUtilities.invokeLater(new Runnable() {
//	            public void run() {
//	            	JPanel swingPanel = new JPanel();
//	                JButton button = new JButton("Swing Button");
//	                swingPanel.add(button);
//	                frame.add(swingPanel);
//	            }
//	        });
//	    }	
            
		
		// TODO Auto-generated method stub
        Frame frame = SWT_AWT.new_Frame(composite);
//		JFXPanel panel = new JFXPanel();
		Main realOralce = new Main();
//		Group root = new Group();
//		root.getChildren().add(new Label("ok"));
//		Scene scene = new Scene(root, 700, 600);
////		panel.setScene(realOralce.getScene());
//		panel.setScene(scene);
		frame.add(realOralce.javafxIntoSwing());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
