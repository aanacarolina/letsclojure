(ns letsclojure.tipos-aritimetica)

;;string
(type "string")

;;int
(type 10)

;;double
(type 0.2)

;; ratio
(type 3/5)

;; Big decimal
(type 25M)

;; Big Int
(type 50N)

;;Boolean
(type true)
(type false)
truthy / falsy

;; vector
(type (vec()))

;;list
(type '())

;; Map
(type { :nome "Teste"})

;;char
(type \e)

;;emoji
;;(type \😀)

;;symbol
(type 'blabla)

;; keyword
(type :qualquercoisa)

;;nil
(type nil)

;;

;;sum
(+ 1 2)

;;mult
(* 3 10)

;;div
(/ 20 100)

;;mod
(mod 2 10)

;;minus
(- 42 1)

;;comb
(/ (+ 1984 2010) 2)

;;increment
(inc 5)

;;decrement
(dec 5)