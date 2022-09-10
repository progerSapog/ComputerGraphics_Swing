package Education.JavaSwing

import java.awt.event.ActionListener
import java.beans.EventHandler
import javax.swing.{ImageIcon, JButton, JFrame, JPanel}

object EventHandlerLesson extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")

  val panel = new JPanel()
  val button = new JButton("Во что я превратился?") //кнопку создали
  panel.add(button)
  button.addActionListener(EventHandler.create(classOf[ActionListener], jFrame, "title", "source.text"))


  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)

  jFrame.add(panel)
}