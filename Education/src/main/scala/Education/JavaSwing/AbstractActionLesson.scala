package Education.JavaSwing

import java.awt.Color
import java.awt.event.ActionEvent
import javax.swing.{AbstractAction, ImageIcon, JButton, JFrame, JPanel}

object AbstractActionLesson extends App {
  val jFrame = new JFrame {}
  val panel = new JPanel()
  jFrame.add(panel)

  val button = new JButton("ЖМИ!")
  panel.add(button)

  button.addActionListener(new MyAction())

  //Позволяет опеределить свой Action для переиспользования
  class MyAction extends AbstractAction {
    override def actionPerformed(e: ActionEvent): Unit = {
      panel.setBackground(Color.BLUE)
    }
  }

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(new ImageIcon("src/img/Fish.png").getImage)
}