package Education.JavaSwing

import java.awt.Toolkit
import javax.swing.{ImageIcon, JFrame}


object HelloWordSwing extends App {
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")

  val toolKit = Toolkit.getDefaultToolkit //инструменты для работы с фреймами, так же позволяет получить инфу об экране

  val jFrame = new JFrame {
    setVisible(true)  //окно ставится видимым
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)  //закрытие при нажатии на крестик, без этого программа виснет
    setSize(500, 300) //размер окна
//    setLocation(500, 400) //координаты появления окна (?)
//    setBounds(
//      toolKit.getScreenSize.width/2 - toolKit.getScreenSize.width/4,
//      toolKit.getScreenSize.height/2 - toolKit.getScreenSize.height/4,
//      400,
//      600) //отступы, затем размер
    setLocationRelativeTo(null)




    setTitle("Во что я превратился") //заголовок программы
    setIconImage(image.getImage)  //иконка
  }
}
