package denemeScala
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class firstClass extends Simulation{
  val httpProtocol= http.baseUrl("http://newtours.demoaut.com/").header("User-Agent","Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Mobile Safari/537.36")


}
