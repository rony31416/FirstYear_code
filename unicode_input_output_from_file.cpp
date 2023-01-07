#include<bits/stdc++.h>
#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;
std::wstring readUnicodeFile(const char* filename)
{
    std::ifstream wif(filename);
    std::stringstream wss;
    wss << wif.rdbuf();
    std::string  const &str = wss.str();
    std::wstring wstr;
    wstr.resize(str.size()/sizeof(wchar_t));
    std::memcpy(&wstr[0],str.c_str(),str.size()); // copy data into wstring
    return wstr;
}

void WriteUnicodetoFile(const char* myFile,  wstring& ws)
{
    std::ofstream outFile(myFile, std::ios::out | std::ios::binary);
    outFile.write((char *) ws.c_str(), ws.length() * sizeof(wchar_t));
    outFile.close();

}

int main()
{
    wstring sText = readUnicodeFile("input.txt");
    WriteUnicodetoFile("ouput.txt",  sText);
}
