(defproject
 leaderboards
 "0.1.0-SNAPSHOT"
 :dependencies
 [[org.clojure/clojure "1.6.0"]
  [tailrecursion/boot.core "2.5.1" :exclusions [[org.clojure/clojure]]]
  [tailrecursion/boot.task "2.2.4"]
  [tailrecursion/hoplon "5.10.24"]]
 :source-paths
 ["src/hl" "src/cljs" "src/clj"])
