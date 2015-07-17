(defproject tryenv "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [environ "1.0.0"]]
  :plugins [[lein-environ "1.0.0"]]
  :main tryenv.core

  :profiles {:dev {:env {:greet "world"
                         :db-url "some:db://localhost"}}}
  )
