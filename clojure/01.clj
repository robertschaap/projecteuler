; one
(defn num1 []
  (reduce (fn [acc val]
    (if (or (= (mod val 3) 0) (= (mod val 5) 0))
      (+ acc val)
      acc))
    (range 1000)))

; two
(defn reducerfn [acc, val]
  (if (or (zero? (mod val 3)) (zero? (mod val 5)))
    (+ acc val)
    acc))

(defn num2 []
  (reduce reducerfn (range 1000)))

(defn -main
  []
  (println (num1))
  (println (num2)))
