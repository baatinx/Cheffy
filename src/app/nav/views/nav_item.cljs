(ns app.nav.views.nav-item
  (:require ["@smooth-ui/core-sc" :refer [Box]]))
  
  (def item-properties {:ml 2
                        :pb 10})
  
  (defn nav-item
    [{:keys [id name href]}]
    [:> Box {:key id
             :as "a"
             :href href
             :ml (:ml item-properties)
             :pb (:pb item-properties)}
     name])