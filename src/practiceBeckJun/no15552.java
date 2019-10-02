package practiceBeckJun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class no15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int line = Integer.parseInt(br.readLine());
		int[] a = new int[line];
		int[] b = new int[line];
		String[] str = new String[line];
		StringTokenizer stok;
		
		for (int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
			stok = new StringTokenizer(str[i]);
			a[i] = Integer.parseInt(stok.nextToken());
			b[i] = Integer.parseInt(stok.nextToken());
		}
		
		for (int i = 0; i < str.length; i++) {
			bw.write(a[i]+b[i]+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
