(println "Gabe3")

(defn test [name]
  (println "hi" name))
(test "Vitaly")


(keys(seq(System/getProperties)))
(values(seq(System/getProperties)))
(keys(seq(System/getProperties)))
(filter #(.startsWith % "java")
        (keys(seq(System/getProperties))))
(def my-keys (keys(seq(System/getProperties))))
(println my-keys)
(filter #(.startsWith % "java") my-keys)

(def filtrd-keys (filter #(.startsWith % "java") my-keys))
(println filtrd-keys)
(map (fn [item] (.toUpperCase item)) filtrd-keys)
{:id 1 }

(reduce + [1 2 3 4 5 6])



