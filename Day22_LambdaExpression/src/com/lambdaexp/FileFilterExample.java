package com.lambdaexp;
import java.io.File;
import java.io.FileFilter;

//FileFilter Example
public class FileFilterExample 
{
	public static void main(String[] args)
	{
		//Lambda Expression for FileFilter
		FileFilter obj=(File pathname)->pathname.getName().endsWith(".txt");
		File dir=new File("C:\\Users\\Admin\\Downloads");
		File[] contents=dir.listFiles(obj);
		for(File i:contents) 
		{
			System.out.println(i);
		}
	}
}
