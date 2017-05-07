(ns better-repl.ui.main-window
  (:require [fx-clj.core :as fx]
            [clojure.core.async :refer [chan go <! >!]]))

(defn repl-console []
  [:scroll-pane])

(defn repl-editor []
  [:text-area])

(defn component-layout []
  (fx/compile-fx
    [:h-box {}
      [:scroll-pane]
      [:v-box
        (repl-console)
        (repl-editor)]]))