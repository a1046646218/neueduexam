package neueduexam.api;

public class StringsameApi {
	
	
	
	         
	 public float string_same(String str1, String str2){
		    //计算两个字符串的长度。  
		    int len1 = str1.length();
		    int len2 = str2.length();
		    int dif[][] = new int[len1+1][];//建立上面说的数组，比字符长度大一个空间
		    int temp,i,j,a;
		    //赋初值，步骤B
		    for (a = 0; a <= len1; a++) {
		        dif[a] =new int[len2+1];
		        dif[a][0] = a;
		    }
		    for (a = 0; a <= len2; a++) {
		        dif[0][a] = a;
		    }
		    //计算两个字符是否一样，计算左上的值
		    //var temp;
		    for (i = 1; i <= len1; i++) {
		        for (j = 1; j <= len2; j++) {
		            if (str1.charAt(i-1) == str2.charAt(j-1)) {
		                temp = 0;
		            } else {
		                temp = 1;
		            }
		            dif[i][j] = Math.min(Math.min(dif[i - 1][j - 1] + temp,dif[i][j - 1] + 1),dif[i - 1][j] + 1);
		        }
		    }
		    //System.out.println("差异步骤：" + dif[len1][len2]);
		    //计算相似度
		   // System.out.println(Math.max(len1, len2));
		    //System.out.println(1 - (float)(dif[len1][len2]) /(float)(Math.max(len1, len2)));
		    return 1 - (float)(dif[len1][len2]) /(float)(Math.max(len1, len2));
		}
}
