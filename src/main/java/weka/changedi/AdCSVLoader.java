/**
 * 
 */
package weka.changedi;

import java.io.File;

import weka.core.Instances;
import weka.core.converters.CSVLoader;

/**
 * @author zunyuan.jy
 * 
 */
public class AdCSVLoader implements Prepare {

	private String filePath;

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath
	 *            the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AdCSVLoader loader = new AdCSVLoader();
		loader.setFilePath("D:\\快盘\\projects\\91助手渠道数据新.csv");
		loader.run();
	}

	@Override
	public void run() throws Exception {
		CSVLoader csvLoader = new CSVLoader();
		csvLoader.setFile(new File(filePath));
		Instances insts = csvLoader.getDataSet();
		Thread.sleep(10000);
		System.gc();
		Thread.sleep(10000);
		System.out.println(insts.numInstances());
	}

}
