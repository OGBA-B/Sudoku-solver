import java.util.ArrayList;
import java.util.Collections;

public class sudokosolver {

	public static void main(String[] args) {
		               /*{{0,0,0,0,8,0,7,0,5},
				          {0,0,7,3,1,0,4,2,0},
				          {8,0,0,0,9,0,0,6,0},
				          {5,0,4,0,6,0,0,8,0}, 
				          {0,0,0,4,7,9,0,0,0}, 
				          {0,9,0,0,5,0,3,0,7}, 
				          {0,8,0,0,3,0,0,0,2}, 
				          {0,2,3,0,4,5,8,0,0},
				          {7,0,5,0,2,0,0,0,0}};*/
		
		int[][] sudoku = /*{{5,3,0,0,7,0,0,0,0},
				      {6,0,0,1,9,5,0,0,0},
				{0,9,8,0,0,0,0,6,0}, {8,0,0,0,6,0,0,0,3}, {4,0,0,8,0,3,0,0,1}, 
				{7,0,0,0,2,0,0,0,6}, {0,6,0,0,0,0,2,8,0}, {0,0,0,4,1,9,0,0,5},
				{0,0,0,0,8,0,0,7,9}};
			     {{0,0,0,0,8,0,7,0,5},
		          {0,0,7,3,1,0,4,2,0},
		          {8,0,0,0,9,0,0,6,0},
		          {5,0,4,0,6,0,0,8,0}, 
		          {0,0,0,4,7,9,0,0,0}, 
		          {0,9,0,0,5,0,3,0,7}, 
		          {0,8,0,0,3,0,0,0,2}, 
		          {0,2,3,0,4,5,8,0,0},
		          {7,0,5,0,2,0,0,0,0}};
		/*/{
				{2,0,0,7,0,0,8,3,0},
				{1,3,0,0,0,0,0,0,5},
				{5,9,0,4,3,0,2,0,0},
				{4,0,0,0,0,0,0,0,6},
				{0,0,0,5,0,9,0,0,0},
				{0,0,0,0,0,0,4,1,8},
				{0,0,0,0,8,1,0,0,4},
				{0,0,2,0,0,0,0,5,0},
				{6,4,0,0,5,0,3,0,0}
			};
		sudoku=byForce(sudoku);
	printArray(sudoku);
	
	}
public static int assign1(int i,int j,int array[][])
	{
	ArrayList<Integer>[][] list;
	list=genLink(array);
	if(list[i][j].size()==0)
	{
		
	}
	if(list[i][j].size()==1)
	{
	return list[i][j].get(0);
	}
	/*else if(list[i][j].size() >1)
	{
		for(int q=0;q<list[i][j].size();q++)
		if(!checkL(i,j,list[i][j].get(q),list,q))
		{
		 return list[i][j].get(q);
		}
	}
*/
	return 0;
	}
public static int[][] solver(int array[][])
{
int i,j;
for(i=0;i<3;i++) // For every row
   for(j=0;j<3;j++) //For the columns
     if(array[i][j]==0)
      {
	array[i][j]=assign(i,j,array);
      }
for(i=0;i<3;i++)  // For every row
	   for(j=3;j<6;j++) //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign(i,j,array);
	      }
for(i=0;i<3;i++)  // For every row
	   for(j=6;j<9;j++) //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign(i,j,array);
	      }
for(i=3;i<6;i++)  // For every row
	   for(j=0;j<3;j++) //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign(i,j,array);
	      }
for(i=3;i<6;i++) // For every row
	   for(j=3;j<6;j++) //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign(i,j,array);
	      }
for(i=3;i<6;i++) // For every row
	for(j=6;j<9;j++) //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign(i,j,array);
	      }
for(i=6;i<9;i++) // For every row
	   for(j=0;j<3;j++) //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign(i,j,array);
	      }
for(i=6;i<9;i++) // For every row
	   for(j=3;j<6;j++)  //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign(i,j,array);
	      }
for(i=6;i<9;i++) // For every row
	for(j=6;j<9;j++) //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign(i,j,array);
	      }
	
	return array;
	}
public static int[][] solver1(int array[][])
{
int i,j;
for(i=0;i<3;i++) // For every row
   for(j=0;j<3;j++) //For the columns
     if(array[i][j]==0)
      {
	array[i][j]=assign1(i,j,array);
      }
for(i=0;i<3;i++)  // For every row
	   for(j=3;j<6;j++) //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign1(i,j,array);
	      }
for(i=0;i<3;i++)  // For every row
	   for(j=6;j<9;j++) //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign1(i,j,array);
	      }
for(i=3;i<6;i++)  // For every row
	   for(j=0;j<3;j++) //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign1(i,j,array);
	      }
for(i=3;i<6;i++) // For every row
	   for(j=3;j<6;j++) //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign1(i,j,array);
	      }
for(i=3;i<6;i++) // For every row
	for(j=6;j<9;j++) //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign1(i,j,array);
	      }
for(i=6;i<9;i++) // For every row
	   for(j=0;j<3;j++) //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign1(i,j,array);
	      }
for(i=6;i<9;i++) // For every row
	   for(j=3;j<6;j++)  //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign1(i,j,array);
	      }
for(i=6;i<9;i++) // For every row
	for(j=6;j<9;j++) //For the columns
	     if(array[i][j]==0)
	      {
		array[i][j]=assign1(i,j,array);
	      }
	
	return array;
	}
public static boolean inCell(int i,int j,int number,int array[][])
{
int k = 0;int l=0;
if(i<3)
{
k=0;
}
else if((3 <= i)&& (i<6) )
{
k=3;
	}
else if(6 <= i)
{
k=6;
	}
if(j<3)
{
l=0;
}
else if((3 <= j)&& (j<6) )
{
l=3;
	}
else if(6 <= j)
{
l=6;
	}
for(int d=k;d<(k+3);d++)
	for(int e=l;e<(l+3);e++)
		{
		if(array[d][e]==number)
		{
			return true;
		}
			}
	
	return false;
}
public static boolean inCellL(int i,int j,int number,ArrayList<Integer> array[][],int w)
{
int k = 0;int l=0;
if(i<3)
{
k=0;
}
else if((3 <= i)&& (i<6) )
{
k=3;
	}
else if(6 <= i)
{
k=6;
	}
if(j<3)
{
l=0;
}
else if((3 <= j)&& (j<6) )
{
l=3;
	}
else if(6 <= j)
{
l=6;
	}
for(int d=k;d<(k+3);d++)
	for(int e=l;e<(l+3);e++)
		{
		if(array[d][e].isEmpty() || w>=array[d][e].size())
		{
			return false;
		}
		if(array[d][e].get(w)==number)
		{
			return true;
		}
			}
	
	return false;
}	
public static int assign(int i,int j,int array[][])
{
ArrayList<Integer>[][] list;
list=genLink(array);
if(list[i][j].size()==0)
{
	
}
if(list[i][j].size()==1)
{
return list[i][j].get(0);
}
else if(list[i][j].size() >1)
{
	for(int q=0;q<list[i][j].size();q++)
	if(!checkL(i,j,list[i][j].get(q),list,q))
	{
	 return list[i][j].get(q);
	}
}

return 0;
}
public static boolean incolumn(int k,int number,int list[][])
{
	for(int i=0;i<9;i++)
	{
	if(list[i][k]==number)
	{
return true;
	}
}
	return false;
}
public static boolean inrow(int i,int number,int array[][])
{
	for(int k=0;k<9;k++)
	{
	if(array[i][k]==number)
	{
return true;
	}
}
	return false;
}
public static boolean inrowL(int i,int number,ArrayList<Integer> array[][],int d)
{
	for(int k=0;k<9;k++)
	{
	if(array[i][k].isEmpty() || array[i][k].size()<=d)
	{
		return false;
	}
	else if(array[i][k].get(d)==number)
	{
return true;
	}
}
	return false;
}
public static void printArray(int matrix[][]) {
    for (int row = 0; row < matrix.length; row++) {
        for (int column = 0; column < matrix[row].length; column++) {
            System.out.print(matrix[row][column] + " ");
        }
        System.out.println();
    }
}
public static ArrayList<Integer>[][] genLink (int [][] array)
	{
	ArrayList<Integer>[][] listArray = new ArrayList [9][9];
	for(int r=0;r<9;r++)
		for(int s=0;s<9;s++)
		{
			listArray[r][s]= new ArrayList();
		}
	int number = 0;
	for(int i=0;i<9;i++)
		for(int j=0;j<9;j++)
	     for(int d=1;d<10;d++)
	          {
	    	 	number =d;
	    	 	if(!(inrow(i,number,array) || incolumn(j,number,array) || inCell(i,j,number,array)))
	    	 		{
	               listArray[i][j].add(number);
	    	 		}
	    	 	Collections.sort(listArray[i][j]);
	    	 	
	}
	return listArray;
	}
public static boolean check(int i,int j,int number,int array[][])
{
	if(inrow(i,number,array) ||incolumn(j,number,array) || inCell(i,j,number,array))
	{
		return true;
		}
	return false;
}
public static boolean checkL(int i,int j,int number,ArrayList<Integer> array[][],int d)
{
	if(inrowL(i,number,array,d) ||incolumnL(j,number,array,d) || inCellL(i,j,number,array,d))
	{
		return true;
		}
	else
	return false;
}
public static boolean incolumnL(int k,int number,ArrayList<Integer> list[][],int d)
{
	for(int i=0;i<9;i++)
	{
		if(list[i][k].isEmpty() || list[i][k].size()<=d)
		{
			return false;
		}
	if(list[i][k].get(d)==number)
	{
return true;
	}
}
	return false;
}
public static int[][] byForce(int sudoku [][])
{
	for(int i=0;i<200;i++){
		sudoku= solver1(sudoku);
	}
	for(int i=0;i<200;i++){
		sudoku= solver(sudoku);
	}
	
	return sudoku;
}
}