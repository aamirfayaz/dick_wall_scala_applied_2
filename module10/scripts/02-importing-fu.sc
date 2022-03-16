import demo.food.{domain => fooddomain} //renaming package
import demo.wine.{domain => winedomain}
import domain.Logger

Logger.log("happy")

//rename classes
import fooddomain.api.{Jello => Jelly, _} // rename Jello class and also import rest of items from it i.e Icecream
import winedomain.api._
IceCream("Vanilla") // from _ fooddomain
Jelly("green")
// Will not compile
// Jello("red") in this scope Jello doesn't exist now as its renamed
Wine("Foo", 1987, "Cab Sav") // from winedomain
