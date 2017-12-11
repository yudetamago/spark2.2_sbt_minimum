package example

import org.apache.spark.{SparkContext, SparkConf}

object Sample {
  def main(args: Array[String]) {
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("DataFrame sample")
    val sc = new SparkContext(sparkConf)
    val context = new org.apache.spark.sql.SQLContext(sc) 

    val df = context.createDataFrame(Seq(("cat" ,"meow"), ("dog", "bow wow"))).toDF("name", "cry")
    df.show()
  }
}
