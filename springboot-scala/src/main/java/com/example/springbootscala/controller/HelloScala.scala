import org.springframework.stereotype.Component

@Component
class HelloScala {
  def sayHello(): String = {
    "Hello, Scala!"
  }
}