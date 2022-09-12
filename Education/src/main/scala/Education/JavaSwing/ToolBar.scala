package Education.JavaSwing

import javax.swing.{ImageIcon, JButton, JFrame, JPanel, JToolBar}

//ToolBar - панель инструментов
object ToolBar extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")
  val panel = new JPanel()

  val toolBar = new JToolBar("Title") //меню инструментов
  val button = new JButton("One")
  button.setToolTipText("It is ONE")  //описание инструмента при наведении
  toolBar.add(button)
  toolBar.add(new JButton("two"))
  toolBar.addSeparator()
  toolBar.add(new JButton("two"))

  panel.add(toolBar)

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)

  jFrame.add(panel)
}
