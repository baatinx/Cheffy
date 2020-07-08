(ns app.nav.views.authenticated
  (:require ["@smooth-ui/core-sc" :refer [Box]]))

(defn authenticated
  []
  [:> Box {:display "flex"
           :justify-content "flex-end"
           :py 1
           :pb 10}
   
   [:> Box {:as "a"
            :href "#slides"
            :ml 3
            :pb 10}
    "Slides"]
   
   [:> Box {:as "a"
            :href "#recipes"
            :ml 3
            :pb 10}
    "Recipies"]
   
   [:> Box {:as "a"
            :href "#inbox"
            :ml 3
            :pb 10}
    "Inbox"]
   
   [:> Box {:as "a"
            :href "#profile"
            :ml 3
            :pb 10}
    "Profile"]
   ])