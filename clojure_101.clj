(ns clojure-101
(:require [clojure.pprint :refer [pprint]]))

(pprint "Hello Nubank!")
(format "%s" "hello")

(defn sortudo [num]
  (if (number? num)
    (do
      (def random (rand-int 101))
        (if (<= random num)
          (do (println "felicitaciones" random) random)
          nil
          ))
    nil))
(doseq [passos [20 50 100 0 "pode?" 100 nil]]
  (sortudo passos))

(let [n 400]
  (cond
    (> n 250) "big"
    (> n 500) "quite big"
    (< n 0) "negative"
    (> n 0) "positive"
    :else "zero"))

(let [l 10]
  (case l
          10 "ten"
          20 "twenty"
          30 "thirty"))
