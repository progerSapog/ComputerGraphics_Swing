package Education.JavaSwing

import javax.swing.{ImageIcon, JFrame, JMenuItem, JPanel, JPopupMenu}

//Popup menu - меню при нажатии ПКМ
object PopupMenu extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")
  val panel = new JPanel()

  //Popup Menu
  val popupMenu = new JPopupMenu()
  popupMenu.add(new JMenuItem("One"))
  popupMenu.add(new JMenuItem("Two"))
  popupMenu.add(new JMenuItem("Three"))
  popupMenu.add(new JMenuItem("Four"))

  panel.setComponentPopupMenu(popupMenu)

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)

  jFrame.add(panel)
}
