package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._

@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }

  def test = Action{
     Ok(views.html.test(SharedMessages.itWorks))
  }

  def form = Action{
    Ok(views.html.form(SharedMessages.itWorks))
  }

  def validateForm(username: String, color: String) = Action{
    Ok(s"Username $username Color $color")
  }

  def validateFormP = Action { request =>
    val postVals = request.body.asFormUrlEncoded 
    postVals.map {args =>
     val username = args("username").head
     val color = args("color").head
     Ok(s"Username $username Color $color")
    }.getOrElse(Ok("No data"))
    
  }

  

}
