(ns learning-tawny.this-and-that
    (:require [tawny [owl :refer :all]
               [english :as e]
               [repl :as l]
               [reasoner :as r]])
    (:refer-clojure :only [])
    (:gen-class))

;; set things up
(defontology this-and-that :iri "this-and-that" :comment "This and That")
(r/reasoner-factory :hermit)

;; basic ontology
(defclass That)
(defoproperty isRelatedTo)
(defclass This :equivalent (some isRelatedTo That))

;; individuals
(defindividual aThat1 :type That)

(defindividual aThis1 :fact (is isRelatedTo aThat1))

