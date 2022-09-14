package Education.JavaSwing

import javax.swing.{ImageIcon, JButton, JFrame, JPanel}

//Фокус
object Focus extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")
  val panel = new JPanel()

  panel.add(new JButton("one"))
  panel.add(new JButton("two")).setFocusable(false)   //не может иметь фокуса
  panel.add(new JButton("three"))
  panel.add(new JButton("four")).requestFocusInWindow()   //фокус сразу на третьем элементе

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)

  jFrame.add(panel)
}
