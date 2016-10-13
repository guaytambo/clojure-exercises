;; Implement my-max using reduce
(max 1 2 3 5 2 1)

(defn my-max [& values]
  (reduce #(if (> %1 %2) %1 %2) values))

(= 5 (my-max 1 2 3 5 2 1))
(= 7 (my-max 7 4 3 2 1))

(reduce + 2 [1 2 3 4])
(reduce * 0 [1 2 3 4])

;; Implement my-filter using reduce
(filter #(> % 3) [2 1 3 4 5 6 7])

(defn my-filter [pred values]
  (letfn [(reducer
            [accum value]
            (if (pred value)
              (conj accum value)
              accum))]
    (reduce reducer [] values)))

;; accum
(my-filter #(> % 3) [2 1 3 4 5 6 7])
(= [4 5 6 7] (my-filter #(> % 3) [2 1 3 4 5 6 7]))
