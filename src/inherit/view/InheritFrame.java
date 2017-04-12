package inherit.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import inherit.controller.Controller;


public class InheritFrame extends JFrame
{
	
	private Controller baseController;
	private InheritPanel appPanel;
	
	
	/**
	 * Initializes the controller and panel then calls the helper method setupFrame
	 * @param baseController
	 */
	public InheritFrame(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new InheritPanel(baseController);
		
		this.setupFrame();
	}
	
	/**
	 * Sets up the conditions of the frame
	 */
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("yep");
		this.setSize(new Dimension(450, 300));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
