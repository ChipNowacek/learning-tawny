(ns learning-tawny.this-and-that
    (:require [tawny.owl :refer :all]
      [tawny.english :refer :all]
      [tawny.reasoner :as rea])
    (:refer-clojure :only [])
    (:gen-class))

(defontology tawnytest :iri "this-and-that")

(rea/reasoner-factory :hermit)

(defclass That)

(defoproperty isRelatedTo)

(defclass This :equivalent (some isRelatedTo That))

(defindividual aThat1 :type That)

(defindividual aThis1 :fact (isRelatedTo That))
