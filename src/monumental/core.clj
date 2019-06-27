(ns monumental.core)

(defn monuments-by-region [monuments region]
  (filter (fn [m] (= region (:REG m))) monuments))