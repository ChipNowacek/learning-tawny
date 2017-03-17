(defproject learning-tawny "0.1.0-SNAPSHOT"
  :description "Tawny OWL experiments, \"gists\" and the like"
  ;:url "http://example.com/FIXME"
  ;:license {:name "Eclipse Public License"
  ;          :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [uk.org.russet/tawny-owl "1.6.0"]]
  :main ^:skip-aot learning-tawny.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
