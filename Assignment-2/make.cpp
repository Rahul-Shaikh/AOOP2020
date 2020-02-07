#include <iostream>
#include <cstring>
#include <cstdio>

int main(int argc, char *argv[])
{
	if (argc == 2)
	{
		char str[100];
		strcpy(str, argv[1]);
		strcat(argv[1], ".java");
		FILE *fp = fopen(argv[1], "w");
		fprintf(fp, "import java.util.Scanner;\n\nclass %s {\n\tpublic static void main(String[] args) {\n\t\tScanner sc = new Scanner(System.in);\n\n\t}\n}", str);
	} 
}
