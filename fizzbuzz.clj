(defn fizzbuzz [i] 
  (if (= 0 (mod i 3) (mod i 5)) 
    "fizzbuzz"
    (if (= (mod i 3) 0) 
      "fizz" 
      (if (= (mod i 5) 0) "buzz" i))))

(defn check [actual expect] 
  (println 
    (if (= actual expect) 
      "pass" 
      (str "fail: expected " expect " got " actual))))

(defn main [] 
  (do
    (check (fizzbuzz 1)  1)
    (check (fizzbuzz 2)  2)
    (check (fizzbuzz 3)  "fizz")
    (check (fizzbuzz 6)  "fizz")
    (check (fizzbuzz 9)  "fizz")
    (check (fizzbuzz 5)  "buzz")
    (check (fizzbuzz 10) "buzz")
    (check (fizzbuzz 15) "fizzbuzz")
    (check (fizzbuzz 30) "fizzbuzz")
  ))

(main)
