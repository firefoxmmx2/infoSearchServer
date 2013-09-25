package models

import java.util.Date
import anorm._
import anorm.SqlParser._

case class User(id: Long = 0l, username: String = "", password: String = "",
	email: String = "", birth: Option[Date]) {
}

object User {
	def all: List[User] = {
		List()
	}

	def findByProperty(propertyMap: Map[String, AnyRef]): List[User] = {
		List()
	}

	def insert(user: User) = {
		user
	}

	def update(user: User) = {
		0
	}

	def delete(user: User) = {
		0
	}

	def deleteByProperty(propertyMap: Map[String, AnyRef]) = {
		0
	}
}