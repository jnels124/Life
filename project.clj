(defproject game_of_life "0.1.0-SNAPSHOT"
            :description "Implementation of conway's game of life"
            :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.1"]
                 [ring "1.0.1"]
                 [ring/ring-jetty-adapter "1.1.0"]
                 [ring/ring-devel "1.1.0"]
                 [ring-basic-authentication "1.0.1"]
                 [environ "0.2.1"]
                 [enlive "1.0.1"]
                 [com.cemerick/drawbridge "0.0.6"]
                           [noir "1.3.0-beta3"]]
		    :plugins [[lein-cljsbuild "0.2.9"]
                	  [environ/environ.lein "0.2.1"]]
  			:hooks [environ.leiningen.hooks]
   			:dev-dependencies [[lein-cljsbuild "0.2.9"]] ; cljsbuild plugin
			:cljsbuild
			{:builds
			 [{:builds nil,
			   :source-path "src-cljs",
			   :compiler
			   {:pretty-print true,
			    :output-to "resources/public/js/cljs.js",
			    :optimizations :simple}}]}
            :main game_of_life.server)

