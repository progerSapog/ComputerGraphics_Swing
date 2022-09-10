package Education.JavaSwing

import java.awt.event.{WindowAdapter, WindowEvent, WindowListener}
import javax.swing.{ImageIcon, JFrame}

object WindowListener extends App {
  val jFrame = new JFrame {}

  //Слушатель событий окна
  //WindowsListener - требует переопеределение сразу всех методов взаимойдвия с окном
  jFrame.addWindowListener(new WindowListener {
    override def windowOpened(e: WindowEvent): Unit = ???

    override def windowClosing(e: WindowEvent): Unit = ???

    override def windowClosed(e: WindowEvent): Unit = ???

    override def windowIconified(e: WindowEvent): Unit = ???

    override def windowDeiconified(e: WindowEvent): Unit = ???

    override def windowActivated(e: WindowEvent): Unit = ???

    override def windowDeactivated(e: WindowEvent): Unit = ???
  })

  //Позволяет переопределить одним метод
  jFrame.addWindowListener(new WindowAdapter {
    override def windowClosing(e: WindowEvent): Unit = ???
  })

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(new ImageIcon("src/img/Fish.png").getImage)
}