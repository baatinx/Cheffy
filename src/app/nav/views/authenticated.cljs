(ns app.nav.views.authenticated
  (:require [reagent.core :as r]
            ["@smooth-ui/core-sc" :refer [Box]]))

(defn authenticated
  []
  (let [nav-items [{:id :saved
                    :name "saved"
                    :href "#saved"}
                   {:id :recipes
                    :name "Recipes"
                    :href "#recipes"}
                   {:id :inbox
                    :name "Inbox"
                    :href "#inbox"}
                   {:id :become-a-chef
                    :name "chef"
                    :href "#become-a-chef"}
                   {:id :profile
                    :name "profile"
                    :href "#profile"}]
        ml 2
        pb 10]
    
    [:> Box {:display "flex"
             :justify-content "flex-end"
             :py 1
             :pb 10}
     
     (for [{:keys [id name href]} nav-items]
       ;;[:div {:key id}
       [(r/adapt-react-class Box)  {:key id
                                    :as "a"
                                    :href href
                                    :ml ml
                                    :pd pb}
        name]
       ;;]
       )]))