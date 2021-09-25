package org.homelab.joke

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class JokeController {

  @GetMapping(path = Array("/joke"))
  def getRandomJoke(): String = {
    "Przyszla babcia do lekarza"
  }
}
