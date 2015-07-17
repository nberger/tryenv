(ns tryenv.core
  (:require [environ.core :refer [env]]))

(defn -main [& _]
  (println "Hello, " (env :greet))
  (println "Db config: " (env :db-url)))
