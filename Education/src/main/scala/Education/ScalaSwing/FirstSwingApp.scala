package Education.ScalaSwing

import scala.swing._

/**
 * Класс SimpleSwingApplication уже определяет метод main, содержащий
 * настроечный код для фреймворка Java Swing
 */
object FirstSwingApp extends SimpleSwingApplication {
  /**
   * top - определение CUI компонента верхнего уровня.
   *       В нем определяются все остальные компоненты
   * MainFrame - как обыяный Frame, но при его закрытии закрывается приложение
   * @return
   */
  def top: Frame = new MainFrame {
    //title - заголвоок фрекйма
    //контент - содержимое фрейма, которое показывается в окне
    title = "First Swing App"
    contents = new Button {
      text = "Click me"
    }
  }
}
