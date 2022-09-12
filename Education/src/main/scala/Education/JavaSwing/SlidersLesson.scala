package Education.JavaSwing

import javax.swing.{ImageIcon, JFrame, JPanel, JSlider}

object SlidersLesson extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")
  val panel = new JPanel()

  //Ползунок
  val slider = new JSlider(0, 100, 20)
  slider.setMinorTickSpacing(10)  //маленькое деление
  slider.setMajorTickSpacing(20)  //большое деление
  slider.setPaintTicks(true)      //отрисовка делений
  slider.setSnapToTicks(true)     //притягивание к ближайшему делению
  slider.setPaintLabels(true)     //прописывание majorticks
  panel.add(slider)


  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)

  jFrame.add(panel)
}
