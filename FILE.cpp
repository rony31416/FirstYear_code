#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;

void openFile(ifstream &, string);
void processFile_lineByline(ifstream &);
void processFile_wordByword(ifstream &);
void processFile_charBychar(ifstream &);
int main()
{
    // 1.open the file
    ifstream FILE;
    openFile(FILE, "input.txt");

    // 2.process the file

    
   // processFile_lineByline(FILE);
    processFile_wordByword(FILE);
    processFile_charBychar(FILE);

    // 3.close the file
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
void processFile_wordByword(ifstream &FILE)
{
    // read line by line
    string line, word;
    istringstream iss;

    while (!FILE.eof())
    {
        getline(FILE, line);
        if (FILE.good())
        {
            iss.clear();
            iss.str(line);
            while (iss.good())
            {
                iss >> word; // string extraction
                cout << word << "\n";
            }
        }
    }
}

void processFile_charBychar(ifstream &FILE)
{
    {
        // read line by line
        string line, word;
        istringstream iss;

        while (!FILE.eof())
        {
            getline(FILE, line);
            if (FILE.good())
            {
                iss.clear();
                iss.str(line);
                while (iss.good())
                {
                    iss >> word; // string extraction
                    for (auto c : word)
                    {
                        cout << c << "\n";
                    }
                }
            }
        }
    }
}
