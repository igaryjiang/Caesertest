package caesar;

import java.util.Scanner;

public class Caesertest {
	public char[] texttest;
	void jiami() {
		System.out.println("input text m:");
		Scanner btext=new Scanner(System.in);
		String text=btext.nextLine();
	    texttest=text.toCharArray();
	    System.out.println("����Ϊ��");
		for(char cc:texttest) { 
			if(cc>='a'&&cc<='z'){
				switch(cc) {
				case 'x':
					cc='a';
					System.out.print(cc);
				    continue;
				case 'y':
					cc='b';
					System.out.print(cc);
					continue;
				case'z':
					cc='c';
					System.out.print(cc);
					continue;
				default:
					cc=(char) (cc+3); 
					System.out.print(cc);
					continue;
				}
		}
			else
		{
				if(cc>='A'&&cc<='Z'){
					switch(cc) {
					case 'X':
						cc='A';
						System.out.print(cc);
					    continue;
					case 'Y':
						cc='B';
						System.out.print(cc);
						continue;
					case'Z':
						cc='C';
						System.out.print(cc);
						continue;
					default:
						cc=(char) (cc+3); 
						System.out.print(cc);
						continue;
					}
			}else
			{
				System.out.print(cc);
			}
		}
		}
		 System.out.println();
		System.out.println("��ɣ�");
	}
	void jiemi() {
		System.out.println("input text c:");
		Scanner atext=new Scanner(System.in);
		String text=atext.nextLine();
		texttest=text.toCharArray();
		System.out.println("����Ϊ��");
		for(char cc:texttest) {
			if(cc>='a'&&cc<='z') {
				switch(cc) {
				case 'a':
					cc='x';
					System.out.print(cc);
				    continue;
				case 'b':
					cc='y';
					System.out.print(cc);
					continue;
				case'c':
					cc='z';
					System.out.print(cc);
					continue;
				default:
					cc=(char) (cc-3); 
					System.out.print(cc);
					continue;
		}
			}
		else {
			if(cc>='A'&&cc<='Z') {
				switch(cc) {
				case 'A':
					cc='X';
					System.out.print(cc);
				    continue;
				case 'B':
					cc='Y';
					System.out.print(cc);
					continue;
				case'C':
					cc='Z';
					System.out.print(cc);
					continue;
				default:
					cc=(char) (cc-3); 
					System.out.print(cc);
					continue;
		}
		}else {
			System.out.print(cc);
		}
		}
		 System.out.println();
		 System.out.println("��ɣ�");
	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("ѡ���ţ�");
        System.out.println("1������");
        System.out.println("2������");
        System.out.println("3���˳�");
    	   Scanner b=new Scanner(System.in);
        String w=b.next();
        char[] p=w.toCharArray();
        Caesertest test=new Caesertest();
        if(p.length<2) {
        switch((int)p[0]) {
        case 49:
        	test.jiami();
        	continue;
        case 50:
        	test.jiemi();
        	continue;
        case 51:
        	System.out.println("�ٻᣡ");
        	return;
        default:
        	System.out.println("����������������");
            continue;
        }
        
	}else
	{
		System.out.println("����������������");
	}
       }

}}
