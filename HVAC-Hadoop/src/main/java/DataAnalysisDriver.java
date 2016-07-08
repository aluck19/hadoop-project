import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import java.io.IOException;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Text;

/**
 * Created by who-are-you on 6/2/16.
 */
public class DataAnalysisDriver {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        String inputFile = "input/firstResult.csv";
        Configuration configuration = new Configuration();
        Job anaJob = Job.getInstance(configuration);


        FileInputFormat.setInputPaths(anaJob,inputFile);
        FileOutputFormat.setOutputPath(anaJob,new Path("secondResult.csv"));


        anaJob.setInputFormatClass(TextInputFormat.class);
        anaJob.setOutputFormatClass(TextOutputFormat.class);


        anaJob.setOutputKeyClass(IntWritable.class);
        anaJob.setOutputValueClass(Text.class);

        anaJob.setMapperClass(AnalysisMapper.class);
        anaJob.setReducerClass(AnalysisReducer.class);

        anaJob.setJarByClass(DataAnalysisDriver.class);
        anaJob.setJobName("First Written Job");

        anaJob.waitForCompletion(true);

    }
}
