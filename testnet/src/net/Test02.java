package net;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://www.sohu.com/a/321351231_463728?scm=0.0.0.0&spm=smpc.subject.column-1.1.15608612341383BZfbAX");
			System.out.println(url.getProtocol());
			System.out.println(url.getPath());
			System.out.println(url.getFile());
			System.out.println(url.getHost());
			System.out.println(url.getUserInfo());
			System.out.println(url.getDefaultPort());
			URLConnection openConnection = url.openConnection();
			InputStream is = openConnection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			FileWriter fw = new FileWriter("d:/java2.txt");
			String s = null;
			int n = 0;
			int x = 0;
			while((s=br.readLine())!=null) {
				x++;
				fw.write(s);
				while(s.indexOf("女足")!=-1) {
					int i = s.indexOf("女足");
					n++;
					s = s.substring(i+1);
				}
			}
			System.out.println("个数:"+n);
			System.out.println("hang数:"+x);
			is.close();
			br.close();
			fw.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
