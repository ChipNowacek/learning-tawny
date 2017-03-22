(ns learning-tawny.the-other
    (:require [tawny [owl :refer :all]
               [english :as e]
               [repl :as l]
               [reasoner :as r]])
    (:refer-clojure :only [])
    (:gen-class))

;; set things up
(defontology the-other :iri "the-other" :comment "The Other")
(r/reasoner-factory :hermit)

;; basic ontology
(defclass That)
(defoproperty isRelatedTo)
(defclass This :equivalent (e/some isRelatedTo That))

;; individuals
(defindividual aThat1 :type That)

(defindividual aThis1 :fact (is isRelatedTo aThat1))

(save-ontology the-other "the-other.ttl")