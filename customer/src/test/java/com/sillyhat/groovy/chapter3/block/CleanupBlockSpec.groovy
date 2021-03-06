package com.sillyhat.groovy.chapter3.block

import com.sillyhat.groovy.chapter3.dto.Basket
import com.sillyhat.groovy.chapter3.dto.Product

class CleanupBlockSpec extends spock.lang.Specification{

	def "A basket with one product has equal weight"() {
		given: "an empty basket and a TV"
		Product tv = new Product(name:"bravia",price:1200,weight:18)
		Basket basket = new Basket()

		when: "user wants to buy the TV"
		basket.addProduct(tv)

		then: "basket weight is equal to the TV"
		basket.currentWeight == tv.weight
//		throw new IllegalArgumentException()
		
		cleanup: "refresh basket resources"
		basket.clearAllProducts()
	}

	
}

