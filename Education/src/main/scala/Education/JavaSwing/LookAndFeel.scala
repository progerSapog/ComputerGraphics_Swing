package Education.JavaSwing

import java.awt.event.ActionEvent
import javax.swing._

object LookAndFeel extends App {
  val jFrame = new JFrame {}
  val panel = new JPanel()
  jFrame.add(panel)

  //Просмотр предустановленных в системе виды
  val lookAndFeelInfos = UIManager.getInstalledLookAndFeels
  for (look <- lookAndFeelInfos) println(s"${look.getName} ${look.getClassName}")

  val button1 = new JButton("Metal")
  val button2 = new JButton("Nimbus")
  val button3 = new JButton("Motif")
  val button4 = new JButton("Windows")
  val button5 = new JButton("Windows Classic")

  panel.add(button1)
  panel.add(button2)
  panel.add(button3)
  panel.add(button4)
  panel.add(button5)

  //Смена стиля зависимо от кнопки
  button1.addActionListener((_: ActionEvent) => UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"))
  button2.addActionListener((_: ActionEvent) => UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"))
  button3.addActionListener((_: ActionEvent) => UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel"))
  button4.addActionListener((_: ActionEvent) => UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"))
  button5.addActionListener((_: ActionEvent) => UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel"))

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(new ImageIcon("src/img/Fish.png").getImage)
}


