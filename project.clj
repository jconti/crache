(defproject org.clojars.jconti/crache "1.0.1-rc1"
  :description "Redis-backed caching and memoization, forked from http://github.com/strongh/crache"
  :license {:name "Eclipse Public License" :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "http://github.com/jconti/crache"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [com.taoensso/carmine "3.1.0"]
                 [org.clojure/core.cache "1.0.207"]
                 [org.clojure/core.memoize "1.0.236"]])
