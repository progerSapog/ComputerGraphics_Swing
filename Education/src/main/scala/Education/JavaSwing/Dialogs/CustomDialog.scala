package Education.JavaSwing.Dialogs

import javax.swing.{ImageIcon, JDialog, JFrame, JPanel}

object CustomDialog extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")
  val panel = new JPanel()

  //Вообщем собственные окна с переопределение конструтора и тд.
  //Ну такое
  object MyDialog extends JDialog {

  }

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)

  jFrame.add(panel)
}
