package Education.JavaSwing.Dialogs

import java.awt.event.ActionEvent
import javax.swing._

//диалоговые окна
object Dialogs extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")
  val panel = new JPanel()

  val buttonMD = new JButton("show message dialog")
  panel.add(buttonMD)
  buttonMD.addActionListener((_: ActionEvent) => JOptionPane.showMessageDialog(panel, "this is my dialog", "title", JOptionPane.QUESTION_MESSAGE))

  //имеет возвращаемый код, взасимости от принятия, отказа или отмены
  val buttonCD = new JButton("show confirm dialog")
  panel.add(buttonCD)
  buttonCD.addActionListener((_: ActionEvent) => JOptionPane.showConfirmDialog(panel, "this is my confirm dialog", "title", JOptionPane.YES_NO_OPTION))

  //Позволяет самому передавать значения вместо yes, no, cancel
  val buttonSOD = new JButton("show option dialog")
  panel.add(buttonSOD)
//  buttonSOD.addActionListener((_: ActionEvent) => JOptionPane.showOptionDialog(panel, "this is my option dialog", "title", 0, 0, JOptionPane.WARNING_MESSAGE, ("one", "two")))

  //Окно для ввода
  //Возвращает введенный текст
  val buttonID = new JButton("some message")
  panel.add(buttonID)
  buttonID.addActionListener((_: ActionEvent) => JOptionPane.showInputDialog(panel, "this is my input message", "title"))


  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)

  jFrame.add(panel)

}
