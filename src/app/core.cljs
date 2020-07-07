(ns app.core
  (:require [reagent.core :as r]
            [re-frame.core :as rf]
            [app.db]
            [app.theme :refer [cheffy-theme]]
            ["@smooth-ui/core-sc" :refer [Normalize ThemeProvider Button]]))

(defn app
  []
  [:<> 
   [:> Normalize]
   [:> Button "Click Here"]
   [:> Button "Submit"]
   [:> Button {:variant "success"} "Success"]
   [:> Button {:variant "info"} "Info"]
   [:hr]
   [:div "Hello World"]
   [:hr]
   [:> ThemeProvider {:theme cheffy-theme}
    [:<>
     [:> Button "Download"]
     [:> Button "Login"]]]])

(defn ^:dev/after-load start
  []
  (rf/dispatch-sync [:initialize-db])
  (r/render [app]
            (.getElementById js/document "app")))

(defn ^:export init
  []
  (start))
