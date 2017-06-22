(defproject hckthn_jpm "0.1.0-SNAPSHOT"
            :description "JPM hackathon June 22, 2017"
            :url "https://github.com/vitalyper/hckthn_jpm"
            :dependencies [[lambdacd "0.13.2"]
                           [lambdaui "0.4.0"]
                           [http-kit "2.2.0"]
                           [org.clojure/clojure "1.8.0"]
                           [org.clojure/tools.logging "0.3.1"]
                           [org.slf4j/slf4j-api "1.7.5"]
                           [ch.qos.logback/logback-core "1.0.13"]
                           [ch.qos.logback/logback-classic "1.0.13"]

                           [com.cemerick/pomegranate "0.3.1"]
                           [com.rpl/specter "1.0.2"]
                           [org.clojure/java.jdbc "0.7.0-alpha3"]
                           [com.h2database/h2 "1.4.196"]
                           [korma "0.4.3"]
]
            :profiles {:uberjar {:aot :all}}
            :main hckthn_jpm.core)
