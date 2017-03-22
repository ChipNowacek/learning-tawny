(ns learning-tawny.this-and-that-test
    (:require [tawny [owl :refer :all]
               [english :as e]
               [repl :as l]
               [reasoner :as r]])
    (:refer-clojure :only [])
    (:gen-class))

;; set things up
(defontology this-and-that-test :iri "this-and-that-test" :comment "This and That Test")
(r/reasoner-factory :hermit)

;; basic ontology
(defclass That)
(defoproperty isRelatedTo)
(defclass This :equivalent (e/some isRelatedTo That))

;; individuals
(defindividual aThat1 :type That)

(defindividual aThis1 :fact (is isRelatedTo aThat1))

(save-ontology this-and-that-test "this-and-that-test.ttl" :ttl)