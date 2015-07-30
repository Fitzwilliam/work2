package com.cdg.work2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
	private String str;
	private String[] pattern = {"주민등록번호", "전화번호", "신용카드번호", "운전면허번호"};
	private String[] nextPattern = {"(\\d{6})-(\\d{7})","(\\d{3})-(\\d{3,4})-(\\d{4})",
									"(\\d{4})-(\\d{4})-(\\d{4})-(\\d{4})","(\\d{2})-(\\d{6})-(\\d{2})"
									};
	public boolean check(String data){
		str=data;
		for(int i=0;i<pattern.length;i++){
			Pattern p = Pattern.compile(pattern[i]);
			Matcher m = p.matcher(str);
			if(m.matches()){
				return true;
			}
		}	
		return false;
	}
	public boolean nextCheck(String nextData){
		for (int i=0;i<nextPattern.length;i++){
			Pattern p = Pattern.compile(nextPattern[i]);
			Matcher m = p.matcher(nextData);
			while(m.find()){
				System.out.println(m.group());
				return true;
			}
		}
		return false;
	}
		
		//체크에 따라서 다음 토큰의 숫자 정규식을 확인하고, 맞다면 그 다음을 ***로 저장. false인 경우엔 그냥 그대로 저장
		//아직 idea는 일일히 모든 토큰 다시 저장하는 수밖에없을듯.
		// phoenix208.blog.me/40036191280
		/*
		 * String str = readline
		 * String changed = str.replaceALL("찾을 문자열", "바꿀 문자열");
		 * writeFile(f,changed);
		 */
	
}
