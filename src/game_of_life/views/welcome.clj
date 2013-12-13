(ns game_of_life.views.welcome
  (:require [game_of_life.views.common :as common])
  (:use [noir.core :only [defpage]]))


(defpage "/" []
  (common/game-layout
    (slurp "resources/public/homepage.html"))
)
