package Education.JavaSwing.Layouts

import javax.swing.{ImageIcon, JButton, JFrame, JPanel}

object NoLayout extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")
  val panel = new JPanel()

  panel.setLayout(null)   //никакой layout
  val button = new JButton("button")  //тепер просто можно задавать всё статическими значениями
  button.setBounds(50, 50, 150, 40)
  panel.add(button)

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)

  jFrame.add(panel)
}
