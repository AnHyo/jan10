package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//자바 입출력
//외부와 연결
/* 어떤 통로로 연결?
 * 어떻게 주고 받아요?
 * null값?
 * stream
 */
public class Io01 {
	public static void main(String[] args) {
		
		FileReader fr = null; //문자 기반 입력 스트림 최상위 클래스인 Reader
		BufferedReader br = null; //위 Reader을 상속받아서 만들어진 리더들
		
		try {
			fr = new FileReader("/Users/anhyojeong/Documents/temp.txt");// 더 많은 양을 읽어올 수 있는건 BufferedReader
			br = new BufferedReader(fr);
			String line = null;
			// line : 문자열을 읽어서 출력하기 위해서 만듦
			while((line = br.readLine()) != null) { // 읽었는데 데이터가 있다면 출력하라
				System.out.println(line);
				System.out.println("한 줄");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//가장 나중에 오픈한 객체를 먼저 닫아줍니다.
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
