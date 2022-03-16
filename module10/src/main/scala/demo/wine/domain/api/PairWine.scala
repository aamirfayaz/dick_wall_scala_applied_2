package demo.wine.domain.api

import demo.food._
import domain.api.Dessert
import demo.wine.domain.internal.PairingDB

object PairWine {

  //import domain.Logger.log, goes for its outer domain and looks for Logger which is not there.
  import _root_.domain.Logger.log

  def pairWineWithDessert(dessert: Dessert): Option[Wine] = {
    log(s"Attempting to pair $dessert")
    PairingDB.pairWineWithDessert(dessert)
  }
}

/**
 * in this object PairWine

  import demo.food.domain.internal._
  val foodDb = new FoodDB()  error when in demo.food.domain.internal private[domain] class FoodDB {
works private[demo] class FoodDB {
**/
