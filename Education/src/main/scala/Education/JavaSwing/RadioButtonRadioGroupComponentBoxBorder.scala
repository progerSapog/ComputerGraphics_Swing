package Education.JavaSwing

import javax.swing.{BorderFactory, ButtonGroup, ImageIcon, JCheckBox, JComboBox, JFrame, JPanel, JRadioButton}

object RadioButtonRadioGroupComponentBoxBorder extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")
  val panel = new JPanel()

  //Галочка
  val checkBox  = new JCheckBox("Ждешь наказаний?")
  panel.add(checkBox)

  //RadioButton
  val radioButton1 = new JRadioButton("one")
  val radioButton2 = new JRadioButton("two")
  radioButton2.setSelected(true)

  //Объединение в группы, чтобы выбрать можно только 1 из них
  val buttonGroup = new ButtonGroup()
  buttonGroup.add(radioButton1)
  buttonGroup.add(radioButton2)

  panel.add(radioButton1)
  panel.add(radioButton2)

  //Бордер для объекта
  val border = BorderFactory.createEtchedBorder()
  panel.setBorder(border)

  //Выпадающий список
  val comboBox = new JComboBox[String]()
  comboBox.addItem("1")
  comboBox.addItem("2")
  comboBox.addItem("3")
  comboBox.addItem("4")

  panel.add(comboBox)

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)

  jFrame.add(panel)
}
