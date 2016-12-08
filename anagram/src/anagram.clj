(ns anagram
  (:require [clojure.string :as st]))

(defn sort-word [word]
  (sort (st/join (st/lower-case word))))

(defn anagram? [word option]
  (and (not (= (st/lower-case word) (st/lower-case option)))
       (= (sort-word word) (sort-word option))))

(defn anagrams-for [word options]
  (filter #(anagram? word %) options))
