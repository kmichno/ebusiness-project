package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class UserController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def addUser = Action {
    Ok("addUser")
  }

  def getUser(id: Integer) = Action {
    Ok("getUser")
  }

  def editUser(id: Integer) = Action {
    Ok("editUser")
  }

}
