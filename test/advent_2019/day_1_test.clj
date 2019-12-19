(ns advent-2019.day-1-test
  (:require [advent-2019.day-1 :as sut]
            [midje.sweet :as midje :refer [fact facts =>]]))

(facts "about fuel-needed*"
  (sut/fuel-needed* 12) => 2
  (sut/fuel-needed* 14) => 2
  (sut/fuel-needed* 1969) => 654
  (sut/fuel-needed* 100756) => 33583)

(facts "about fuel-needed"
  (sut/fuel-needed 12) => 2
  (sut/fuel-needed 1969) => 966
  (sut/fuel-needed 100756) => 50346)
