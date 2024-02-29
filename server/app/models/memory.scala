package models

object Memory {
  def validateUser(username: String, color: String): Boolean = {
    if (username == "admin" && color == "admin") true
    else false
  }

  def createUser(username: String, color: String): Boolean = {
    if (username == "admin" && color == "admin") true
    else false
  }
}