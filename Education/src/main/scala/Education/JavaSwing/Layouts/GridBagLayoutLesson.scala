package Education.JavaSwing.Layouts

import java.awt.{GridBagConstraints, GridBagLayout}
import javax.swing.{ImageIcon, JButton, JFrame, JPanel, JTextArea}

//Grid таблица, но можно выбирать сколько клеток что где занимает
object GridBagLayoutLesson extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")
  val panel = new JPanel()

  jFrame.add(panel)
  val gridBagLayout = new GridBagLayout()
  panel.setLayout(gridBagLayout)

  val gridBagConstraints = new GridBagConstraints()
  gridBagConstraints.weightx = 0  // 0 - сам растягивается
  gridBagConstraints.weighty = 0
  gridBagConstraints.gridx = 0    //с какой клетки от верхнего левого угла будет рисоваться
  gridBagConstraints.gridheight = 2 //высотой 2 клеточки
  gridBagConstraints.gridwidth = 2  //шириной 2 клетки
  panel.add(new JTextArea(4, 20), gridBagConstraints)

  val gridBagConstraints2 = new GridBagConstraints()
  gridBagConstraints2.weightx = 0 // 0 - сам растягивается
  gridBagConstraints2.weighty = 0
  gridBagConstraints2.gridx = 2 //с какой клетки от верхнего левого угла будет рисоваться
  gridBagConstraints2.gridheight = 1 //высотой 2 клеточки
  gridBagConstraints2.gridwidth = 2 //шириной 2 клетки
  panel.add(new JButton("во что ты превратился?"), gridBagConstraints2)

  val gridBagConstraints3 = new GridBagConstraints()
  gridBagConstraints3.weightx = 0 // 0 - сам растягивается
  gridBagConstraints3.weighty = 0
  gridBagConstraints3.gridx = 2 //с какой клетки от верхнего левого угла будет рисоваться
  gridBagConstraints3.gridy = 1
  gridBagConstraints3.gridheight = 1 //высотой 2 клеточки
  gridBagConstraints3.gridwidth = 1 //шириной 2 клетки
  panel.add(new JButton("Кто я?"), gridBagConstraints3)

  val gridBagConstraints4 = new GridBagConstraints()
  gridBagConstraints4.weightx = 0 // 0 - сам растягивается
  gridBagConstraints4.weighty = 0
  gridBagConstraints4.gridx = 3 //с какой клетки от верхнего левого угла будет рисоваться
  gridBagConstraints4.gridy = 1
  gridBagConstraints4.gridheight = 1 //высотой 2 клеточки
  gridBagConstraints4.gridwidth = 1 //шириной 2 клетки
  panel.add(new JButton("Что я?"), gridBagConstraints4)

  panel.revalidate()

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)
}
