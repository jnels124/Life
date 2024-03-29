(ns game_of_life.server
  (:require [noir.server :as server]))

(server/load-views-ns 'game_of_life.views)

(defn -main [& m]
  (println "in main")
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'game_of_life})))

