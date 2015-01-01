(defproject twclj "0.1.0-SNAPSHOT"
  :description "Tweet from commmand-line"
  :url "https://github.com/shizone/twclj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.twitter4j/twitter4j-core "4.0.2"]]
  :main ^:skip-aot twclj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
