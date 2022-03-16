import domain.Logger.log

log("hello world")

import demo.food.domain.api._

val iceCream = IceCream("Vanilla")

def thirdLetterOfDessert(dessert: IceCream): Char = {
  import dessert._ //import the instance which is method parameter here
  import flavor._ //then import that string i.e flavor: String, then do charAt

  charAt(3)
}

thirdLetterOfDessert(iceCream)
