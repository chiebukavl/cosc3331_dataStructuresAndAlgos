// filename: exercise_1.cpp
//   author: Chiebuka Lebechi
// modified: 4 September 2020
//  purpose: assignment 1, exercise 1 for COSC 3331: Data Structures and Algorithms. 

#include <iostream>
using std::cout;
using std::cin;
using std::endl;


// EXERCISE 1 : Linear Search Algorithm
// Complexity: O(n) 
int linearSearch(int key, int array[], int size)
{
    for(auto i = 0; i < size; i++)
    {
        if(array[i] == key)
        {
            return i;
        }
    }
    return -1;
}


int main()
{
    int size;
    int key;
    int index;

    cout << "Linear Search algorithm: " << endl;
    cout << "This program linearly searches an array of random numbers for a given key." << endl;
    cout << endl;
    
    // user input
    cout << "Enter the size of the array: ";
    cin >> size;

    cout << "Enter the desired key: ";
    cin >> key;
    cout << endl;

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

    // calls linearSearch to search for key in array
    index = linearSearch(key, array, size);


    if(index == -1)
    {
        cout << "Key not found." << endl;
        return 0;
    }

    cout << "Key found at index " << index << ". " << endl;

    return 0;
}