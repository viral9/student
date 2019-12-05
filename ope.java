import java.util.Scanner;
class student
{
	int[] roll = new int[10];
	String[] name = new String[10];
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
			System.out.println("1 for class \n2 for student data\n3 for print\n4 for serch\n5 for serch rollno ");
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
				System.out.println("enter number of class");
				sc = st.nextInt();
				System.out.println("enter how many number of student");
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
			else if(choice == 3)
			{
				System.out.println("enter number of class");
				sc = st.nextInt();
				int num;
				
				num = s[sc].roll.length;
				
				for(i=0;i<num;i++)
				{
					if(s[sc].roll[i]!=0)
					{
					System.out.println("student rollno"+s[sc].roll[i]);
					System.out.println("enter student name"+s[sc].name[i]);
					}
				}
					
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
				int a,b;
				for(a=0;a<10;a++)
				{
					for(b=0;b<10;b++)
					{
						System.out.println("rollno :"+s[a].roll[b]);
						System.out.println("rollno :"+s[a].name[b]);	
					}
				}
			}
			
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