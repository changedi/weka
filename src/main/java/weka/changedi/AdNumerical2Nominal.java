/**
 * 
 */
package weka.changedi;

import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Discretize;
import weka.filters.unsupervised.attribute.NumericToNominal;

/**
 * @author zunyuan.jy
 * 
 * @since 2013-7-2
 */
public class AdNumerical2Nominal implements Prepare {

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
		AdNumerical2Nominal n2n = new AdNumerical2Nominal();
		n2n.setInputFilePath("D:\\快盘\\projects\\05_互联网渠道设备分布part1.csv");
		n2n.setOutputFilePath("D:\\快盘\\projects\\05_互联网渠道设备分布part1_dis.arff");
		n2n.run();
	}

	@Override
	public void run() throws Exception {
		String[] options = ("-R first-last -c 1 -i "
				+ inputFilePath + " -o " + outputFilePath).split(" ");
		Filter.filterFile(new NumericToNominal(), options);
	}

}
