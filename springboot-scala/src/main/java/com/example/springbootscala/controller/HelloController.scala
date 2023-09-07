@RestController
class HelloController(@Autowired val helloScala: HelloScala) {
  @RequestMapping(Array("/hello"))
  def hello(): String = {
    helloScala.sayHello()
  }
}