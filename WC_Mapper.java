/******************************************************************************************************************************************
 * Alina Zacaria, Student @ Loyola University Chicago
 * Contact: alinazac9@gmail.com
 * Date: October 25th, 2023
 * @version final
 ******************************************************************************************************************************************/

package org.alinazac;

import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

/** Mapper class for the Word Count Program **/
public class WC_Mapper extends MapReduceBase implements Mapper<LongWritable,Text,Text,IntWritable>{

    private final static IntWritable one = new IntWritable(1);
    private Text word = new Text();

    /**
     * Mapper method to store the occurrences of the word in the document(s).
     * @param key           The input key (position in the file) - LongWritable.
     * @param value         The input value (a line of text) - Text.
     * @param output        Collector to emit key-value pairs from the mapper - OutputCollector<Text, IntWritable>.
     * @param reporter      Used to report progress or issues - Reporter.
     * @throws IOException  Signals that an I/O exception has occurred.
     */

    public void map(LongWritable key, Text value, OutputCollector<Text,IntWritable> output, Reporter reporter) throws IOException {
        // Converting each line from a Text type to a String type
        String line = value.toString();
        // Setting up a tokenizer for each word in the line
        StringTokenizer tokenizer = new StringTokenizer(line);
        // For every word in the line...
        while (tokenizer.hasMoreTokens()){
            // Store the word value in a variable
            word.set(tokenizer.nextToken());
            // And output the count as one for that word
            output.collect(word, one);
        }
    }

}
