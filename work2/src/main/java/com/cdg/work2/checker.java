package com.cdg.work2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checker {
	private String str;
	private String[] pattern = {"주민등록번호", "전화번호", "주소", "신용카드번호", "운전면허번호"};
	
	public checker(String data){
		str=data;
	}
	public boolean check(){
		for(int i=0;i<pattern.length;i++){
			Pattern p = Pattern.compile(pattern[i]);
			Matcher m = p.matcher(str);
			if(m.matches()){
				return true;
			}
		}
		return false;
		//체크에 따라서 다음 토큰의 숫자 정규식을 확인하고, 맞다면 그 다음을 ***로 저장. false인 경우엔 그냥 그대로 저장
		//아직 idea는 일일히 모든 토큰 다시 저장하는 수밖에없을듯.
	}
}
