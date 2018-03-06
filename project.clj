(defproject test-parent "1.0.0-SNAPSHOT"
  :description ""
  :url ""
  :license {}
  :dependencies [[org.clojure/clojure "_"]]
  :plugins [[lein-modules "0.3.11"]]
  :modules {:inherited
            {:url "Something"
             :license {}
             :subprocess nil}
            :versions
            {org.clojure/clojure "1.9.0"
             org.apache.kafka "0.11.0.1"}}
  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ["modules" "change" "version" "leiningen.release/bump-version" "release"]
                  ["vcs" "commit"]
                  #_["vcs" "tag"]
                  #_["modules" "deploy"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["modules" "change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  #_["vcs" "push"]])
