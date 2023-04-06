#include <bits/stdc++.h>
using namespace std;
struct activity
{
    string description;
    int starting_time;
    int finishing_time;
};

bool comp (activity i,activity j)
{
    return (i.finishing_time<j.finishing_time);
}


int main()
{
    int number_of_activities;
    cout<<"Enter the number of activities : "<<"\n";
    cin>>number_of_activities;
    vector<activity> activities,final_acticities;

    activity temp;
    for(int i=0; i<number_of_activities; i++)
    {
        string s;
        char c;
        cin>>c;
        getline(cin,s);
        s = c+s;
        temp.description = s;
        cin>>temp.starting_time>>temp.finishing_time;
        activities.push_back(temp);
    }
    sort(activities.begin(), activities.end(), comp);

    int i = 0 ;
    final_acticities.push_back(activities[i]);
    for(int j = 1 ; j < number_of_activities ; j++)
    {
        if(activities[j].starting_time >= activities[i].finishing_time)
        {
            final_acticities.push_back(activities[j]);
            i = j;
        }
    }
    cout<<"The maximum number of work is : ";
    cout<<final_acticities.size()<<"\n";
    int n = 1;
    for(auto u : final_acticities)
    {
        cout<<n<<".";
        n++;
        cout<<u.description<<" "<<u.starting_time<<" "<<u.finishing_time<<"\n";
    }

    return 0;
}
