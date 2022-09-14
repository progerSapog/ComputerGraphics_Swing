package Education.JavaSwing.Layouts

import java.awt.GridLayout
import javax.swing.{ImageIcon, JButton, JFrame, JPanel}

object GridLayoutLesson extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")

  //GridLayout - типичная Grid таблица
  val panel = new JPanel()
  jFrame.add(panel)
  panel.setLayout(new GridLayout(2, 3))

  panel.add(new JButton("One"))
  panel.add(new JButton("Two"))
  panel.add(new JButton("Three"))
  panel.add(new JButton("Four"))

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)
}
