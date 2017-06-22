(ns clojure.examples.hello
  (:gen-class))

(defn hello-world [anything]
  (println (format "Hello, %s" anything)))

(hello-world "world")
