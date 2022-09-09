package Education

import scala.swing._

object SecondSwingApp extends SimpleSwingApplication {
  def top: MainFrame = new MainFrame {
    title = "Second Swing App"


    val button: Button = new Button {
      text = "Click me"
    }
    val label: Label = new Label {
      text = "No button clicks registered"
    }

    /**
     * Panel - контейнеры сразметкой для компонентов
     * BoxPanel - в данном случае контейнер с вертикальной разметкой.
     *            Объекты устанавливаются друг на друга
     * contents - буфер для компонентов контейнера
     */
    contents = new BoxPanel(Orientation.Vertical) {
      contents += button
      contents += label
      border = Swing.EmptyBorder(30, 30, 30, 30)
    }
  }
}
