/**
 * 
 */
package weka.changedi;

import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Discretize;

/**
 * @author zunyuan.jy
 * 
 * @since 2013-7-2
 */
public class AdDiscretizer implements Prepare {

	private String inputFilePath;
	private String outputFilePath;

	/**
	 * @return the inputFilePath
	 */
	public String getInputFilePath() {
		return inputFilePath;
	}

	/**
	 * @param inputFilePath
	 *            the inputFilePath to set
	 */
	public void setInputFilePath(String inputFilePath) {
		this.inputFilePath = inputFilePath;
	}

	/**
	 * @return the outputFilePath
	 */
	public String getOutputFilePath() {
		return outputFilePath;
	}

	/**
	 * @param outputFilePath
	 *            the outputFilePath to set
	 */
	public void setOutputFilePath(String outputFilePath) {
		this.outputFilePath = outputFilePath;
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AdDiscretizer discretizer = new AdDiscretizer();
		discretizer.setInputFilePath("D:\\快盘\\projects\\91助手渠道数据新.csv");
		discretizer.setOutputFilePath("D:\\快盘\\projects\\91助手渠道数据新_dis.csv");
		discretizer.run();
	}

	@Override
	public void run() throws Exception {
		String[] options = ("-O -B 10 -M -1.0 -R first-last -i "
				+ inputFilePath + " -o " + outputFilePath).split(" ");
		Filter.filterFile(new Discretize(), options);
	}

}
