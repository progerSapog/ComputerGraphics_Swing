package Education.JavaSwing.Layouts

import java.awt.BorderLayout
import javax.swing.{ImageIcon, JButton, JFrame}

object BorderLayoutLesson extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")

  //BorderLayout - разделение по 4 сторонам света + центр
  jFrame.add(new JButton("one"), BorderLayout.NORTH)
  jFrame.add(new JButton("two"), BorderLayout.WEST)
  jFrame.add(new JButton("three"), BorderLayout.SOUTH)
  jFrame.add(new JButton("four"), BorderLayout.EAST)
  jFrame.add(new JButton("five"), BorderLayout.CENTER)

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)
}
