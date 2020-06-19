package cn.wx.snian;

/**
 * 125. 验证回文串
 */
public class Solution125 {

    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        int length = s.length();
        for (int i=0;i<length;i++){
           char c = s.charAt(i);
           if(Character.isLetterOrDigit(c));
           sb.append(c);
        }
        StringBuffer sb_re = new StringBuffer(sb).reverse();
       return  sb.toString().equals(sb_re.toString());

    }
}
