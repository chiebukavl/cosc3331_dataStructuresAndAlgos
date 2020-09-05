// filename: exercise_3.cpp
//   author: Chiebuka Lebechi
// modified: 4 September 2020
//  purpose: assignment 1 exercise 3 for COSC 3331: Data Structures and Algorithms. 

#include <iostream>
using std::cout;
using std::cin;
using std::endl;

// EXERCISE 3
auto arrayTune(int array[], int size)
{
    for(auto i =0; i < size; i++)
    {
        for(auto j=0; j < size; j++)
        {
            if(array[i] >= array[j])
            {
                array[i] = array[i] +1;
            }
        }
    }

    return array;
}


int main()
{
    int size;

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

    cout << "OLD ARRAY: " << endl;
    // UNCOMMENT TO OUTPUT ARRAY TO CONSOLE (DEBUGGING)
    for(auto i=0; i < size; i++)
    {
        cout << array[i] << " | ";
    }
    cout << endl;
    cout << endl;

    auto newArray = arrayTune(array, size);

    cout << "NEW ARRAY: " << endl;
    // UNCOMMENT TO OUTPUT ARRAY TO CONSOLE (DEBUGGING)
    for(auto i=0; i < size; i++)
    {
        cout << newArray[i] << " | ";
    }
    cout << endl;
    cout << endl;

    return 0;
}




