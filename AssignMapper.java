

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.*; 


public class AssignMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	
	Text Count = new Text("Number of People :");
	IntWritable one = new IntWritable(1);
	
	public void map(LongWritable key, Text value, Context context) 
			throws IOException, InterruptedException {
		
			context.write(Count, one);
		}
	}
