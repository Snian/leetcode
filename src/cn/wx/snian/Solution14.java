package cn.wx.snian;

public class Solution14 {

    public static void main(String[] args) {
        String str1 = "leet";
        String str2 = "leetcode";
        String str3 = "leeuyy";
        String str4 = "leetoo";
        String[] strs = {str1,str2,str3,str4};
        String result = longestCommonPrefix2(strs);
        System.out.println(result);
    }

    //leetcode-14 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。 方法一:横向扫描
    public String longestCommonPrefix(String[] strs){
        if(null==strs||strs.length==0){
            return "";
        }
        String prefix = strs[0];
        int count = strs.length;
        for(int i=1;i<count;i++){
            prefix = longestCommonPrefix(prefix,strs[1]);
            if(prefix.length()==0){
                break;
            }
        }
        return prefix;

    }


    public String longestCommonPrefix(String str1,String str2){
        int length = Math.min(str1.length(),str2.length());
        int index = 0;
        while (index<length && str1.charAt(index)==str2.charAt(index)){
            index++;
        }
        return str1.substring(0,index);
    }


    //leetcode-14 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。 方法二:纵向扫描
    public static String longestCommonPrefix2(String[]strs){
        if(null==strs||strs.length==0){
            return null;
        }
        int length = strs[0].length();
        int count = strs.length;

        for(int i=0;i<length;i++){
            char c = strs[0].charAt(i);
            for(int j=1;j<count;j++){
                if(i==strs[j].length()||strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    //leetcode-14 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。 方法三：二分法查找
    public String longestCommonPrefix3(String []strs){
        if(null==strs||strs.length==0){
            return "";
        }
        int minlength = Integer.MAX_VALUE;
        for(String str:strs){
            minlength = Math.min(minlength,str.length());
        }

        int low = 0;
        int high = minlength;
        while (low<high){
            int mid = (high-low+1)/2+low;
            if (isCommonPrefix(strs,mid)){
                low=mid;
            }else {
                high=mid-1;
            }
        }
        return strs[0].substring(0,low);

    }

    public boolean isCommonPrefix(String[]strs,int length){
        String str0 = strs[0].substring(0,length);
        int count = strs.length;
        for (int i =1;i<count;i++){
            String str = strs[i];
            for (int j=0;j<length;j++){
                if(str0.charAt(j)!=str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

}
