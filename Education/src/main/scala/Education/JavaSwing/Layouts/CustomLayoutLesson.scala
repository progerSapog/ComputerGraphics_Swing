package Education.JavaSwing.Layouts

import java.awt.{Component, Container, Dimension, LayoutManager}
import javax.swing.{ImageIcon, JButton, JFrame, JPanel}

object CustomLayoutLesson extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")
  val panel = new JPanel()

  object MyLayout extends LayoutManager {
    override def addLayoutComponent(name: String, comp: Component): Unit = ???

    override def removeLayoutComponent(comp: Component): Unit = ???

    override def preferredLayoutSize(parent: Container): Dimension = ???

    override def minimumLayoutSize(parent: Container): Dimension = ???

    //Отвечает за отображение объектов
    override def layoutContainer(parent: Container): Unit = {
      for (i <- 0 to parent.getComponentCount) {
        val component = parent.getComponent(i)
        component.setBounds(i * 100, i*40, 100, 40)
      }
    }
  }

  panel.setLayout(MyLayout)
  panel.add(new JButton("1"))
  panel.add(new JButton("2"))
  panel.add(new JButton("3"))
  panel.add(new JButton("4"))
  panel.add(new JButton("5"))

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)

  jFrame.add(panel)
}
