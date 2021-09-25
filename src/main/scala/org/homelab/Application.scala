package org.homelab

import org.springframework.boot.{CommandLineRunner, SpringApplication}
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application extends CommandLineRunner {
  override def run(args: String*): Unit = println("UP")
}
  object AppRunner extends App {
    SpringApplication.run(classOf[Application])
}
