package Education.JavaSwing.Dialogs

import java.awt.event.ActionEvent
import java.io.File
import javax.swing._
import javax.swing.filechooser.FileFilter

//Диалоговое окно с выбором файлов
object FileDialog extends App {
  val jFrame = new JFrame {}
  val image: ImageIcon = new ImageIcon("src/img/Fish.png")
  val panel = new JPanel()

  val button = new JButton("тык")
  panel.add(button)
  button.addActionListener((_: ActionEvent) => {
    val fileChooser = new JFileChooser()
    fileChooser.showOpenDialog(panel)   //открытие файла
//    fileChooser.showSaveDialog(panel)   //сохранение файла

    fileChooser.setCurrentDirectory(new File("c:/"))  //указать с какой директории он начнет
    fileChooser.setSelectedFile(new File(""))   //задать выбранный файл
    fileChooser.setMultiSelectionEnabled(true)  //выбор сразу нескольких файлов
    fileChooser.setFileFilter(new FileFilter {  //фильтр файлов
      override def accept(f: File): Boolean = f.getName.endsWith(".png")
      override def getDescription: String = "Only png"
    })
  })

  jFrame.setVisible(true)
  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  jFrame.setSize(500, 300)
  jFrame.setLocationRelativeTo(null)
  jFrame.setTitle("Во что я превратился")
  jFrame.setIconImage(image.getImage)

  jFrame.add(panel)
}
