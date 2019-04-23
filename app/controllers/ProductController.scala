package controllers


import javax.inject._
import play.api.mvc._

@Singleton
class ProductController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index("f"))
  }

  def getProduct(id: Integer) = Action {
    Ok("getProduct")
  }

  def getProductsForCategory(id: Integer) = Action {
    Ok("getProductsForCategory")
  }

  def getProducts = Action {
    Ok("getProducts")
  }

  def addProduct = Action {
    Ok("addProduct")
  }
}
