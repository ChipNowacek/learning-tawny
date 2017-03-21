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

; throws CompilerException clojure.lang.ArityException: Wrong number of args (1) passed to: repl/eval38514/fetch-doc--38515
(l/print-ns-doc)