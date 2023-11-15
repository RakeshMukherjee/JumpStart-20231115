import com.greenfossil.thorium.{Action, Server}
import controllers.jumpstart.day2.HomeController

@main def start: Unit =
  Server(8080)
    .addServices(HomeController)
    .addDocService("/docs")
    .start()
