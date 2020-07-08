(ns app.nav.views.authenticated
  (:require [app.nav.views.nav-item :refer [nav-item]]
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
                    :href "#profile"}]]
    
    [:> Box {:display "flex"
             :justify-content "flex-end"
             :py 1}
     
     (for [item nav-items]
       [:div {:key (:id item)}
        [nav-item item]])]))