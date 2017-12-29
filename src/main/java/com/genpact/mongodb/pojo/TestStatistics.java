package com.genpact.mongodb.pojo;
public class TestStatistics {

 public static void main(String[] args) {
	 double[] testData = new double[]{
			 18.93,
			 19.209999,
			 19.299999,
			 19.049999,
			 19.18,
			 19.18,
			 19.07,
			 18.9,
			 19.040001,
			 18.540001,
			 18.01,
			 17.84,
			 17.98,
			 18.620001,
			 18.18,
			 18.51,
			 18.52,
			 18.76,
			 18.6,
			 18.27,
			 18.09,
			 18.209999,
			 18.02,
			 18,
			 17.75,
			 17.85,
			 17.85,
			 17.73,
			 17.719999,
			 17.91,
			 17.940001,
			 17.879999,
			 17.809999,
			 17.91,
			 18.030001,
			 17.93,
			 17.76,
			 17.92,
			 17.49,
			 17.43,
			 17.379999,
			 17.549999,
			 17.33,
			 17.200001,
			 16.969999,
			 16.82,
			 16.98,
			 16.76,
			 16.610001,
			 16.51,
			 15.94,
			 15.82,
			 15.81,
			 16.139999,
			 16.190001,
			 16.110001,
			 16.110001,
			 16.290001,
			 16.379999,
			 16.26,
			 16.360001,
			 16.309999,
			 16.059999,
			 16.139999,
			 16.32,
			 16.4,
			 16.719999,
			 16.73,
			 16.959999,
			 17.059999,
			 17.27,
			 17.299999,
			 17.290001,
			 17.059999,
			 17,
			 17.1,
			 17.18,
			 17,
			 17.049999,
			 17,
			 17.18,
			 17.34,
			 17.43,
			 17.49,
			 17.530001,
			 17.4,
			 17.360001,
			 17.5,
			 17.620001,
			 17.610001,
			 17.799999,
			 17.950001,
			 17.799999,
			 17.879999,
			 17.780001,
			 17.610001,
			 17.690001,
			 17.469999,
			 17.26,
			 17.24,
			 17.01,
			 16.860001,
			 17.049999,
			 17.209999,
			 17.49,
			 17.51,
			 17.6,
			 17.629999,
			 17.639999,
			 17.709999,
			 17.98,
			 18.24,
			 18.24,
			 18.27,
			 18.049999,
			 18.040001,
			 17.98,
			 18.1,
			 18.049999,
			 18.120001,
			 18,
			 18,
			 18.049999,
			 18.049999,
			 17.950001,
			 18.049999,
			 17.92,
			 17.85,
			 17.530001,
			 17.389999,
			 17.23,
			 17.23,
			 17.24,
			 17.309999,
			 17.299999,
			 17.110001,
			 17.309999,
			 17.27,
			 17.219999,
			 17.030001,
			 17.07,
			 17.15,
			 16.969999,
			 17.07,
			 16.98,
			 16.969999,
			 16.92,
			 16.940001,
			 16.85,
			 16.85,
			 16.85,
			 16.889999,
			 17.129999,
			 17.200001,
			 17.129999,
			 17.17,
			 17.209999,
			 17.299999,
			 17.27,
			 17.17,
			 17.23,
			 17.049999,
			 16.940001,
			 16.549999,
			 16.440001,
			 16.469999,
			 16.040001,
			 16.950001,
			 17.18,
			 16.889999,
			 16.860001,
			 16.889999,
			 16.780001,
			 16.73,
			 17.030001,
			 17.16,
			 17.200001,
			 17.129999,
			 17.309999,
			 17.07,
			 17.110001,
			 17.059999,
			 16.940001,
			 17.25,
			 17.459999,
			 17.24,
			 17.190001,
			 17.379999,
			 17.48,
			 17.66,
			 17.549999,
			 17.42,
			 17.18,
			 16.93,
			 17.09,
			 17.16,
			 17.290001,
			 17.23,
			 17.32,
			 17.42,
			 17.41,
			 17.120001,
			 16.98,
			 16.969999,
			 17.25,
			 17.34,
			 17.23,
			 17.370001,
			 17.299999,
			 16.709999,
			 16.75,
			 16.549999,
			 16.68,
			 16.35,
			 16.18,
			 16.360001,
			 16,
			 15.5,
			 15.44,
			 15.3,
			 15.11,
			 15.09,
			 14.97,
			 14.61,
			 14.53,
			 14.5,
			 14.28,
			 17.23,
			 17.040001,
			 16.959999,
			 16.969999,
			 16.969999,
			 17.02,
			 16.879999,
			 16.84,
			 16.58,
			 16.690001,
			 16.950001,
			 17.450001,
			 18,
			 18.120001,
			 18.09,
			 18.25,
			 18.18,
			 18.049999,
			 18.040001,
			 18,
			 18.040001,
			 18.01,
			 18.049999,
			 17.92,
			 18.23
};
             // System.out.println("最大值："+getMax(testData));
              
             // System.out.println("最小值："+getMin(testData));
             // System.out.println("计数："+getCount(testData));
              //System.out.println("求和："+getSum(testData));
              //System.out.println("求平均："+getAverage(testData));
              
             // System.out.println("方差："+getVariance(testData));
              
              //System.out.println("标准差："+getStandardDiviation(testData));
	 
	 
	 System.out.println(((double)1/(double)16));
              
 }

 /**
  * 求给定双精度数组中值的最大值
  * 
  * @param inputData
  *            输入数据数组
  * @return 运算结果,如果输入值不合法，返回为-1
  */
 public static double getMax(double[] inputData) {
  if (inputData == null || inputData.length == 0)
   return -1;
  int len = inputData.length;
  double max = inputData[0];
  for (int i = 0; i < len; i++) {
   if (max < inputData[i])
    max = inputData[i];
  }
  return max;
 }

 /**
  * 求求给定双精度数组中值的最小值
  * 
  * @param inputData
  *            输入数据数组
  * @return 运算结果,如果输入值不合法，返回为-1
  */
 public static double getMin(double[] inputData) {
  if (inputData == null || inputData.length == 0)
   return -1;
  int len = inputData.length;
  double min = inputData[0];
  for (int i = 0; i < len; i++) {
   if (min > inputData[i])
    min = inputData[i];
  }
  return min;
 }

 /**
  * 求给定双精度数组中值的和
  * 
  * @param inputData
  *            输入数据数组
  * @return 运算结果
  */
 public static double getSum(double[] inputData) {
  if (inputData == null || inputData.length == 0)
   return -1;
  int len = inputData.length;
  double sum = 0;
  for (int i = 0; i < len; i++) {
   sum = sum + inputData[i];
  }

  return sum;

 }

 /**
  * 求给定双精度数组中值的数目
  * 
  * @param input
  *            Data 输入数据数组
  * @return 运算结果
  */
 public static int getCount(double[] inputData) {
  if (inputData == null)
   return -1;

  return inputData.length;
 }

 /**
  * 求给定双精度数组中值的平均值
  * 
  * @param inputData
  *            输入数据数组
  * @return 运算结果
  */
 public static double getAverage(double[] inputData) {
  if (inputData == null || inputData.length == 0)
   return -1;
  int len = inputData.length;
  double result;
  result = getSum(inputData) / len;
  
  return result;
 }

 /**
  * 求给定双精度数组中值的平方和
  * 
  * @param inputData
  *            输入数据数组
  * @return 运算结果
  */
 public static double getSquareSum(double[] inputData) {
  if(inputData==null||inputData.length==0)
      return -1;
     int len=inputData.length;
  double sqrsum = 0.0;
  for (int i = 0; i <len; i++) {
   sqrsum = sqrsum + inputData[i] * inputData[i];
  }

  
  return sqrsum;
 }

 /**
  * 求给定双精度数组中值的方差
  * 
  * @param inputData
  *            输入数据数组
  * @return 运算结果
  */
 public static double getVariance(double[] inputData) {
  int count = getCount(inputData);
  double sqrsum = getSquareSum(inputData);
  double average = getAverage(inputData);
  double result;
  result = (sqrsum - count * average * average) / count;

     return result; 
 }

 /**
  * 求给定双精度数组中值的标准差
  * 
  * @param inputData
  *            输入数据数组
  * @return 运算结果
  */
 public static double getStandardDiviation(double[] inputData) {
  double result;
  //绝对值化很重要
  result = Math.sqrt(Math.abs(getVariance(inputData)));
  
  return result;

 }
}