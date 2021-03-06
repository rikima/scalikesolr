package com.github.seratch.scalikesolr.request.query

import org.scalatest._
import org.scalatest.matchers._

class QueryTypeSpec extends FlatSpec with ShouldMatchers {

  behavior of "QueryType"

  it should "be available" in {
    val qt: String = ""
    val instance = new QueryType(qt)
    instance should not be null
    instance.getKey() should equal("qt")
  }

}
