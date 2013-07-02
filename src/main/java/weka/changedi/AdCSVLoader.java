/**
 * 
 */
package weka.changedi;

import java.io.File;
import java.io.IOException;

import weka.core.converters.CSVLoader;

/**
 * @author zunyuan.jy
 *
 */
public class AdCSVLoader {

	public void run(String filePath) throws Exception{
		CSVLoader csvLoader = new CSVLoader();
		csvLoader.setFile(new File(filePath));
		System.out.println(csvLoader.getDataSet().numInstances());
	}
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AdCSVLoader loader = new AdCSVLoader();
		loader.run("D:\\快盘\\projects\\91助手渠道数据新.csv");
	}

}
