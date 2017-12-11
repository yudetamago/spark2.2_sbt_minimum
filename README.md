minimum app of 

- sbt 1.0.2
- scala 2.11.12
- spark 2.2


```bash
$ sbt assembly
$ spark-submit --class example.Sample target/scala-2.11/Sample-assembly-0.1.0-SNAPSHOT.jar
```
