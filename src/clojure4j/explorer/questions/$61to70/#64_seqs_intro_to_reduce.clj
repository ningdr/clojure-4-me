(ns clojure4j.explorer.questions.$61to70.#64-seqs-intro-to-reduce)
(defn intro-to-reduce
  "
    Reduce takes a 2 argument function and an optional starting value.
    It then applies the function to the first 2 items in the sequence (or the starting value and the first element of the sequence).
    In the next iteration the function will be called on the previous return value and the next item from the sequence,
    thus reducing the entire collection to one value. Don't worry, it's not as complicated as it sounds.
  "
  [arg]
  (println (= 15 (reduce arg [1 2 3 4 5])))
  (println (=  0 (reduce arg [])))
  (println (=  6 (reduce arg 1 [2 3])))
  )

(intro-to-reduce +)