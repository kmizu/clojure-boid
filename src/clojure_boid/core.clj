(ns clojure-boid.core
  (:gen-class))
(import javax.swing.JFrame)

(gen-class
  :name com.github.kmizu.BoidFrame 
  :extends javax.swing.JFrame
  :prefix BoidFrame-)

(defn BoidFrame-paint [this g]
  (. g fillRect 0 0 100 100))

(def frame (new com.github.kmizu.BoidFrame))
(doto frame
  (.setSize 800 600)
  (.setVisible true)
  (.setDefaultCloseOperation javax.swing.JFrame/EXIT_ON_CLOSE))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
