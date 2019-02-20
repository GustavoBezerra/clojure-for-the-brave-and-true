(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (if true
    (println "True!")     ;then
    (println "False!"))   ;else
  (if false
    (println "True!")
    (println "False!"))
  (if true
    (do 
      (print "True")
      (println " and Do")))

  (when true                    ;when = if + do (don't have a else branch)
    (println "Success!")
    (println "abra cadabra"))

  (println (nil? 1))  ;verify if is nil
  (println (nil? nil))  ;verify if is nil
)


