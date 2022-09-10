package Education.JavaSwing

import Education.JavaSwing.JComponent.MyComponent

import java.awt.event.{ActionEvent, MouseAdapter, MouseEvent}
import java.awt.{Color, Graphics, Graphics2D}
import javax.swing.{ImageIcon, JButton, JComponent, JFrame, JPanel}

//Тут надо додумать
object MouseListenerLesson extends App {
  val jFrame = new JFrame {}
  val panel = new JPanel()
  jFrame.add(panel)
  val button = new JButton("Во что я превратился?")
  panel.add(button)
  button.addActionListener((_: ActionEvent) => panel.setBackground(Color.RED))

//  jFrame.add(MyComponent)


  //Обработка событий, связанных с мышкой
//  panel.addMouseListener(new MouseListener() {
//    override def mouseClicked(e: MouseEvent): Unit = ???
//
//    override def mousePressed(e: MouseEvent): Unit = ???
//
//    override def mouseReleased(e: MouseEvent): Unit = ???
//
//    override def mouseEntered(e: MouseEvent): Unit = ???
//
//    override def mouseExited(e: MouseEvent): Unit = ???
//  })

  //Преоепределение только одного, нужного метода
  panel.addMouseListener(new MouseAdapter {
    override def mouseClicked(e: MouseEvent): Unit = panel.setBackground(Color.BLUE)
  })
//  panel.addMouseListener(new MouseAdapter {
//    override def mouseMoved(e: MouseEvent): Unit = {
//      MyComponent.x = e.getX
//      MyComponent.y = e.getY
//    }
//  })

//  class MyComponent(var x: Int = 0, var y: Int = 0) extends JComponent {
//    override def paintComponent(g: Graphics): Unit = {
//      val g2 = g.asInstanceOf[Graphics2D]
//      g2.drawString(s"Coordinates x:$x y:$y", 50, 50)
//
//    }
//  }

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(new ImageIcon("src/img/Fish.png").getImage)
}
