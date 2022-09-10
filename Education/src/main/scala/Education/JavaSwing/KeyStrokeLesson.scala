package Education.JavaSwing

import java.awt.Color
import java.awt.event.ActionEvent
import javax.swing._

object KeyStrokeLesson extends App {
  val jFrame = new JFrame {}
  val panel = new JPanel()
  jFrame.add(panel)

  val button = new JButton("ЖМИ!")
  panel.add(button)

  val action = new MyAction()
  button.addActionListener(action)

  val keyStroke = KeyStroke.getKeyStroke("ctrl B")  //сочетание клавиш

  //Сочетние сочетания клавиш и дейтсвия
  //Есть несколько настроек, про срабываатение в фокусе, вне фокуса, фокус на икомпоненте, окне и тд.
  val inputMap = panel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT)
  inputMap.put(keyStroke, "changeColor")
  val actionMap = panel.getActionMap
  actionMap.put("changeColor", action)

  //Позволяет опеределить свой Action для переиспользования
  class MyAction extends AbstractAction {
    override def actionPerformed(e: ActionEvent): Unit = {
      panel.setBackground(Color.BLUE)
    }
  }

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(new ImageIcon("src/img/Fish.png").getImage)
}