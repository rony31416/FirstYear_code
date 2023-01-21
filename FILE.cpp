#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;

void openFile(ifstream &, string);
void processFile_lineByline(ifstream &);
int main()
{
 
    ifstream FILE;
    openFile(FILE, "input.txt");
    processFile_lineByline(FILE);
    FILE.close();
     return 0;
}

void openFile(ifstream &FILE, string fileName)
{
    FILE.open(fileName);
    if (FILE.is_open())
    {
        cout << "successfully opened file\n";
    }
    else
    {
        cout << "Failed to open file\n";
    }
}
void processFile_lineByline(ifstream &FILE)
{
    // read line by line
    string line;
    while (!FILE.eof())
    {
        getline(FILE, line);
        if (FILE.good())
        {
            cout << line << "\n";
        }
    }
}

