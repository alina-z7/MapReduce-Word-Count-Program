/**
 * Alina Zacaria, Student @ Loyola University Chicago
 * Contact: alinazac9@gmail.com
 * Date: October 25th, 2023
 * @version final
 */

package org.alinazac;

import java.io.IOException;
import java.util.Iterator;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

/** Reducer class for the Word Count Program **/
public class WC_Reducer extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable> {

    /**
     * Mapper method to store the occurrences of the word in the document(s).
     * @param key           The input key (position in the file) - LongWritable.
     * @param values        The input value (a line of text) - Text.
     * @param output        Collector to emit key-value pairs from the mapper - OutputCollector<Text, IntWritable>.
     * @param reporter      Used to report progress or issues - Reporter.
     * @throws IOException  Signals that an I/O exception has occurred.
     */

    public void reduce(Text key, Iterator<IntWritable> values, OutputCollector<Text,IntWritable> output, Reporter reporter) throws IOException {
        // Calculating the sum of each word in the document

        // Sum variable to store the total occurrence
        int sum = 0;
        // For every word and its occurrence
        while (values.hasNext()) {
            // Sum up the int values associated with the key (word)
            sum += values.next().get();
        }
        // Output the word and its total occurrence
        output.collect(key, new IntWritable(sum));
    }
}