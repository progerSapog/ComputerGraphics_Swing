package Education.JavaSwing

import java.awt.event.ActionEvent
import javax.swing._

object MenuLesson extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")
  val panel = new JPanel()

  //Меню бар
  val menuBar = new JMenuBar()

  //Несколько менюшек
  val menuFile = new JMenu("File")
  val menuEdit = new JMenu("Edit")

  //Добавили менюшки на бар
  menuBar.add(menuFile)
  menuBar.add(menuEdit)

  menuFile.add(new JMenuItem("Open", 'O'))  //Мнемоника - подчеркивание символа
  val save = menuFile.add(new JMenuItem("Save"))
  save.setEnabled(false)  //не дает выбрать данный пункт
  menuFile.addSeparator()
  val exit = menuFile.add(new JMenuItem("Exit"))
  exit.addActionListener((_: ActionEvent) => System.exit(0))  //слушатель на меню
  exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E")) //сочетание клавиш

  menuEdit.add(new JMenuItem("Cut"))
  menuEdit.add(new JMenuItem("Copy"))

  //Меню в меню
  val options = new JMenu("Options")
  options.add(new JMenuItem("one"))
  options.add(new JMenuItem("two"))
  menuFile.add(options)

  //CheckBox в меню
  menuEdit.add(new JCheckBoxMenuItem("checkBox"))

  val buttonGroup = new ButtonGroup()
  val radioButton1 = new JRadioButton("Button1")
  val radioButton2 = new JRadioButton("Button2")
  buttonGroup.add(radioButton1)
  buttonGroup.add(radioButton2)

  menuEdit.add(radioButton1)
  menuEdit.add(radioButton2)


  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)

  jFrame.add(panel)
  jFrame.setJMenuBar(menuBar)
  jFrame.revalidate()
}
