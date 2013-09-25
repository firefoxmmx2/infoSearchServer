package models

/**
 * 书籍
 */
case class Book(id: Long = 0l, title: String, description: String,
	authors: List[Author], publisher: Publisher) {

}
/**
 * 作者
 */
case class Author(id: Long = 0l, firstName: String, lastName: String, books: Option[List[Book]]) {

}
/**
 * 出版社
 *
 */
case class Publisher(id: Long = 0l, name: String, books: Option[List[Book]]) {

}