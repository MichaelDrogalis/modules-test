(defproject test-parent "3.4.0-SNAPSHOT"
  :description ""
  :url ""
  :license {}
  :dependencies [[org.clojure/clojure "_"]]
  :plugins [[lein-modules "0.3.11"]]
  :modules {:subprocess nil
            :inherited
            {:url "Something"
             :license {}}
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
