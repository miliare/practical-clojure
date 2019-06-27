(ns monumental.core-test
  (:require [midje.sweet :refer :all]
            [monumental.core :refer :all]))

(println "You should expect to see three failures below.")

(facts "about `first-element`"
  (fact "it normally returns the first element"
    (first-element [1 2 3] :default) => 1
    (first-element '(1 2 3) :default) => 1))
