package demo.food.domain.api

import demo.food.domain.allFoods

object FindFood {
  println(packageObjectNoImportNeeded)
  def lookupFood(name: String): Option[Dessert] = allFoods.lookupDessert(name)
}
