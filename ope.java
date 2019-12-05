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
		int i,choice;

		student s[] = new student[10];
		do
		{
			System.out.println("1 for class \n2 for student data\n3 for print\n4 for serch by name ");
			choice = st.nextInt();
			if(choice == 1)
			{
				System.out.println("enter how many number of class");
				int sc = st.nextInt();
				for(i=0;i<sc;i++)
				{
					s[i] = new student();
				}
			}
			else if(choice == 2)
			{
				System.out.println("enter number of class");
				int sc = st.nextInt();
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
				int sc = st.nextInt();
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
				System.out.println("enter class number :");
				int cnum = st.nextInt();
				System.out.println("enter name for search :");
				Scanner scaname = new Scanner(System.in);
				String sname = scaname.nextLine();
				//s[cnum] = new student();
				int num = s[cnum].roll.length;
				//System.out.println(s[cnum].name[2]);
				for(i=0;i<num;i++)
				{
					if(s[cnum].roll[i]!=0)
					{
						if(s[cnum].name[i].equals(sname))
						{
							System.out.println(s[cnum].name[i]);
						}
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