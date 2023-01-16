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
    ifstream FILE("input.txt",ios_base :: in | ios_base ::  binary);
    openFile(FILE, "input.txt");

    // 2.process the file


    processFile_lineByline(FILE);
   // processFile_wordByword(FILE);
    //processFile_charBychar(FILE);

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
   size_t index = 2;
   wstring ws;
   while(!FILE.eof())
   {
       wchar_t wch;
       FILE.read((char*)(&wch),2);
       if(wch == 0x000D)
       {

	// 		CUser u;
	// 		string s;
	// 		s=u.WstringToString(ws);
	// 		AnaliseString(s);
	// 		ws.erase(0, ws.size() + 1);
	// 		index += 4; 		}
    //    else{
    //      ws.append(1,wch);
         index+=2;
       }


   }
}
void processFile_wordByword(ifstream &FILE)
{
    // read line by line
    string line, word;
    istringstream iss;

    while (FILE.peek() != EOF)
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
