package Education.JavaSwing

import java.awt.Color
import java.awt.event.ActionEvent
import javax.swing.{ImageIcon, JButton, JFrame, JPanel}

object ActionListenerLesson extends App {
  val panel = new JPanel()
  val button = new JButton("Во что я превратился?") //кнопку создали
  panel.add(button) //на панель кнопку добавил

  //Добавили слушатель событий
  //Реализовали свой анонимный класс/функцию, отвечающую за действия
  //В данном случае меняем цвет
  button.addActionListener((_: ActionEvent) => panel.setBackground(Color.RED))

  val jFrame = new JFrame {
    setVisible(true)
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    setSize(500, 300)
    setLocationRelativeTo(null)
    setTitle("Во что я превратился")
    setIconImage(new ImageIcon("src/img/Fish.png").getImage)

    add(panel)
  }
}
