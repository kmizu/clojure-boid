(defproject clojure-boid "0.1.0-SNAPSHOT"
  :description "Boid Implementaion in Clojure"
  :url "https://github.com/kmizu/clojure-boid"
  :license {:name "MIT LICENSE"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :aot [clojure-boid.core]
  :main clojure-boid.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
