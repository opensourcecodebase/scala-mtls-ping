package dev.subhashmeena.utilities.mtlsping

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.{CommandLineRunner, SpringApplication}

@SpringBootApplication
class ScalaMtlsPingApplication extends CommandLineRunner {

  override def run(args: String*): Unit = println("\n\n Hello, world! \n\n")
}

object ScalaMtlsPingApplication extends App {
  SpringApplication.run(classOf[ScalaMtlsPingApplication])
}
