(ns app.core
  (:require [reagent.core :as r]
            [app.theme :refer [cheffy-theme]]
            ["@smooth-ui/core-sc" :refer [Normalize ThemeProvider Button]]))

(defn app
  []
  [:<> 
   [:> Normalize]
   [:> Button "Click Here"]
   [:> Button "Submit"]
   [:hr]
   [:div "Hello World"]
   [:hr]
   [:> ThemeProvider {:theme cheffy-theme}
    [:<>
     [:> Button "Download"]
     [:> Button "Login"]]]])

(defn ^:dev/after-load start
  []
  (r/render [app]
            (.getElementById js/document "app")))

(defn ^:export init
  []
  (start))
