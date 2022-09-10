package Education.JavaSwing

import java.awt.{Label, TextField}
import javax.swing.{ImageIcon, JFrame, JPanel, JPasswordField, JScrollBar, JScrollPane, JTextArea}

object TextPasswordAreaScrollPanel extends App {
  val jFrame = new JFrame {}
  val panel = new JPanel()
  jFrame.add(panel)

  //текстовое поле
  //Имеет много функций + может иметь листенеры
  //getText и setText
  val textFiled = new TextField("Введите текст", 20)

  //Просто текст
  //getText и setText
  val label = new Label("Здесь какая то надпись")
  panel.add(label)
  panel.add(textFiled)

  //Текстовые символы, но отображаются точками
  val passwordFiled = new JPasswordField(20)
  panel.add(passwordFiled)


  val textArea = new JTextArea(5, 20)
  textArea.setLineWrap(true)
  val scrollPane = new JScrollPane(textArea)
  panel.add(scrollPane)

  panel.revalidate()

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(new ImageIcon("src/img/Fish.png").getImage)
}