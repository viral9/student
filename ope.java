import java.util.Scanner;
class student
{
	int[] roll = new int[10];
	String[] name = new String[10];
	String cname;
}
public class ope
{	
	public static void main(String args[])
	{
		Scanner st = new Scanner(System.in);
		int i,choice,sc=0,scr=0;

		student s[] = new student[10];
		do
		{
			System.out.println("1 for class \n2 for student data\n3 for print\n4 for serch\n5 for class print\n6 for char search\n7 for delete class");
			choice = st.nextInt();
			if(choice == 1)
			{
				System.out.println("enter how many number of class");
				scr = st.nextInt();
				for(i=0;i<scr;i++)
				{
					s[i] = new student();
				}
			}
			else if(choice == 2)
			{
				int ch;
				do
				{
				System.out.println("enter which number of class");
				sc = st.nextInt();
				if(0==s[sc].roll[0])
				{
				System.out.println("enter class name");
					Scanner cna = new Scanner(System.in);
					String cna1 = cna.nextLine();
					s[sc].cname = cna1;
				System.out.println("enter how many number of student :");
				int ss = st.nextInt();
				for(i=0;i<ss;i++)
				{
					System.out.println("enter student rollno");
					int rollno = st.nextInt();
					s[sc].roll[i] = rollno;
					System.out.println("enter student name");
					Scanner sts = new Scanner(System.in);
					String name1 = sts.nextLine();
					s[sc].name[i] = name1;
				}
				}
				else
				{
					System.out.println("alredy exists");	
				}
				System.out.println("1 for continue :");
				ch= st.nextInt();
				}while(ch==1);	
			}
			else if(choice == 3)
			{
			
				int num,newch;
				do
				{
					System.out.println("enter number of class");
					sc = st.nextInt();
				if(s[sc].roll[0]!=0)
				{
				num = s[sc].roll.length;
				System.out.println("class name :"+s[sc].cname);
				for(i=0;i<num;i++)
				{
					if(s[sc].roll[i]!=0)
					{
					System.out.println("student rollno"+s[sc].roll[i]);
					System.out.println("enter student name"+s[sc].name[i]);
					}
				}
				}
				else if(s[sc].roll[0]==0)
				{
					System.out.println("wrong choice");
				}
					System.out.println("11 for continue");
					newch = st.nextInt();
				}while(newch==11);
					
			}
			else if(choice == 4)
			{
				Scanner scaname = new Scanner(System.in);
				String sname = " ";
				int secnum = 0;
				System.out.println("enter class number :");
				int cnum = st.nextInt();
				System.out.println("1 for rollno\n2 for number");
				choice = st.nextInt();
				if(choice == 1)
				{
					System.out.println("enter student number :");
					secnum = st.nextInt();	
				}
				else if(choice == 2)
				{
					System.out.println("enter name for search :");
					sname = scaname.nextLine();	
				}
				
				
				//s[cnum] = new student();
				int num = s[cnum].roll.length;
				//System.out.println(s[cnum].name[2]);
				for(i=0;i<num;i++)
				{
					if(s[cnum].roll[i]!=0)
					{
						if(s[cnum].name[i].equals(sname) || s[cnum].roll[i] == secnum )
						{
							System.out.println(s[cnum].roll[i]);
							System.out.println(s[cnum].name[i]);
						}
					}
				}
				 
			}
			else if(choice==5)
			{
				int h;
				for(i=0;i<scr;i++)
				{
					if(s[i].roll[0]!=0)
					{
					System.out.println("class num"+i);
					int num = s[i].roll.length;
					System.out.println("length of student"+num);
					
					for(h=0;h<num;h++)
					{
						if(s[i].roll[h]!=0)
						{
							System.out.println("rollno :"+s[i].roll[h]);
							System.out.println("rollno :"+s[i].name[h]);
						}	
					}
					}
					
				}	
			}
			else if(choice==6)
			{
				int h;
				Scanner senca = new Scanner(System.in);
				String senca1;
				System.out.println("enter name char");
				senca1 = senca.nextLine();
				for(i=0;i<scr;i++)
				{
					if(s[i].roll[0]!=0)
					{
					System.out.println("class num"+i);
					int num = s[i].roll.length;
					System.out.println("length of student"+num);
					
					for(h=0;h<num;h++)
					{
						if(s[i].roll[h]!=0)
						{
							if(s[i].name[h].contains(senca1))
							{
								System.out.println("rollno :"+s[i].roll[h]);
								System.out.println("rollno :"+s[i].name[h]);
							}
						}	
					}
					}
					
				}	
			}
			else if(choice==7)
			{
				int opop;
				System.out.println("list of class");
				for(i=0;i<scr;i++)
				{
					if(s[i].roll[0]!=0)
					{
						System.out.println("class number : "+i);
						System.out.println(s[i].cname);
					}
				}
				do
				{
					
					System.out.println("enter class number for delete");
					int newop = st.nextInt();
					if(s[newop].roll[0]!=0)
					{
						int lenofroll;
						s[newop].cname = " ";
						lenofroll = s[newop].roll.length;
						for(i=0;i<lenofroll;i++)
						{
							s[newop].roll[i]=0;
							s[newop].name[i]=" ";
						}
					}
					else
					{
						System.out.println("wrong choice :");	
					}
					System.out.println("enter 1 for continue :");
					opop = st.nextInt();
				}while(opop==1);
			}
			/*else if(choice==7)
			{
				int a,b;
				for(a=0;a<10;a++)
				{
					for(b=0;b<10;b++)
					{
						System.out.println("rollno :"+s[a].roll[b]);
						System.out.println("rollno :"+s[a].name[b]);	
					}
				}
			}*/
			
			/*for(i=0;i<sc;i++)
			{
				int ss = s.nextInt();
				sc[i] = new student();
				for(j=0;j<ss;j++)
				{
					System.out.println("enter rollno");
					int ss = s.nextInt();	
					sc[i].roll[i] = ss;
					System.out.println("enter name");
					String sn = s.nextLine();	
					sc[i].name[i] = sn;
				}	
			}*/
			System.out.println("enter 99 for continue");
			choice = st.nextInt();	
		}while(choice==99);

		

	}
} 