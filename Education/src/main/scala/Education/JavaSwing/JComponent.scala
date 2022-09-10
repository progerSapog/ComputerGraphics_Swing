package Education.JavaSwing

import java.awt.geom.{Ellipse2D, Line2D, Point2D, Rectangle2D}
import java.awt._
import java.net.URL
import javax.swing.{ImageIcon, JComponent, JFrame}

object JComponent extends App {
  val fonts = GraphicsEnvironment.getLocalGraphicsEnvironment.getAllFonts //список всех шрифтов
  for(font <- fonts) println(font)

  val image: ImageIcon = new ImageIcon("src/img/Fish.png")

  //Определяем свой компонент
  object MyComponent extends JComponent {
    //Необходимо переопределить метод отрисовки компонента
    //Graphics - устаревший, используется Graphics2d
    override def paintComponent(g: Graphics): Unit = {
      val font = new Font("Times New Roman", Font.BOLD, 20) //Шрифт: название, тип, размер
      val g2 = g.asInstanceOf[Graphics2D]

      g2.setFont(font)  //указали нужный шрифт
      g2.drawString("Во что я превратился?", 20, 20) //Выводим надпись и координаты отступа

      val point1 = new Point2D.Double(30, 30)
      val point2 = new Point2D.Double(100, 100)

      val line1 = new Line2D.Double(20,20, 90.0,100.3) //создали линию
      val line2 = new Line2D.Double(point1, point2) //создали линию

      val ellipse = new Ellipse2D.Double(70, 70, 170, 170)  //создали элипс
      val rectangle = new Rectangle2D.Double() //создали квадрат
      rectangle.setFrameFromDiagonal(point1, point2)  //задали координаты квадрата

      //Получение URL картинкиии
      val image = new ImageIcon(new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/A_small_cup_of_coffee.JPG/274px-A_small_cup_of_coffee.JPG")).getImage

      g2.draw(line1) //отрисовали линию
      g2.draw(line2) //отрисовали линию
      g2.setPaint(Color.RED) // задали цвет
      g2.draw(rectangle) //отрисовали квадрат
      g2.draw(ellipse) //отрисовали элипс
      g2.setPaint(Color.PINK) //задали цвет
      g2.fill(ellipse) //заполнили элипс
      g2.drawImage(image, 200, 200, null) //отрисовали картинку
    }
  }



  val jFrame = new JFrame {
    setVisible(true)
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    setSize(500, 300)
    setLocationRelativeTo(null)
    setTitle("Во что я превратился")
    setIconImage(image.getImage)

    add(MyComponent)
  }
}


