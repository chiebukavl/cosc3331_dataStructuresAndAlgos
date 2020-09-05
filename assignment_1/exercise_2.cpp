// filename: exercise_2.cpp
//   author: Chiebuka Lebechi
// modified: 4 September 2020
//  purpose: assignment 1 exercise 2 for COSC 3331: Data Structures and Algorithms. 

#include <iostream>
using std::cout;
using std::cin;
using std::endl;

// EXERCISE 2: Find max term in given array
int findMax(int array[], int size)
{
    auto currentMax = array[0];

    for(auto i =0; i < size; i++)
    {
        if(array[i] > currentMax)
        {
            currentMax = array[i];
        }
    }

    return currentMax;
}


int main()
{
    int size;
    int arrayMax;

    cout << "This program finds the maximum value in an array of random numbers." << endl;
    cout << endl;
    
    // user input
    cout << "Enter the size of the array: ";
    cin >> size;

    // creates array with desired size
    int array[size];

    srand(time(NULL));

    // initializes array with random values
    for(auto i=0; i < size; i++)
    {
        array[i] = rand()%50000 + 1;
    }

    // UNCOMMENT TO OUTPUT ARRAY TO CONSOLE (DEBUGGING)
    // for(auto i=0; i < size; i++)
    // {
    //     cout << array[i] << " | ";
    // }
    // cout << endl;
    // cout << endl;

    // calls findMax to search for max value in array
    arrayMax = findMax(array, size);

    cout << "The max value in the array is " << arrayMax << ". " << endl;

    return 0;
}




