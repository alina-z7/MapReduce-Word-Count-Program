/**
 * Alina Zacaria, Student @ Loyola University Chicago
 * Contact: alinazac9@gmail.com
 * Date: October 25th, 2023
 * @version final
 */

package org.alinazac;

import java.io.IOException;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;


/** Main class that executes and sets up a Word Count Job through MapReduce **/
public class WC_Main {

    /**
     * Main method to set up and execute the MapReduce job.
     * @param - args Input and output file paths as arguments.
     * @throws - IOException Signals that an I/O exception has occurred.
     */
    public static void main(String[] args) throws IOException{
        // Setting up the configuration for the MapReduce Job
        JobConf conf = new JobConf(WC_Main.class);
        conf.setJobName("Word Count");

        // Setting the output key and values as the word and occurence
        conf.setOutputKeyClass(Text.class);
        conf.setOutputValueClass(IntWritable.class);

        // Linking the Mapper, Reducer, and Combiner classes
        conf.setMapperClass(WC_Mapper.class);
        conf.setCombinerClass(WC_Reducer.class);
        conf.setReducerClass(WC_Reducer.class);

        // Having the input and output formats as text
        conf.setInputFormat(TextInputFormat.class);
        conf.setOutputFormat(TextOutputFormat.class);

        // Storing the input path from the first argument
        FileInputFormat.setInputPaths(conf,new Path(args[0]));

        // Storing the output path from the first argument
        FileOutputFormat.setOutputPath(conf,new Path(args[1]));

        //  Officially running the Job
        JobClient.runJob(conf);
    }
}
