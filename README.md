# Problem Statement (PS)
In many java shops building and deploying maven multi-module projects follows the following path:

1. Checkout from source control. 
2. Build parent project and ALL modules (subprojects) whether they changed or not.
3. Upload artifacts/jars to Nexus maven repository.
4. Deploy to target environment.

The goal of this project is to:

1. Incrementally build a minimal subset of maven modules based on WHAT changed and dependency graph.
2. Classify maven jars into: app (the project we are building) and 3rd party (typical java deps: spring, logging, etc.)
3. For each app have a prebuilt image (Docker or else) of 3rd party jars which should not change often. 
4. Persist app =* 3rd party jars relation to database and check for additions/removal on each deployment.
5. For PS steps 3 and 4 above only transfer/deploy differences.

We will use Clojure in general and [LabmdaCD](https://github.com/flosell/lambdacd) for a build pipeline which would allow us to use full power of good programming language
to fulfill our goals step by step. Please see [this 30 minutes LambdaCD video](https://youtu.be/XXiAS_BEDhQ) for an overview what it has to offer.
# Prerequisites
* Latest Java (1.8.x)
* Latest Maven (3.x)
* [Leiningen](https://github.com/technomancy/leiningen) - Clojure build tool on top of Maven
* Latest Git. Windows Git [here](https://git-scm.com/download/win). If you a shell user please consider adding [git aliases in the root of this project](https://github.com/vitalyper/hckthn_jpm/.gitconfig) to your **.gitconfig**
* IDEs setup for Clojure is bit complicated so for newbies [Light Table](http://lighttable.com) is suggested. [Video Tutorial](http://docs.lighttable.com/tutorials/full/). 

At minimum watch 
 * Evaluation and the Console
 * Inline Evaluation
 * Evaluating with Clojure

# Incremental Build
* For each changed file find first top pom.xml and add name to set
* Using mvn command line describe [here](http://blog.soebes.de/blog/2016/08/12/maven-incremental-module-build) only build changed modules and their dependencies, similar to below
```
mvn --projects module1,module2 --also-make-dependents clean package
```

# Incremental Deployment
TODO.

# Clojure Libraries Used
* [LabmdaCD](https://github.com/flosell/lambdacd) - CD pipeline of steps (functions)
* [Pomegranate](https://github.com/cemerick/pomegranate) - A sane Clojure API for Sonatype Aether
* [Specter](https://github.com/nathanmarz/specter) - Efficient navigation/querying/modification of nested data structures
* ...

# TODO


# Future Enhancements
* Add support for clojure projects. Should be even faster since
  * Clojure namespaces are smaller than Java jars
  * We could play java agent hot class reloading game inspired by [powderkeg](https://github.com/HCADatalab/powderkeg)
