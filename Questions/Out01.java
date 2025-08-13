import java.util.Arrays;
class Out01
{
	public static int removeDuplicates(int [] array)
	{
		int j = 0;
		for(int i = 1;i<array.length;i++)
		{
			if(array[i] != array[j])
			{
				j++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		while(j<array.length)
		{
			array[++j] = 0;
		}
		return j;
	}
	
	public static void main(String[] args)
	{
		int []array = new int[]{21,35,35,47,47,56,68};
		int j = removeDuplicates(array);
		System.out.println(Arrays.toString(array));
	}
}