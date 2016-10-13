;; recur e inc y dec
(defn suma [a b]
  (if (= b 0)
    a
    (recur (inc a) (dec b))))

(defn suma5 [a]
  ((fn [a b]
    (if (= b 5)
      a
      (recur (inc a) (inc b)))) a 0))

(defn suma-loop5 [a]
  (loop [x a
         y 0]
    (if (= y 5)
      x
      (recur (inc x) (inc y)))))


(suma 10 1000000)

(suma5 2)

(suma-loop5 100)

(into [1 2 3] [4 5 6])