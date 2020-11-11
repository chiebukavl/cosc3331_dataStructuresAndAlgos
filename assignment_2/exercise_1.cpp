// filename: exercise_1.cpp
// author: Chiebuka Lebechi
// modified: 23 September 2020
// purpose: 

#include <random>
#include <iostream>
using std::cout;
using std::cin;
using std::endl;


int main()
{
    int array[6][6];
    int arrayLength = sizeof(array)/sizeof(array[0]);

    srand(time(NULL));

    // initialize 6x6 array with random values from 1 to 7
    cout << "[ARRAY1 (original)]" << endl;
    for(auto i = 0; i < arrayLength; i++)
    {
        for(auto j = 0; j < arrayLength; j++)
        {
            array[i][j] = rand() % 7 + 1;
            cout << array[i][j] << " ";
        }
        cout << endl;
    }
    cout << "-----------------------" << endl;
    cout << endl;


    cout << "[ARRAY1 *= 2]" << endl;
    for(auto i = 0; i < arrayLength; i++)
    {
        for(auto j = 0; j < arrayLength; j++)
        {
            array[i][j] *= 2;
            cout << array[i][j] << " ";
        }
        cout << endl;
    }
    cout << "-----------------------" << endl;
    cout << endl;


    int array2[6][6] = {
        {1, 2, 3, 4, 5, 1},
        {0, 4, 3, 2, 1, 1},
        {3, 3, 3, 0, 5, 1},
        {4, 1, 1, 4, 5, 1},
        {1, 1, 1, 3, 2, 1},
        {2, 1, 2, 1, 2, 1}};

    int newArray[6][6];

    cout << "[ARRAY2 (given)]" << endl;
    for(auto i = 0; i < arrayLength; i++)
    {
        for(auto j = 0; j < arrayLength; j++)
        {
            cout << array2[i][j] << " ";
        }
        cout << endl;
    }
    cout << "-----------------------" << endl;
    cout << endl;
    
    cout << "[ARRAY1 * ARRAY2]" << endl;
    for(auto i = 0; i < arrayLength; i++)
    {
        for(auto j = 0; j < arrayLength; j++)
        {
            newArray[i][j] = array[i][j] * array2[i][j];
            cout << newArray[i][j] << " ";
        } 
        cout << endl;

    }
    cout << "-----------------------" << endl;
    cout << endl;
  



    
    
}