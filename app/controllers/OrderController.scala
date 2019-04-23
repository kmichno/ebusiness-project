package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class OrderController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def getOrder(id: Integer) = Action {
    Ok("getOrder")
  }

  def getOrders(userId: Integer) = Action {
    Ok("getOrders")
  }

  def takeOrder = Action {
    Ok("takeOrder")
  }

}
