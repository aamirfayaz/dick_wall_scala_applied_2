package demo.food.domain.internal

import demo.food.domain.api.Dessert

import scala.collection.mutable

//package scoping, or package access private/protected[super-package]
//here private[domain] means accessible till demo.food.domain not to demo.wine.domain
private[domain] class FoodDB {
  private[this] val desserts = mutable.Map.empty[String, Dessert]

  private[domain] def addDessert(name: String, dessert: Dessert): Unit =
    desserts.put(name, dessert)

  def lookupDessert(name: String): Option[Dessert] = desserts.get(name)
}
