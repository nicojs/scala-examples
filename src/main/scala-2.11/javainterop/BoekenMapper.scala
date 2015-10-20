package javainterop
import scala.collection.JavaConverters._
/**
 * Represents a BoekenMapper
 * Created by nicojs
 */
class BoekenMapper {

  def getBoeken(books: java.util.List[Book]): java.util.List[Boek] = {
    books.asScala.map(b => new Boek(b.getTitle,
      (b.getPrice.doubleValue() * 100).toInt ,
      b.getAuthors.asScala.map(a => s"${a.getFirstName} ${a.getLastName}").mkString(", "),
      b.getPublisher.getName)).asJava
  }
}
