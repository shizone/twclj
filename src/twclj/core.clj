(ns twclj.core
  (:gen-class))
(import '(twitter4j.Twitter)
        '(twitter4j.TwitterFactory))

(defn -main
  "Tweet from command-line."
  [msg & args]
  (def tw (. (new twitter4j.TwitterFactory) getInstance))
  (. tw updateStatus msg))
