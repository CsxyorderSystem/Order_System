package edu.csxy.order.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class Encoder {
	
    public static String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        //确定计算方法
        MessageDigest md5=MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
        return newstr;
    }

//	public static void main(String[] args) {
//		try {
//			String code = Encoder.EncoderByMd5("XILoveYou4852010000    12448456565");
//			System.out.println(code);
//			
//			if(Encoder.EncoderByMd5("XILoveYou4852010000    12448456565").equals(code)){
//				System.out.println(code.length());
//			}
//		} catch (NoSuchAlgorithmException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
