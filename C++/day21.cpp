#include <iostream>
#include <vector>

using namespace std;

// Write your code here
template<class T>
void printArray(vector<T> v) {
    for (auto it = v.begin(); it != v.end(); ++it)
        cout << *it << endl;

    // Alternate method:
    //for (auto &it : v)
    //    cout << it << endl;
}

int main() {
    vector<int> vInt{1, 2, 3};
    vector<string> vString{"Hello", "World"};

    printArray<int>(vInt);
    printArray<string>(vString);

    return 0;
}