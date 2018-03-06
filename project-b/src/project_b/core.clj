(ns project-b.core
  (:require [clojure.core.async :refer [chan]]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!")
  (chan))
