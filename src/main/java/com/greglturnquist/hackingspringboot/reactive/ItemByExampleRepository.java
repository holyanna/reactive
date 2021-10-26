package com.greglturnquist.hackingspringboot.reactive;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

/**
 * @author Greg Turnquist
 */
// tag::code[]
public interface ItemByExampleRepository extends ReactiveQueryByExampleExecutor<Item> {

}
