(ns better-repl.core
  (:require [fx-clj.core :as fx]
            [clojure.core.async :refer [chan go <! >!]]
            [better-repl.ui.main-window :as mw])
  (:import (javafx.scene.input KeyCode)
           (javafx.stage Modality)))

(defn -main []
  (let [scene (fx/scene (mw/component-layout))
        stage (fx/stage)]
    (.setScene stage scene)
    (.initModality stage Modality/NONE)
    (fx/pset! stage {:title "Better REPL"})
    (.show stage)
    stage))