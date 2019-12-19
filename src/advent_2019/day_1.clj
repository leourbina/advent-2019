(ns advent-2019.day-1
  (:require [clojure.java.io :as io]))

(defn get-input []
  (map #(Integer/parseInt %)
    (line-seq (-> "day1.txt"
                io/resource
                io/as-file
                io/reader))))

(defn fuel-needed* [mass]
  (-> mass
    (quot 3)
    (- 2)))

(defn fuel-needed [mass]
  (loop [total 0
         fuel (fuel-needed* mass)]
    (if (<= fuel 0)
      total
      (recur (+ total fuel) (fuel-needed* fuel)))))

(defn total-fuel []
  (let [input (get-input)
        module-fuel (map fuel-needed input)]
    (reduce + 0 module-fuel)))










